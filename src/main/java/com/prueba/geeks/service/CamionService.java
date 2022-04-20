package com.prueba.geeks.service;

import java.util.List;

import com.prueba.geeks.dto.CamionDTO;
import com.prueba.geeks.model.Camion;



public interface CamionService {
	public Camion get(long id);

	public List<Camion> list();

	public Boolean save(CamionDTO obj);
	
	public Boolean update(Long id, CamionDTO camion);

	public Boolean delete(Long id);
}
