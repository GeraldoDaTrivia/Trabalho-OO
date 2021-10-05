package modeloProdutos;

import modeloAbstratas.Produto;

public class Acompanhamento extends Produto {

//Atributos
	private String tipoAcomp;
	private String ingredientes;
	

//Construtores
	public Acompanhamento(String nomeAcomp, String tipo, String ingredAcomp, double valorAcomp) {
		nome = nomeAcomp;
		tipoAcomp = tipo;
		ingredientes = ingredAcomp;
		valor = valorAcomp;
	}
	
	
//Gets e sets
	public String getTipoAcomp() {
		return tipoAcomp;
	}

	public void setTipoAcomp(String tipoAcomp) {
		this.tipoAcomp = tipoAcomp;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
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
