package com.examen.santander.telefono.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TelefonoModel implements Serializable{

	/**
	 * serial.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * identidad internacional de equipo movil.
	 */
	@NotNull
	private Long imei;
	
	/**
	 * Nombre Marca.
	 */
	@NotNull
	@Size(max = 60, message="Nombre marca debe contener máximo 60 caracteres.")
	private String nombreMarca;
	
	/**
	 * Modelo del telefono.
	 */
	@NotNull
	@Size(max = 40, message="Modelo teléfono debe contener máximo 40 caracteres.")
	private String modelo;
	
	/**
	 * Nombre corto del telefono.
	 */
	@NotNull
	@Size(max = 30, message="Nombre corto del teléfono debe contener máximo 30 caracteres.")
	private String nombreCorto;
	
	/**
	 * Fecha de creacion registro.
	 */
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "Mexico/General")
	private Date fecAlta;
	
	/**
	 * Numero del telefono.
	 */
	private Long numCel;
	
	/**
	 * Correo Electronico.
	 */
	@Email(message = "Correo mal formado.")
	private String email;
	
	/**
	 * Sitema operativo.
	 */
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
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
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