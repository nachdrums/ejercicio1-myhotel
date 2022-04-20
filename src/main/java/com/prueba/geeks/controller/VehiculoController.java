package com.prueba.geeks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.geeks.dto.MantencionVehiculoDTO;
import com.prueba.geeks.dto.ResponseAPI;
import com.prueba.geeks.model.MantencionVehiculo;
import com.prueba.geeks.model.Vehiculo;
import com.prueba.geeks.service.VehiculoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

	private ResponseAPI response = new ResponseAPI();
	
	@Autowired
	private VehiculoService vehiculoService;

	@ApiOperation(
	        value = "Retorna un registro de Vehículo según el parametro id",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro encontrado"),
	        @ApiResponse(code = 404, message = "Registro no encontrado")})
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable("id") long id) {

		Vehiculo c = vehiculoService.get(id);
		if (c != null) {
			this.response.setData((Object) c);
			this.response.setMessage("operación realizada exitosamente");
			this.response.setSuccess(true);
		} else {
			this.response.setData(null);
			this.response.setMessage("ha sucedido un error inesperado");
			this.response.setSuccess(false);

		}
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);
	}

	@ApiOperation(
	        value = "Retorna una lista de Vehículos",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registros encontrados"),
	        @ApiResponse(code = 404, message = "Ningun registro encontrado")})
	@GetMapping(value = "/list")
	public ResponseEntity<?> list() {
		
		List<Vehiculo> list = vehiculoService.list();
		this.response.setData((Object) list);
		this.response.setMessage("operación realizada exitosamente");
		this.response.setSuccess(true);
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);

	}

	@ApiOperation(
	        value = "Retorna una lista de Mantenciones",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registros encontrados"),
	        @ApiResponse(code = 404, message = "Ningun registro encontrado")})
	@GetMapping(value = "/mantencion/list")
	public ResponseEntity<?> mantencionList() {
		
		List<MantencionVehiculo> list = vehiculoService.listMantenciones();
		this.response.setData((Object) list);
		this.response.setMessage("operación realizada exitosamente");
		this.response.setSuccess(true);
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);

	}
	
	@ApiOperation(
	        value = "Retorna un registro de Mantenciones según el parametro de id de vehículo",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro encontrado"),
	        @ApiResponse(code = 404, message = "Registro no encontrado")})
	@RequestMapping(value = "/mantencion/getbyvehiculo/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getMantencionesByVehiculo(@PathVariable("id") long id) {

		List<MantencionVehiculo> list = vehiculoService.getMantencionesByVehiculo(id);
		this.response.setData((Object) list);
		this.response.setMessage("operación realizada exitosamente");
		this.response.setSuccess(true);
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);

	}
	
	@ApiOperation(
	        value = "Guarda un registro de Mantenciones",
	        notes = "Retorna 404 si guarda nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro guardado exitosamente"),
	        @ApiResponse(code = 404, message = "Registro no guardado")})
	@RequestMapping(value = "/mantencion/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveMantencion(@RequestBody MantencionVehiculoDTO mantencion) {

		if (vehiculoService.saveMantencion(mantencion)) {
			this.response.setData((Object) mantencion);
			this.response.setMessage("operación realizada exitosamente");
			this.response.setSuccess(true);
		} else {
			this.response.setData(null);
			this.response.setMessage("ha sucedido un error inesperado");
			this.response.setSuccess(false);
		}
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);
	}
	
	@ApiOperation(
	        value = "Actualiza un registro de Mantención según el parámetro id",
	        notes = "Retorna 404 si no ha actualizado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro actualizado correctamente"),
	        @ApiResponse(code = 404, message = "Registro no actualizado")})
	@RequestMapping(value = "/mantencion/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateMantencionVehiculo(@PathVariable("id") Long id, @RequestBody MantencionVehiculoDTO mantencion) {

		if (vehiculoService.updateMantencionVehiculo(id,mantencion)) {
			this.response.setData((Object) mantencion);
			this.response.setMessage("operación realizada exitosamente");
			this.response.setSuccess(true);
		} else {
			this.response.setData(null);
			this.response.setMessage("ha sucedido un error inesperado");
			this.response.setSuccess(false);
		}
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);
	}

}

