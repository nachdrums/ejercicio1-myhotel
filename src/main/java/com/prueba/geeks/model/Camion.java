package com.prueba.geeks.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "camion", schema = "public")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Camion extends Vehiculo {


	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "id_tipo_camion", referencedColumnName = "id")
	@ManyToOne(optional = true)
	private TipoCamion tipoCamion;

	@Column(name = "cantidad_ejes", nullable = false)
	private String cantidadEjes;

	@Column(name = "capacidad_toneladas", nullable = false)
	private String capacidadToneladas;

	public Camion() {
		
	}


	public Camion(TipoCamion tipoCamion, String cantidadEjes, String capacidadToneladas) {
		super();
		this.tipoCamion = tipoCamion;
		this.cantidadEjes = cantidadEjes;
		this.capacidadToneladas = capacidadToneladas;
	}


	public TipoCamion getTipoCamion() {
		return tipoCamion;
	}

	public void setTipoCamion(TipoCamion tipoCamion) {
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
