package edu.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.cableado.Inventariable;

@SpringBootApplication
public class Inventario implements Inventariable{


	@Override
	public void SubirApiInventario() {
		SpringApplication.run(Inventario.class);
	}
}
