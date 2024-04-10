package org.serratec.classes;

public class Banda extends Artista{
	int qtdIntegrantes;
	
	public Banda(String nome, double cache, Genero genero,int qtdIntegrantes) {
		super(nome, cache, genero);
		this.qtdIntegrantes = qtdIntegrantes;
	}
}
