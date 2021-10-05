package modeloProdutos;

import modeloAbstratas.Produto;

public class Infantil extends Produto {

//Atributos
	private String tipoCarne;
	private String ingredientes;
	private String molho;
	private Acompanhamento acompInfantil;
	private Bebida bebInfantil;
	

//Construtores
	public Infantil(String nomeInf, String carne, String ingredInf, String molhoInf, Acompanhamento acompInf, Bebida bebInf, double valorInf) {
		nome = nomeInf;
		tipoCarne = carne;
		ingredientes = ingredInf;
		molho = molhoInf;
		acompInfantil = acompInf;
		bebInfantil = bebInf;
		valor = valorInf;
	}
	
	
//Gets e sets
	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public Acompanhamento getAcompInfantil() {
		return acompInfantil;
	}

	public void setAcompInfantil(Acompanhamento acompInfantil) {
		this.acompInfantil = acompInfantil;
	}

	public Bebida getBebInfantil() {
		return bebInfantil;
	}

	public void setBebInfantil(Bebida bebInfantil) {
		this.bebInfantil = bebInfantil;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
