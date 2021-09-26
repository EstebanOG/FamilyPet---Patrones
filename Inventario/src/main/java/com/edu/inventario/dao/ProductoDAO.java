package com.edu.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.inventario.entity.Producto;

@Repository
public interface ProductoDAO extends JpaRepository<Producto, Long> {

}
