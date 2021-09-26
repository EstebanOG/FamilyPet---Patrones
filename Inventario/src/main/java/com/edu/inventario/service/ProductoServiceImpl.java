package com.edu.inventario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.inventario.dao.ProductoDAO;
import com.edu.inventario.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDAO productoDAO;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findAll() {
		return productoDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id) {
		return productoDAO.findById(id);
	}

}
