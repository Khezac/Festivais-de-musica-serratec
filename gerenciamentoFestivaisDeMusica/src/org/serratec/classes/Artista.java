package org.serratec.classes;

public abstract class Artista {
	private String nome;
	private double cache;
	private Genero genero;
	
	public enum Genero {
		POP,
		ROCK,
		POPROCK,
		FUNK,
		ELETRONICA,
		TECNOBREGA;
	}

	public Artista(String nome, double cache, Genero genero) {
		this.nome = nome;
		this.cache = cache;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}
	
	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	};

	@Override
	public String toString() {
		return String.format(nome);
	}
	
}
