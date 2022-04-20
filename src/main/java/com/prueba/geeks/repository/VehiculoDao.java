package com.prueba.geeks.repository;

import org.springframework.data.repository.CrudRepository;

import com.prueba.geeks.model.Vehiculo;

public interface VehiculoDao extends CrudRepository<Vehiculo, Long> {

	

}
