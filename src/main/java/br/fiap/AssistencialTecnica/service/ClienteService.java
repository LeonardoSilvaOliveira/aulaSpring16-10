package br.fiap.AssistencialTecnica.service;

import br.fiap.AssistencialTecnica.domain.Cliente;
import br.fiap.AssistencialTecnica.repository.ClienteRepository;
import br.fiap.AssistencialTecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository reposotory) {
        this.repository = reposotory;
    }
    public Cliente cadastrar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setSenha(clienteDTO.getSenha());
         return repository.save(cliente);
    }

    public List<Cliente>listar(){
        return repository.findAll();
    }


    public Cliente BuscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
