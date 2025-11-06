package br.fiap.AssistencialTecnica.repository;

import br.fiap.AssistencialTecnica.domain.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

    public List<Equipamento> findByClienteId (long idCliente);
}
