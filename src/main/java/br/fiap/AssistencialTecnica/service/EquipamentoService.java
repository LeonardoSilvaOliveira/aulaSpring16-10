package br.fiap.AssistencialTecnica.service;

import br.fiap.AssistencialTecnica.domain.Equipamento;
import br.fiap.AssistencialTecnica.repository.EquipamentoRepository;
import br.fiap.AssistencialTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {

    private final EquipamentoRepository EquipamentoRepository;
    private final EquipamentoRepository ClienteRepository;

    public EquipamentoService(EquipamentoRepository repository, EquipamentoRepository clienteRepository) {
        this.EquipamentoRepository = repository;
        this.ClienteRepository = clienteRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO equipamentoDTO){

    }
}
