package com.prueba.geeks.service;

import java.text.ParseException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.geeks.dto.MantencionVehiculoDTO;
import com.prueba.geeks.model.MantencionVehiculo;
import com.prueba.geeks.model.Vehiculo;
import com.prueba.geeks.repository.MantencionVehiculoDao;
import com.prueba.geeks.repository.VehiculoDao;

@Service
public class VehiculoServiceImpl implements VehiculoService {
	private static final Logger logger = LoggerFactory.getLogger(VehiculoServiceImpl.class);

	@Autowired
	private VehiculoDao vehiculoDao;
	
	@Autowired
	private MantencionVehiculoDao mantencionVehiculoDao;

	@Autowired
	private ModelMapper modelMapper;

	@Transactional
	public Vehiculo get(long id) {
		return vehiculoDao.findById(id).get();
	}

	@Transactional
	public List<Vehiculo> list() {
		logger.info("[obtener lista de vehiculo]");

		List<Vehiculo> lista = (List<Vehiculo>) vehiculoDao.findAll();

		return lista;
	}
	
	@Override
	public List<MantencionVehiculo> listMantenciones() {
		logger.info("[obtener lista de vehiculo]");

		List<MantencionVehiculo> lista = (List<MantencionVehiculo>) mantencionVehiculoDao.findAll();
		return lista;
	}

	@Override
	public List<MantencionVehiculo> getMantencionesByVehiculo(Long id) {
		logger.info("[obtener lista de vehiculo]");
		Vehiculo vehiculo = vehiculoDao.findById(id).get();
		List<MantencionVehiculo> lista = (List<MantencionVehiculo>) mantencionVehiculoDao.findByVehiculo(vehiculo);

		return lista;
	}

	@Override
	public Boolean saveMantencion(MantencionVehiculoDTO obj) {
		Boolean exito = false;
		try {
				MantencionVehiculo mantencion= convertMantencionVehiculoToEntity(obj);
				mantencionVehiculoDao.save(mantencion);
			exito = true;
		} catch (Exception e) {
			logger.error("[Error, {}]", e);
		}

		return exito;
	}
	
	@Transactional
	public Boolean updateMantencionVehiculo(Long id, MantencionVehiculoDTO mantencionDto) {
		Boolean exito = false;
		try {
			if (id != null) {
				if(mantencionVehiculoDao.findById(id).isPresent()) {
					MantencionVehiculo mantencion = convertMantencionVehiculoToEntity(mantencionDto);
					mantencionVehiculoDao.save(mantencion);
					exito = true;
				}	
			}

		} catch (Exception e) {
			//logger.error("[Error, {}]", e);
			exito= false;
		}

		return exito;
	}
	
	
	private MantencionVehiculo convertMantencionVehiculoToEntity(MantencionVehiculoDTO mantencionDto) throws ParseException {
		MantencionVehiculo mantencionVehiculo = modelMapper.map(mantencionDto, MantencionVehiculo.class);
		return mantencionVehiculo;
	}
}
