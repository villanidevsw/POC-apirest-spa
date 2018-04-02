package com.villadev.apispa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.villadev.apispa.dominio.Marca;
import com.villadev.apispa.repositories.MarcaRepository;

@RestController
@RequestMapping("/marcas")
public class MarcaResource {
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	@GetMapping
	public ResponseEntity<?> abreTela(){
		List<Marca> marcas = marcaRepository.findAll();
		return new ResponseEntity<>(marcas, HttpStatus.OK);
	}
}
