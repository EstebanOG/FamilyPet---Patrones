package edu.inventario.service;

import java.util.Optional;

import edu.inventario.entity.Producto;

public interface ProductoService {

	public Iterable<Producto> findAll();

	public Optional<Producto> findById(Long id);
}
