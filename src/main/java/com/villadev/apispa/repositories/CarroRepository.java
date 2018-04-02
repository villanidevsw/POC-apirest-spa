package com.villadev.apispa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.villadev.apispa.dominio.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>  {

}
