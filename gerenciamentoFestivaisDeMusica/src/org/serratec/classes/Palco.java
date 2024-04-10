package org.serratec.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade;
	private List<Show> horarios = new ArrayList<>();
	
	public Palco(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public List<Show> getHorarios(){
		return horarios;
	}

	public void setHorarios(List<Show> horarios) {
		this.horarios = horarios;
	}

	public void imprimeHorarios() {
		for (Show item : horarios) {
			System.out.println(item);
		}
	}
	
	public void adicionaHorario(Show horario) {
		horarios.add(horario);
	}
	
	@Override
	public String toString() {
		return (getNome() + "\nCapacidade: " + getCapacidade());
	}
	
		
	
}
