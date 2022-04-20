package com.prueba.geeks.service;

import java.text.ParseException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.geeks.dto.CamionDTO;
import com.prueba.geeks.model.Camion;
import com.prueba.geeks.repository.CamionDao;

@Service
public class CamionServiceImpl implements CamionService {
	private static final Logger logger = LoggerFactory.getLogger(CamionServiceImpl.class);

	@Autowired
	private CamionDao camionDao;

	@Autowired
	private ModelMapper modelMapper;

	@Transactional
	public Camion get(long id) {
		return camionDao.findById(id).get();
	}

	@Transactional
	public List<Camion> list() {
		logger.info("[obtener lista de camion]");

		List<Camion> lista = (List<Camion>) camionDao.findAll();

		return lista;
	}

	@Transactional
	public Boolean save(CamionDTO obj) {
		Boolean exito = false;
		try {

				Camion camion = convertCamionToEntity(obj);

			camionDao.save(camion);
			exito = true;
		} catch (Exception e) {
			logger.error("[Error, {}]", e);
		}

		return exito;
	}
	
	@Transactional
	public Boolean update(Long id, CamionDTO camionDTO) {
		Boolean exito = false;
		try {
			if (id != null) {
				if(camionDao.findById(id).isPresent()) {
					Camion camion = convertCamionToEntity(camionDTO);
					camionDao.save(camion);
					exito = true;
				}	
			}

		} catch (Exception e) {
			//logger.error("[Error, {}]", e);
			exito= false;
		}

		return exito;
	}

	@Transactional
	public Boolean delete(Long id) {
		Boolean exito = false;
		try {
			if (id != null) {
				Camion camion = camionDao.findById(id).get();
				 camionDao.delete(camion);
				 exito = true;
			}

		} catch (Exception e) {
			exito= false;
		}

		return exito;

	}
	
	private Camion convertCamionToEntity(CamionDTO camionDto) throws ParseException {
		Camion camion = modelMapper.map(camionDto, Camion.class);
		return camion;
	}
}
