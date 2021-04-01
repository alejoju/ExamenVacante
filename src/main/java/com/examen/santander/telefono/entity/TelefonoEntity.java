package com.examen.santander.telefono.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="TEL_CRTRCS_DEV")
@Table(name = "TEL_CRTRCS_DEV", schema = "seus")
public class TelefonoEntity {

	@Id
	@Column( name="IMEI", length = 15 )
	private Long imei;
	
	@Column( name="NOMBRE_MARCA", length = 60)
	private String nombreMarca;
	
	@Column( name="MODELO", length = 40)
	private String modelo;
	
	@Column( name="NOMBRE_CORTO", length = 30)
	private String nombreCorto;
	
	@Column( name="FEC_ALTA")
	private Date fecAlta;
	
	@Column( name="NUM_CEL", length = 10)
	private Long numCel;
	
	@Column( name="EMAIL", length = 150)
	private String email;
	
	@Column( name="OS")
	private boolean os;
	

	/**
	 * @return the imei
	 */
	public Long getImei() {
		return imei;
	}

	/**
	 * @param imei the imei to set
	 */
	public void setImei(Long imei) {
		this.imei = imei;
	}

	/**
	 * @return the nombreMarca
	 */
	public String getNombreMarca() {
		return nombreMarca;
	}

	/**
	 * @param nombreMarca the nombreMarca to set
	 */
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the nobreCorto
	 */
	public String getNombreCorto() {
		return nombreCorto;
	}

	/**
	 * @param nobreCorto the nobreCorto to set
	 */
	public void setNombreCorto(String nobreCorto) {
		this.nombreCorto = nobreCorto;
	}

	/**
	 * @return the fecAlta
	 */
	public Date getFecAlta() {
		return fecAlta;
	}

	/**
	 * @param fecAlta the fecAlta to set
	 */
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	/**
	 * @return the numCel
	 */
	public Long getNumCel() {
		return numCel;
	}

	/**
	 * @param numCel the numCel to set
	 */
	public void setNumCel(Long numCel) {
		this.numCel = numCel;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the os
	 */
	public boolean getOs() {
		return os;
	}

	/**
	 * @param os the os to set
	 */
	public void setOs(boolean os) {
		this.os = os;
	}
	
	
}
