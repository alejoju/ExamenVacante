package com.examen.santander.telefono.serviciosImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.examen.santander.telefono.entity.TelefonoEntity;
import com.examen.santander.telefono.exception.ErrorException;
import com.examen.santander.telefono.model.TelefonoModel;
import com.examen.santander.telefono.repository.TelefonoRepository;
import com.examen.santander.telefono.servicios.TelefonoService;

@Service
public class TelefonoServiceImpl implements TelefonoService {

	@Autowired
	private TelefonoRepository repository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	
	@Override
	public List<TelefonoModel> consultarTels() {
		
		List<TelefonoEntity> listEnti = repository.findAll();
		List<TelefonoModel> models = null;
		TelefonoModel telefonoModel = null;
		
		if (!ObjectUtils.isEmpty(listEnti)) {
			models = new ArrayList<>();
			
			for (TelefonoEntity telefonoEntity : listEnti) {
				telefonoModel = modelMapper.map(telefonoEntity, TelefonoModel.class);
				models.add(telefonoModel);
			}
		}
		
		return models;
	}

	@Override
	public TelefonoModel consultarTel(Long imei) {
		
		Optional<TelefonoEntity> optional = repository.getByImei(imei);
		if (optional.isPresent()) {
			TelefonoModel telefonoModel = modelMapper.map(optional.get(), TelefonoModel.class);
			return telefonoModel;
		} else {
			throw new ErrorException("El telefono no existe.");
		}
		
	}

	@Override
	public void crearTel(TelefonoModel telefonoModel) {
		System.out.println("Crear -> IMEI: " + telefonoModel.getImei());
		Optional<TelefonoEntity> optional = repository.getByImei(telefonoModel.getImei());
		if (optional.isPresent()) {
			throw new ErrorException("El IMEI ya esta registrado en a base de datos.");
		} else {
			TelefonoEntity telefonoEntity = modelMapper.map(telefonoModel, TelefonoEntity.class);
			repository.save(telefonoEntity);
		}
		
	}
	
	@Override
	public void actualizarTel(TelefonoModel telefonoModel) {
		Optional<TelefonoEntity> optional = repository.getByImei(telefonoModel.getImei());
		if (optional.isPresent()) {
			TelefonoEntity telefonoEntity = modelMapper.map(telefonoModel, TelefonoEntity.class);
			repository.save(telefonoEntity);
		} else {
			throw new ErrorException("No fue posible actualizar el telefono");
		}
		
	}

	@Override
	public void eliminarTel(Long imei) {
		TelefonoEntity entity = new TelefonoEntity();
		entity.setImei(imei);
		repository.delete(entity);
	}

}
