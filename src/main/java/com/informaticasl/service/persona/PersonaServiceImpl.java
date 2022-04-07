package com.informaticasl.service.persona;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informaticasl.model.persona.Persona;
import com.informaticasl.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaRepository iPersonaRepository;

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return iPersonaRepository.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return iPersonaRepository.save(persona);
	}

	@Override
	public Optional<Persona> get(Integer id) {
		// TODO Auto-generated method stub
		return iPersonaRepository.findById(id);
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepository.save(persona);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		iPersonaRepository.deleteById(id);
	}

}
