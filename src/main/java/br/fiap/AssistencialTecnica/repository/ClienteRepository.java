package br.fiap.AssistencialTecnica.repository;

import br.fiap.AssistencialTecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
