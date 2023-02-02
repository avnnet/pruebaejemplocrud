package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Tabla1;

@Repository
public interface EjemploRepository extends MongoRepository<Tabla1, String> {

	Optional<Tabla1> findByRut(String rut);
	
}
