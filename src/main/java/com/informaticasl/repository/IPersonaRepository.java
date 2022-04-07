package com.informaticasl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informaticasl.model.persona.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
