package com.villadev.apispa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.villadev.apispa.dominio.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>  {

}
