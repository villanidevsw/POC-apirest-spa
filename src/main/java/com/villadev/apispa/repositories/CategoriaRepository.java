package com.villadev.apispa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.villadev.apispa.dominio.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>  {

}
