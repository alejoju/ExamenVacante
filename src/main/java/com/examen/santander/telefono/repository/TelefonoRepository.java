package com.examen.santander.telefono.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.santander.telefono.entity.TelefonoEntity;


@Repository
public interface TelefonoRepository extends JpaRepository<TelefonoEntity,  Integer> {
	
	List<TelefonoEntity> findByImei(Long imei);
	
	Optional<TelefonoEntity> getByImei(Long imei);
	
}
