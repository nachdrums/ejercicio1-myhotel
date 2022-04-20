package com.prueba.geeks.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "automovil", schema = "public")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Automovil extends Vehiculo {


	private static final long serialVersionUID = 1L;

	@Column(name = "nro_puertas", nullable = false)
	private String numeroPuertas;
	
	@JoinColumn(name = "id_tipo_automovil", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private TipoAutomovil tipoAutomovil;

	@Column(name = "cantidad_pasajeros", nullable = false)
	private String cantidadPasajeros;

	@Column(name = "capacidad_maletero", nullable = false)
	private String capacidadMaletero;
	
	public Automovil() {
		
	}


	public Automovil(String numeroPuertas, TipoAutomovil tipoAutomovil, String cantidadPasajeros,
			String capacidadMaletero) {
		super();
		this.numeroPuertas = numeroPuertas;
		this.tipoAutomovil = tipoAutomovil;
		this.cantidadPasajeros = cantidadPasajeros;
		this.capacidadMaletero = capacidadMaletero;
	}



	public String getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public TipoAutomovil getTipoAutomovil() {
		return tipoAutomovil;
	}

	public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
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
