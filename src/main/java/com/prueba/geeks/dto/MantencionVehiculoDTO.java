package com.prueba.geeks.dto;

import java.sql.Date;

public class MantencionVehiculoDTO extends VehiculoDTO {

	private Long id;
	
	private VehiculoDTO vehiculo;
	
    private Date fechaMantencion;
	
	private Boolean cambioAceite;
	
	private Boolean parabrisas;
	
	private Boolean filtroAire;
	
	private Boolean frenos;
	
	private String observacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaMantencion() {
		return fechaMantencion;
	}

	public void setFechaMantencion(Date fechaMantencion) {
		this.fechaMantencion = fechaMantencion;
	}

	public Boolean getCambioAceite() {
		return cambioAceite;
	}

	public void setCambioAceite(Boolean cambioAceite) {
		this.cambioAceite = cambioAceite;
	}

	public Boolean getParabrisas() {
		return parabrisas;
	}

	public void setParabrisas(Boolean parabrisas) {
		this.parabrisas = parabrisas;
	}

	public Boolean getFiltroAire() {
		return filtroAire;
	}

	public void setFiltroAire(Boolean filtroAire) {
		this.filtroAire = filtroAire;
	}

	public Boolean getFrenos() {
		return frenos;
	}

	public void setFrenos(Boolean frenos) {
		this.frenos = frenos;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	
	
}
