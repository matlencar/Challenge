package br.com.fiap.empresa.model;

public class Cargo {

	// Atributos
	private String nomeDoCargo;
	private String funcao;
	private String comportamental;
	private String pessoal;
	private String profissional;

	// Construtores para dun~çao do estagiario na empresa
	public Cargo( String funcao,String nomeDoCargo) {
		this.funcao = funcao;
		this.nomeDoCargo = nomeDoCargo;
	}


	// Getters and Setters
	public String getNomeDoCargo() {
		return nomeDoCargo;
	}

	public String getComportamental() {
		return comportamental;
	}

	public void setComportamental(String comportamental) {
		this.comportamental = comportamental;
	}
	
	public String getPessoal() {
		return pessoal;
	}

	public void setPessoal(String pessoal) {
		this.pessoal = pessoal;
	}

	public String getProfissional() {
		return profissional;
	}

	public void setProfissional(String profissional) {
		this.profissional = profissional;
	}

	public void setNomeDoCargo(String nomeDoCargo) {
		this.nomeDoCargo = nomeDoCargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	
}
