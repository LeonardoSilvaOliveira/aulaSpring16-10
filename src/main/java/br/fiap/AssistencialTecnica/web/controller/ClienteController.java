package br.fiap.AssistencialTecnica.web.controller;

import br.fiap.AssistencialTecnica.domain.Cliente;
import br.fiap.AssistencialTecnica.service.ClienteService;
import br.fiap.AssistencialTecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service){
        this.service = service;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody ClienteDTO clienteDTO){
        return service.cadastrar(clienteDTO);
    }
    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }
    @GetMapping("{/id}")
    public Cliente BuscarPorId(@PathVariable Long id){
        return service.BuscarPorId(id);
    }
}
