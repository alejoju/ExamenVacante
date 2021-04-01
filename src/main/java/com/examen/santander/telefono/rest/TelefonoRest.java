package com.examen.santander.telefono.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examen.santander.telefono.model.TelefonoModel;
import com.examen.santander.telefono.servicios.TelefonoService;


@RestController
@RequestMapping("/rest/telefono")
public class TelefonoRest {

	@Autowired
	private TelefonoService telefonoService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TelefonoModel> consultarTels(){
		return telefonoService.consultarTels();
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping( value = "/imei", produces = MediaType.APPLICATION_JSON_VALUE)
	public TelefonoModel consultarXImei(@RequestParam(required = true) Long imei ){
		System.out.println( "Entrada Telefonos Mueble ::::  "+ imei );
		return telefonoService.consultarTel(imei);
	}
	
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	@PutMapping
	public void actualizarTel(@Valid @RequestBody(required = true) TelefonoModel telefonoModel) {
		telefonoService.actualizarTel(telefonoModel);
		
	}
	
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	@PostMapping
	public void insertarTel(@Valid @RequestBody(required = true) TelefonoModel telefonoModel) {
		telefonoService.crearTel(telefonoModel);
		
	}
	
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	@DeleteMapping
	public void eliminarTel(@RequestParam(required = true) Long imei) {
		telefonoService.eliminarTel(imei);
		
	}
	
	
}
