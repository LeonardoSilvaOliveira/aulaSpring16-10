package br.fiap.AssistencialTecnica.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class EquipamentoDTO {
    private Long id;
    private String nome;
    private String setor;
    private String tipo;
    private String numeroSerie;
    private LocalDate dataCadastro;
}
