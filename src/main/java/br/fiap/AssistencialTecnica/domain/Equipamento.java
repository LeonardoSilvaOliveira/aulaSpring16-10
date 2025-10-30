package br.fiap.AssistencialTecnica.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_CLIENTE", foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE"))
    private Cliente cliente;
    @Column(name = "TIPO", length = 50, nullable = false)
    private String tipo;
    @Column(name = "MARCA", length = 50)
    private String marca;
    @Column(name = "MODELO", length = 50)
    private String modelo;
    @Column(name = "NUMERO_SERIE", length = 80, unique = true)
    private String numeroSerie;
    @Column(name = "DATA_CADASTRO",nullable = false)
    private LocalDate dataCadastro;


}
