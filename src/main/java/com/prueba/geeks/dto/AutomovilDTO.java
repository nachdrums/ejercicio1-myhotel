package com.prueba.geeks.dto;

public class AutomovilDTO extends VehiculoDTO {

	private TipoAutomovilDTO tipoAutomovil;
	
	private String numeroPuertas;
	
	private String cantidadPasajeros;
	
	private String capacidadMaletero;

	public TipoAutomovilDTO getTipoAutomovil() {
		return tipoAutomovil;
	}

	public void setTipoAutomovil(TipoAutomovilDTO tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
	}

	public String getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(String cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public String getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(String capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
	
	
	
}
