package ifrn.pi.evento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.evento.models.Evento;
import ifrn.pi.evento.repositories.EventoRepositoy;

@Controller
public class EventosController {
	
	@Autowired
	private EventoRepositoy er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "evento-adicionado";
	}

}
