package com.mg.dao;


import com.mg.domain.Persona;
import org.springframework.data.repository.CrudRepository;
// extends Crud, hay que indicar la clase y el tipo de dato de la llave primaria
public interface PersonaDao extends CrudRepository<Persona, Long> {

}
