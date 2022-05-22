package br.com.fiap.empresa.model;

public class Telefone {

	// Atributos
	private int empresarial;
	private int celular;

	// Construtores
	public Telefone() {
		super();
	}

	// Getters and Setters
	public int getEmpresarial() {
		return empresarial;
	}

	public void setEmpresarial(int empresarial) {
		this.empresarial = empresarial;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
}
