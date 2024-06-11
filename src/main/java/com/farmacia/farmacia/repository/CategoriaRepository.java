package com.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.farmacia.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	
	public List<CategoriaModel> findAllByCategoriaContainingIgnoreCase(@Param("categoria") String categoria); 

}
