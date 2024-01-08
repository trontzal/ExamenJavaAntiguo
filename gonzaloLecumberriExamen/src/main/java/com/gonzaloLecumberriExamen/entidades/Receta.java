package com.gonzaloLecumberriExamen.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Receta {
	private Long id;
	private String nombre;
	private String dificultad;
}
