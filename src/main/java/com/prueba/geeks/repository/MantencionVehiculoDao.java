package com.prueba.geeks.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prueba.geeks.model.MantencionVehiculo;
import com.prueba.geeks.model.Vehiculo;

public interface MantencionVehiculoDao extends CrudRepository<MantencionVehiculo, Long> {

	List<MantencionVehiculo> findByVehiculo(Vehiculo vehiculo);

}
