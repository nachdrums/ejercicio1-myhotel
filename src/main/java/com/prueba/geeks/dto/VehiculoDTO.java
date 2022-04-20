package com.prueba.geeks.dto;

public class VehiculoDTO {

	private Long id;
	
	private String patente;
	
	private ModeloDTO modelo;
	
	private TipoVehiculoDTO tipoVehiculo;
	
	private String anio;
	
	private String Kilometraje;
	
	private String cilindrada;
	
	private Boolean activo;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public ModeloDTO getModelo() {
		return modelo;
	}

	public void setModelo(ModeloDTO modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getKilometraje() {
		return Kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		Kilometraje = kilometraje;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TipoVehiculoDTO getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculoDTO tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	
	
	
}
