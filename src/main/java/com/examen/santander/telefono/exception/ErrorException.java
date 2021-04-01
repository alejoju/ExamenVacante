package com.examen.santander.telefono.exception;

/**
 * Clase para el manejo de mensajes de excepcion.
 * @author copil
 *
 */
public class ErrorException extends RuntimeException{

	/**
	 * serializable.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor de la clase.
	 * @param descError
	 */
	public ErrorException(String descError) {
		super("Error: " + descError);
	}

}
