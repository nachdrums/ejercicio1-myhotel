package com.prueba.geeks.repository;

import org.springframework.data.repository.CrudRepository;

import com.prueba.geeks.model.Automovil;

public interface AutomovilDao extends CrudRepository<Automovil, Long> {

	

}
