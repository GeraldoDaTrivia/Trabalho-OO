package modeloProdutos;

import modeloAbstratas.Produto;

public class Combo extends Produto {

//Atributos
	private Burger burgCombo;
	private Acompanhamento acompCombo;
	private Bebida bebCombo;
	

//Construtores
	public Combo(String nomeCom, Burger burgCom, Acompanhamento acompCom, Bebida bebCom, double valorCom) {
		nome = nomeCom;
		burgCombo = burgCom;
		acompCombo = acompCom;
		bebCombo = bebCom;
		valor = valorCom;
	}
	
	
//Gets e sets
	public Burger getBurgCombo() {
		return burgCombo;
	}

	public void setBurgCombo(Burger burgCombo) {
		this.burgCombo = burgCombo;
	}

	public Acompanhamento getAcompCombo() {
		return acompCombo;
	}

	public void setAcompCombo(Acompanhamento acompCombo) {
		this.acompCombo = acompCombo;
	}

	public Bebida getBebCombo() {
		return bebCombo;
	}

	public void setBebCombo(Bebida bebCombo) {
		this.bebCombo = bebCombo;
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
