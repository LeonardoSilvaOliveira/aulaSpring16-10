package br.fiap.AssistencialTecnica.repository;

import br.fiap.AssistencialTecnica.domain.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

}
