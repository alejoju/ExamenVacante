package com.examen.santander.telefono.servicios;

import java.util.List;

import com.examen.santander.telefono.model.TelefonoModel;


public interface TelefonoService {

	List<TelefonoModel> consultarTels();
	TelefonoModel consultarTel(Long imei);
	void crearTel(TelefonoModel telefonoModel);
	void actualizarTel(TelefonoModel telefonoModel);
	void eliminarTel(Long imei);
	
	
}
