package com.prueba.geeks.service;

import java.util.List;

import com.prueba.geeks.dto.AutomovilDTO;
import com.prueba.geeks.model.Automovil;



public interface AutomovilService {
	public Automovil get(long id);

	public List<Automovil> list();

	public Boolean save(AutomovilDTO obj);
	
	public Boolean update(Long id, AutomovilDTO automovil);

	public Boolean delete(Long id);

}
