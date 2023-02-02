package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EjemploService;

import model.Tabla1;

import java.util.List;

@RestController
@RequestMapping(path="/buscar")
public class EjemploController {
	
	@Autowired
	EjemploService servicio;
	
	@GetMapping("/listaTabla1")
	public List<Tabla1> consultaEjemplo()
	{
		
		return servicio.consultaEjemplo();
		
		
	}
	
	@GetMapping("/creaTabla1")
	public String creaEjemplo()
	{
		
		servicio.creaEjemplo("1234");
		return "Ok";
		
		
	}
	
	@GetMapping("/updateTabla1")
	public String updateEjemplo()
	{		
		servicio.updateEjemplo("10224705-1", "10224705-2");
		return "Ok";		
		
	}
	
	

}
