package com.prueba.geeks.dto;

public class CamionDTO {

	private TipoCamionDTO tipoCamion;
	
	private String cantidadEjes;
	
	private String capacidadToneladas;

	public TipoCamionDTO getTipoCamion() {
		return tipoCamion;
	}

	public void setTipoCamion(TipoCamionDTO tipoCamion) {
		this.tipoCamion = tipoCamion;
	}

	public String getCantidadEjes() {
		return cantidadEjes;
	}

	public void setCantidadEjes(String cantidadEjes) {
		this.cantidadEjes = cantidadEjes;
	}

	public String getCapacidadToneladas() {
		return capacidadToneladas;
	}

	public void setCapacidadToneladas(String capacidadToneladas) {
		this.capacidadToneladas = capacidadToneladas;
	}


	
	
}
