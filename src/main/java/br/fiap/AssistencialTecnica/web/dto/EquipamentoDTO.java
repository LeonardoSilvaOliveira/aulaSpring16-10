package br.fiap.AssistencialTecnica.web.dto;

import lombok.Data;

@Data
public class EquipamentoDTO {
    private Long id;
    private String nome;
    private String setor;
    private String tipo;
}
