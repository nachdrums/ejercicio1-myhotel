package com.prueba.geeks.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mantencion_vehiculo", schema = "public")
public class MantencionVehiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fecha", nullable = false)
	private Date fechaMantencion;
	
	@JoinColumn(name = "id_vehiculo", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private Vehiculo vehiculo;
	
	@Column(name = "cambio_aceite", nullable = false)
	private Boolean cambioAceite;
	
	@Column(name = "parabrisas", nullable = false)
	private Boolean parabrisas;
	
	@Column(name = "filtro_aire", nullable = false)
	private Boolean filtroAire;
	
	@Column(name = "frenos", nullable = false)
	private Boolean frenos;
	
	@Column(name = "observacion", nullable = false)
	private String observacion;
	
	public MantencionVehiculo() {
		
	}

	public MantencionVehiculo(Long id, Date fechaMantencion, Vehiculo vehiculo, Boolean cambioAceite,
			Boolean parabrisas, Boolean filtroAire, Boolean frenos, String observacion) {
		super();
		this.id = id;
		this.fechaMantencion = fechaMantencion;
		this.vehiculo = vehiculo;
		this.cambioAceite = cambioAceite;
		this.parabrisas = parabrisas;
		this.filtroAire = filtroAire;
		this.frenos = frenos;
		this.observacion = observacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaMantencion() {
		return fechaMantencion;
	}

	public void setFechaMantencion(Date fechaMantencion) {
		this.fechaMantencion = fechaMantencion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
