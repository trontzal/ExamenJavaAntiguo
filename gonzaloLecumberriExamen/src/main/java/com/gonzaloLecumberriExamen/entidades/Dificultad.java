package com.gonzaloLecumberriExamen.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dificultad {
	private Long id;
	private String dificultad;
}
