package modeloProdutos;

import modeloAbstratas.Produto;

public class Promocao extends Produto {

//Atributos
	private String diasValidos;
	private Burger burgPromo;
	private Sobremesa sobrePromo;


//Construtores
	public Promocao(String nomePromo, String dias, Burger burg, Sobremesa sobre, double valorPromo) {
		nome = nomePromo;
		diasValidos = dias;
		burgPromo = burg;
		sobrePromo = sobre;
		valor = valorPromo;
	}
	
	
//Gets e sets
	public Burger getBurgPromo() {
		return burgPromo;
	}

	public void setBurgPromo(Burger burgPromo) {
		this.burgPromo = burgPromo;
	}

	public Sobremesa getSobrePromo() {
		return sobrePromo;
	}

	public void setSobrePromo(Sobremesa sobrePromo) {
		this.sobrePromo = sobrePromo;
	}
	
	public String getDiasValidos() {
		return diasValidos;
	}

	public void setDiasValidos(String diasValidos) {
		this.diasValidos = diasValidos;
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
