package com.informaticasl.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informaticasl.model.persona.Persona;
import com.informaticasl.service.persona.IPersonaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PersonaController {
	private final String URL_API = "SisJavaAngular";
	private final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);
	@Autowired
	IPersonaService iPersonaService;
	
	@GetMapping("/"+URL_API+"/personas")
	public List<Persona> listar(){
		LOGGER.info("Lista {}", iPersonaService.findAll() );
		return iPersonaService.findAll();	
	}
	
	@PostMapping("/"+URL_API+"/personas")
	public Persona save(@RequestBody Persona persona) {
		LOGGER.info("la persona a insertar {}", persona );
		return iPersonaService.save(persona);
	}
	
	
	@GetMapping("/"+URL_API+"/personas/{id}")
	public Optional<Persona> findByPrimaryKey(@PathVariable("id") Integer id){
		LOGGER.info("Persona {}", iPersonaService.get(id));
		return iPersonaService.get(id);	
	}
	
	@PutMapping("/"+URL_API+"/personas")
	public void update(@RequestBody Persona persona) {
			LOGGER.info("la persona a insertar {}", persona );
			iPersonaService.update(persona);
	}
	
	@DeleteMapping("/"+URL_API+"/personas/{id}")
	public void delete(@PathVariable("id") Integer id) {
		LOGGER.info("la persona a insertar {}", id );
		iPersonaService.delete(id);
	}

}
