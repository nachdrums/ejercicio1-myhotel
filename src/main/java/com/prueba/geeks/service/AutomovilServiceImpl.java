package com.prueba.geeks.service;

import java.text.ParseException;
import java.util.List;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.geeks.dto.AutomovilDTO;
import com.prueba.geeks.model.Automovil;
import com.prueba.geeks.repository.AutomovilDao;

@Service
public class AutomovilServiceImpl implements AutomovilService {
	private static final Logger logger = LoggerFactory.getLogger(AutomovilServiceImpl.class);

	@Autowired
	private AutomovilDao automovilDao;

	@Autowired
	private ModelMapper modelMapper;

	@Transactional
	public Automovil get(long id) {
		return automovilDao.findById(id).get();
	}

	@Transactional
	public List<Automovil> list() {
		logger.info("[obtener lista de automovil]");

		List<Automovil> lista = (List<Automovil>) automovilDao.findAll();

		return lista;
	}

	@Transactional
	public Boolean save(AutomovilDTO obj) {
		Boolean exito = false;
		try {

				Automovil auto = convertAutomovilToEntity(obj);

			automovilDao.save(auto);
			exito = true;
		} catch (Exception e) {
			logger.error("[Error, {}]", e);
		}

		return exito;
	}
	
	@Transactional
	public Boolean update(Long id, AutomovilDTO automovilDTO) {
		Boolean exito = false;
		try {
			if (id != null) {
				if(automovilDao.findById(id).isPresent()) {
					Automovil auto = convertAutomovilToEntity(automovilDTO);
					automovilDao.save(auto);
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
				if(automovilDao.findById(id).isPresent()) {
					Automovil automovil = automovilDao.findById(id).get();
					automovilDao.delete(automovil);
					exito = true;
				}	
			}

		} catch (Exception e) {
			//logger.error("[Error, {}]", e);
			exito= false;
		}

		return exito;

	}
	
	private Automovil convertAutomovilToEntity(AutomovilDTO automovilDto) throws ParseException {
		Automovil automovil = modelMapper.map(automovilDto, Automovil.class);
		return automovil;
	}

	
}
