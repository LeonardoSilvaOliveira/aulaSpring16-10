package br.fiap.AssistencialTecnica.web.controller;

import br.fiap.AssistencialTecnica.domain.Equipamento;
import br.fiap.AssistencialTecnica.service.EquipamentoService;
import br.fiap.AssistencialTecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipamento")
public class EquipementoController {
    private final EquipamentoService service;

    public EquipementoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento cadastrar(@RequestBody EquipamentoDTO equipamentoDTO){
        return service.cadastrar(equipamentoDTO);
    }

}
