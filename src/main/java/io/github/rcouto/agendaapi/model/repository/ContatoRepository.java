package io.github.rcouto.agendaapi.model.repository;

import io.github.rcouto.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
