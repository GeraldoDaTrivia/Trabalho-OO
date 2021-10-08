package modeloProdutos;

import modeloAbstratas.Produto;

public class Personalizavel extends Produto {

//Atributos
	private int quantCarne;
	private String addIngred;
	private String escolhaMolho;
	private Burger burgPers;
	

//Construtores
	public Personalizavel(String nomePers, Burger burg, int qtdCarne, String addIng, String escMolho, double valorPers) {
		nome = nomePers;
		burgPers = burg;
		quantCarne = qtdCarne;
		addIngred = addIng;
		escolhaMolho = escMolho;
		valor = valorPers;
	}
	
	
//Gets e sets
	public Burger getBurgPers() {
		return burgPers;
	}

	public void setBurgPers(Burger burgPers) {
		this.burgPers = burgPers;
	}
	
	public int getQuantCarne() {
		return quantCarne;
	}

	public void setQuantCarne(int quantCarne) {
		this.quantCarne = quantCarne;
	}

	public String getAddIngred() {
		return addIngred;
	}

	public void setAddIngred(String addIngred) {
		this.addIngred = addIngred;
	}

	public String getEscolhaMolho() {
		return escolhaMolho;
	}

	public void setEscolhaMolho(String escolhaMolho) {
		this.escolhaMolho = escolhaMolho;
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
