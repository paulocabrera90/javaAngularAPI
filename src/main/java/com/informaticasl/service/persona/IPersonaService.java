package com.informaticasl.service.persona;

import java.util.List;
import java.util.Optional;

import com.informaticasl.model.persona.Persona;


public interface IPersonaService {
	
	public List<Persona> findAll();
	
	public Persona save(Persona persona);
	
	public Optional<Persona> get(Integer id);
	
	public void update(Persona persona);
	
	public void delete(Integer id);
}
