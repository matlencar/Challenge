package br.com.fiap.empresa.model;

public class Empresa {

	// Atributos
	private String nome;
	private String nomeFantasia;
	private long cnpj;
	private int cricaoAno;
	private int cricaoMes;
	private int cricaoDia;

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public int getCricaoAno() {
		return cricaoAno;
	}

	public void setCricaoAno(int cricaoAno) {
		this.cricaoAno = cricaoAno;
	}

	public int getCricaoMes() {
		return cricaoMes;
	}

	public void setCricaoMes(int cricaoMes) {
		this.cricaoMes = cricaoMes;
	}

	public int getCricaoDia() {
		return cricaoDia;
	}

	public void setCricaoDia(int cricaoDia) {
		this.cricaoDia = cricaoDia;
	}

}
