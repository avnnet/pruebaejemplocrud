package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EjemploRepository;

import model.Tabla1;

@Service
public class EjemploService {

	
	@Autowired
	EjemploRepository repositoEjemplo;
	
	public List<Tabla1> consultaEjemplo()
	{
		return repositoEjemplo.findAll();
	}

	public void creaEjemplo(String rut) {
		// TODO Auto-generated method stub
		
		Tabla1 t = new Tabla1();
		t.setRut("123456-7");
			
		t = repositoEjemplo.save(t);
		System.out.println(t.toString());
	}
	
	public void updateEjemplo(String id, String id2) {
	   
	   Optional<Tabla1> tabla = repositoEjemplo.findByRut(id);
	   
	   tabla.ifPresent(t -> {
		   System.out.println("tabla:" + t.getRut());
		   t.setRut(id2);
		   Tabla1 t3 = repositoEjemplo.save(t);
		   String t2 = t3.getRut();
		   System.out.println("tabla:" + t3.toString());
		   });
	   
	}
	
	
}
