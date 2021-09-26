package com.edu.inventario.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.inventario.entity.Producto;
import com.edu.inventario.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;

	// Read all Products
	@GetMapping
	public List<Producto> readAll() {
		List<Producto> productos = StreamSupport.stream(productoService.findAll().spliterator(), false)
				.collect(Collectors.toList());

		return productos;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long productoId) {
		Optional<Producto> oProducto = productoService.findById(productoId);
		if (!oProducto.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oProducto);
	}
}
