package com.prueba.geeks.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "vehiculo", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "patente", nullable = false)
	private String patente;
	
	@JoinColumn(name = "id_modelo", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private Modelo modelo;
	
	@JoinColumn(name = "id_tipo_vehiculo", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private TipoVehiculo tipoVehiculo;

	@Column(name = "anio", nullable = false)
	private String anio;
	
	@Column(name = "kilometraje", nullable = false)
	private String kilometraje;
	
	@Column(name = "cilindrada", nullable = false)
	private String cilindrada;

	@Column(name = "activo", nullable = false)
	private Boolean activo;
	
	public Vehiculo() {
		
	}
	


	public Vehiculo(Long id, String patente, Modelo modelo, TipoVehiculo tipoVehiculo, String anio, String kilometraje,
			String cilindrada, Boolean activo) {
		super();
		this.id = id;
		this.patente = patente;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.anio = anio;
		this.kilometraje = kilometraje;
		this.cilindrada = cilindrada;
		this.activo = activo;
	}



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

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
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



	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}



	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	

}
