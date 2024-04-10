package org.serratec.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.serratec.classes.Artista;
import org.serratec.classes.Artista.Genero;
import org.serratec.classes.Banda;
import org.serratec.classes.Cantor;
import org.serratec.classes.Palco;
import org.serratec.classes.Show;

public class Festival {
	public static void main(String[] args) {
		List<Show> shows1 = new ArrayList<>();
		List<Show> shows2 = new ArrayList<>();
		List<Show> shows3 = new ArrayList<>();
		
		Artista artista1 = new Cantor("Iza",2000,Genero.POP);
		Artista artista2 = new Banda("Red Hot Chilli Pepper",10000,Genero.POPROCK,5);
		Artista artista3 = new Cantor("Ludmilla",3000,Genero.FUNK);
		
		Artista artista4 = new Banda("The Cure",12000,Genero.ROCK,4);
		Artista artista5 = new Banda("Barões da pisadinha",39000,Genero.TECNOBREGA,2);
		
		Artista artista6 = new Cantor("MC Daniel",13000,Genero.FUNK);
		Artista artista7 = new Cantor("MC Ryan de SP",20000,Genero.FUNK);

		Show show1 = new Show(artista1,LocalDate.of(2024,5,20),LocalTime.of(19, 0));
		Show show2 = new Show(artista2,LocalDate.of(2024,5,20),LocalTime.of(22, 0));
		Show show3 = new Show(artista3,LocalDate.of(2024,5,20),LocalTime.of(18, 0));
		
		Show show4 = new Show(artista4,LocalDate.of(2024,5,21),LocalTime.of(23, 0));
		Show show5 = new Show(artista5,LocalDate.of(2024,5,21),LocalTime.of(20, 0));
		
		Show show6 = new Show(artista6,LocalDate.of(2024,5,22),LocalTime.of(23, 0));
		Show show7 = new Show(artista7,LocalDate.of(2024,5,22),LocalTime.of(20, 0));
		
		shows1.add(show1);
		shows1.add(show2);
		shows1.add(show3);
		
		shows2.add(show4);
		shows2.add(show5);
		
		shows3.add(show6);
		shows3.add(show7);
		
		Palco palco1 = new Palco("Palco Principal",20000);
		Palco palco2 = new Palco("Palco Bandas",18000);
		Palco palco3 = new Palco("Palco Funk",17000);
		
		
		//Adiciona show individualmente
		/*
		palco1.adicionaHorario(show1);
		palco1.adicionaHorario(show2);
		palco1.adicionaHorario(show3);
		
		palco2.adicionaHorario(show4);
		palco2.adicionaHorario(show5);
		
		palco3.adicionaHorario(show6);
		palco3.adicionaHorario(show7);
		*/
		
		//Adiciona todos os shows de uma vez
		palco1.setHorarios(shows1);
		palco2.setHorarios(shows2);
		palco3.setHorarios(shows3);

		//Exibição
		System.out.println(palco1);
		palco1.imprimeHorarios();
		
		System.out.println("\n" + palco2);
		palco2.imprimeHorarios();
		
		System.out.println("\n" + palco3);
		palco3.imprimeHorarios();
	
	}
}
