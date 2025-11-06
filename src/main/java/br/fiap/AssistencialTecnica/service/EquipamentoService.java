package br.fiap.AssistencialTecnica.service;

import br.fiap.AssistencialTecnica.domain.Equipamento;
import br.fiap.AssistencialTecnica.repository.EquipamentoRepository;
import br.fiap.AssistencialTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipamentoService {

    private final EquipamentoRepository EquipamentoRepository;
    private final EquipamentoRepository ClienteRepository;

    public EquipamentoService(EquipamentoRepository repository, EquipamentoRepository clienteRepository) {
        this.EquipamentoRepository = repository;
        this.ClienteRepository = clienteRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO equipamentoDTO){
        var cliente = ClienteRepository.findById(equipamentoDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException
                        ("Cliente não encontrado"));

        var equipamentoEntity = new Equipamento();
        equipamentoEntity.setCliente(cliente);
        equipamentoEntity.setMarca(equipamentoDTO.getMarca());
        equipamentoEntity.setModelo(equipamentoDTO.getModelo());
        equipamentoEntity.setTipo(equipamentoDTO.getTipo());
        equipamentoEntity.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamentoEntity.setDataCadastro(equipamentoDTO.getDataCadastro());
        return EquipamentoRepository.save(EquipamentoRepository.getReferenceById(cliente.getId()));
    }

}
