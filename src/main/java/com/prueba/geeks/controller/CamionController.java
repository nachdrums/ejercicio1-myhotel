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

import com.prueba.geeks.dto.CamionDTO;
import com.prueba.geeks.dto.ResponseAPI;
import com.prueba.geeks.model.Camion;
import com.prueba.geeks.service.CamionService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vehiculo/camion")
public class CamionController {

	private ResponseAPI response = new ResponseAPI();
	
	@Autowired
	private CamionService camionService;

	@ApiOperation(
	        value = "Retorna un registro de Camion según el parametro id",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro encontrado"),
	        @ApiResponse(code = 404, message = "Registro no encontrado")})
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable("id") long id) {

		Camion c = camionService.get(id);
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
	        value = "Retorna una lista de Camiones",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registros encontrados"),
	        @ApiResponse(code = 404, message = "Ningun registro encontrado")})
	@GetMapping(value = "/list")
	public ResponseEntity<?> list() {
		
		List<Camion> list = camionService.list();
		this.response.setData((Object) list);
		this.response.setMessage("operación realizada exitosamente");
		this.response.setSuccess(true);
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);

	}

	@ApiOperation(
	        value = "Guarda un registro de Camión",
	        notes = "Retorna 404 si guarda nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro guardado exitosamente"),
	        @ApiResponse(code = 404, message = "Registro no guardado")})
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody CamionDTO Camion) {

		if (camionService.save(Camion)) {
			this.response.setData((Object) Camion);
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
	        value = "Actualiza un registro de Camión según el parámetro id",
	        notes = "Retorna 404 si no ha actualizado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro actualizado correctamente"),
	        @ApiResponse(code = 404, message = "Registro no actualizado")})
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody CamionDTO camion) {

		if (camionService.update(id,camion)) {
			this.response.setData((Object) camion);
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
	        value = "Elimina un registro de Camión según el parametro id",
	        notes = "Retorna 404 si no ha eliminado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro eliminado"),
	        @ApiResponse(code = 404, message = "Registro no eliminado")})
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {

		this.response.setData(null);

		if (camionService.delete(id)) {
			this.response.setMessage("operación realizada exitosamente");
			this.response.setSuccess(true);
		} else {
			this.response.setMessage("ha sucedido un error inesperado");
			this.response.setSuccess(false);
		}
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);
	}

}

