package com.prueba.geeks.service;

import java.util.List;

import com.prueba.geeks.dto.MantencionVehiculoDTO;
import com.prueba.geeks.model.MantencionVehiculo;
import com.prueba.geeks.model.Vehiculo;



public interface VehiculoService {
	public Vehiculo get(long id);

	public List<Vehiculo> list();

	public List<MantencionVehiculo> listMantenciones();
	
	public List<MantencionVehiculo> getMantencionesByVehiculo(Long id);
	
	public Boolean saveMantencion(MantencionVehiculoDTO obj);
	
	public Boolean updateMantencionVehiculo(Long id, MantencionVehiculoDTO obj);
	
}
