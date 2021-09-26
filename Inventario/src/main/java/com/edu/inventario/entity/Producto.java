package com.edu.inventario.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

	@Id
	private Long K_ID;

	private String N_NOMBRE;

	private float Q_PRECIO;

	private String N_DESCRIPCION;

	private Long N_CATEGORIA;

	public Long getK_ID() {
		return K_ID;
	}

	public void setK_ID(Long k_ID) {
		K_ID = k_ID;
	}

	public String getN_NOMBRE() {
		return N_NOMBRE;
	}

	public void setN_NOMBRE(String n_NOMBRE) {
		N_NOMBRE = n_NOMBRE;
	}

	public float getQ_PRECIO() {
		return Q_PRECIO;
	}

	public void setQ_PRECIO(float q_PRECIO) {
		Q_PRECIO = q_PRECIO;
	}

	public String getN_DESCRIPCION() {
		return N_DESCRIPCION;
	}

	public void setN_DESCRIPCION(String n_DESCRIPCION) {
		N_DESCRIPCION = n_DESCRIPCION;
	}

	public Long getN_CATEGORIA() {
		return N_CATEGORIA;
	}

	public void setN_CATEGORIA(Long n_CATEGORIA) {
		N_CATEGORIA = n_CATEGORIA;
	}

}
