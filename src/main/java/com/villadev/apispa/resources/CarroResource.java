package com.villadev.apispa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.villadev.apispa.dominio.Carro;
import com.villadev.apispa.repositories.CarroRepository;

@RestController
@RequestMapping("/carros")
public class CarroResource {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping
	public ResponseEntity<?> abreTela(){
		List<Carro> carros = carroRepository.findAll();
		return new ResponseEntity<>(carros, HttpStatus.OK);
	}
}
