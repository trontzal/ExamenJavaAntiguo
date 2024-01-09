package com.gonzaloLecumberriExamen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gonzaloLecumberriExamen.entidades.Dificultad;
import com.gonzaloLecumberriExamen.entidades.Receta;
import com.gonzaloLecumberriExamen.logicanegocio.AdminNegocio;

@SpringBootApplication
public class GonzaloLecumberriExamenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GonzaloLecumberriExamenApplication.class, args);
	}

//	@Autowired
//	private  AdminNegocio admin;
	

	
	@Override
	public void run(String... args) throws Exception {
		  // Crear una nueva instancia de Receta con datos específicos
//		Receta nuevaReceta = Receta.builder().nombre("Tarta de chocolate").dificultad(Dificultad.builder().id(3L).build()).build();

	    // Intentar insertar la nueva receta
//	    admin.insertarReceta(nuevaReceta);
		
//		for (Receta p : admin.listadoRecetas()) {
//			System.out.println(p);
//		}

	}

}
