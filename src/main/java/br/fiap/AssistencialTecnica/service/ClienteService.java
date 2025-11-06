package br.fiap.AssistencialTecnica.service;

import br.fiap.AssistencialTecnica.domain.Cliente;
import br.fiap.AssistencialTecnica.domain.Equipamento;
import br.fiap.AssistencialTecnica.repository.ClienteRepository;
import br.fiap.AssistencialTecnica.repository.EquipamentoRepository;
import br.fiap.AssistencialTecnica.web.config.SenhaConfig;
import br.fiap.AssistencialTecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private  final ClienteRepository repository;
    private final EquipamentoRepository equipamentoRepository;
    private final SenhaConfig senhaConfig;
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository reposotory, EquipamentoRepository equipamentoRepository, SenhaConfig senhaConfig) {
        this.repository = reposotory;
        this.equipamentoRepository = equipamentoRepository;
        this.senhaConfig = senhaConfig;
    }
    public Cliente cadastrar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setSenha(senhaConfig.encoder().encode(clienteDTO.getSenha()));
         return repository.save(cliente);
    }

    public List<Cliente>listar(){
        return repository.findAll();
    }


    public Cliente BuscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }


}
