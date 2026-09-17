package ifrn.pi.evento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.evento.models.Convidado;
import ifrn.pi.evento.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
	
	List<Convidado> findByEvento (Evento evento);

}
