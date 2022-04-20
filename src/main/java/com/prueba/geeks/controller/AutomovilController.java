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

import com.prueba.geeks.dto.AutomovilDTO;
import com.prueba.geeks.dto.ResponseAPI;
import com.prueba.geeks.model.Automovil;
import com.prueba.geeks.service.AutomovilService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vehiculo/automovil")
public class AutomovilController {

	private ResponseAPI response = new ResponseAPI();
	
	@Autowired
	private AutomovilService automovilService;

	@ApiOperation(
	        value = "Retorna un registro de Automovil según el parametro id",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro encontrado"),
	        @ApiResponse(code = 404, message = "Registro no encontrado")})
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable("id") long id) {

		Automovil c = automovilService.get(id);
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
	        value = "Retorna una lista de Automoviles",
	        notes = "Retorna 404 si no ha retornado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registros encontrados"),
	        @ApiResponse(code = 404, message = "Ningun registro encontrado")})
	@GetMapping(value = "/list")
	public ResponseEntity<?> list() {
		
		List<Automovil> list = automovilService.list();
		this.response.setData((Object) list);
		this.response.setMessage("operación realizada exitosamente");
		this.response.setSuccess(true);
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);

	}

	@ApiOperation(
	        value = "Guarda un registro de Automovil",
	        notes = "Retorna 404 si guarda nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro guardado exitosamente"),
	        @ApiResponse(code = 404, message = "Registro no guardado")})
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody AutomovilDTO automovil) {

		if (automovilService.save(automovil)) {
			this.response.setData((Object) automovil);
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
	        value = "Actualiza un registro de Automovil según el parámetro id",
	        notes = "Retorna 404 si no ha actualizado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro actualizado correctamente"),
	        @ApiResponse(code = 404, message = "Registro no actualizado")})
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody AutomovilDTO automovil) {

		if (automovilService.update(id,automovil)) {
			this.response.setData((Object) automovil);
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
	        value = "Elimina un registro de Automovil según el parametro id",
	        notes = "Retorna 404 si no ha eliminado nada")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Registro eliminado"),
	        @ApiResponse(code = 404, message = "Registro no eliminado")})
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {

		this.response.setData(null);

		if (automovilService.delete(id)) {
			this.response.setMessage("operación realizada exitosamente");
			this.response.setSuccess(true);
		} else {
			this.response.setMessage("ha sucedido un error inesperado");
			this.response.setSuccess(false);
		}
		return new ResponseEntity<ResponseAPI>(this.response, HttpStatus.OK);
	}

}

