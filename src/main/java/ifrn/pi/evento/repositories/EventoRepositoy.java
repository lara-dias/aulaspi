package ifrn.pi.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.evento.models.Evento;

public interface EventoRepositoy extends JpaRepository<Evento, Long>{

}
