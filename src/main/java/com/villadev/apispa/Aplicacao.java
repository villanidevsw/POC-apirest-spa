package com.villadev.apispa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.villadev.apispa.dominio.Carro;
import com.villadev.apispa.dominio.Categoria;
import com.villadev.apispa.dominio.Marca;
import com.villadev.apispa.dominio.enums.TipoCategoria;
import com.villadev.apispa.repositories.CarroRepository;
import com.villadev.apispa.repositories.CategoriaRepository;
import com.villadev.apispa.repositories.MarcaRepository;

@SpringBootApplication
@RestController
public class Aplicacao implements CommandLineRunner {
	
	@Autowired
	CarroRepository carroRepository;
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	MarcaRepository marcaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Aplicacao.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Categoria categoriaEconomica = new Categoria(TipoCategoria.ECONOMICO);
		Categoria categoriaLuxo = new Categoria(TipoCategoria.LUXO);
		categoriaRepository.save(Arrays.asList(categoriaEconomica,categoriaLuxo));
		
		Marca chevrolet = new Marca("Chevrolet");
		Marca audi = new Marca("Audi");		
		marcaRepository.save(Arrays.asList(chevrolet,audi));
		
		Carro celta = new Carro.Builder("Celta", chevrolet, categoriaEconomica).build();
		Carro classic = new Carro.Builder("Corsa Classic", chevrolet, categoriaEconomica).cor("Prata").motor(1.0)
				.portas(4).potencia(78).build();
		
		Carro audiA3 = new Carro.Builder("Audi A3", audi, categoriaLuxo).build();		
		carroRepository.save(Arrays.asList(celta,classic,audiA3));
		

	}

}
