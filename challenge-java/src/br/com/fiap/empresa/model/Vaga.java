package br.com.fiap.empresa.model;

public class Vaga {

	private String requisitos;

	// Construtor que utilizando também herança da classe cargo
	public Vaga( String requisitos) {
		this.requisitos = requisitos;
	}
	
	// Construtor que utilizando também herança da classe cargo
//		public Vaga() {	
//		}

	// Getters and Setters
	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

}
