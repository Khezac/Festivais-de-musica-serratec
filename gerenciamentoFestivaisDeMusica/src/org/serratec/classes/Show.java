package org.serratec.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Show {
	private Artista artista;
	private LocalDate dia;
	private LocalTime horario;
	private String diaFormated;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Show(Artista artista, LocalDate dia, LocalTime horario) {
		this.artista = artista;
		this.dia = dia;
		this.horario = horario;
	}

	@Override
	public String toString() {
		this.diaFormated = dia.format(formatter);
		return String.format("%s - %s - %s",diaFormated,horario,artista.getNome());
	}
	
	
}
