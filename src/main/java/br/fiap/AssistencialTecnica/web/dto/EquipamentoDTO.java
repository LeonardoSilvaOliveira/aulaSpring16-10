package br.fiap.AssistencialTecnica.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/// ... dto é o obj que vai de um lugar para o outro
@Getter
@Setter
public class EquipamentoDTO {
    private Long id;
    private Long idCliente;
    private String nome;
    private String setor;
    private String tipo;
    private String numeroSerie;
    private LocalDate dataCadastro;
    private String Marca;
    private String modelo;
}
