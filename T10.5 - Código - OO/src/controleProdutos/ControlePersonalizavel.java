package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;
import modeloProdutos.Personalizavel;

public class ControlePersonalizavel {

//Atributos
	private Personalizavel[] personalizaveis;
	private int qtdPers;
	
	
//Construtor
	public ControlePersonalizavel(ControleDado dados) {
		personalizaveis = dados.getDadoProduto().getPersonalizaveis();
		qtdPers = dados.getDadoProduto().getQtdPers();
	}
	

//Get-Set Quantidade
	public int getQtdPers() {
		return qtdPers;
	}

	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}


//Filtros e Buscas
	public String[] getNomePers() {
		String[] nomePers = new String[qtdPers];
		
		for(int i = 0; i < qtdPers; i++) {
			nomePers[i] = personalizaveis[i].getNome();
		}
		
		return nomePers;
	}

//toString
	public String toStringValor(int i) {
		Double valor = personalizaveis[i].getValor();
		return valor.toString();
	}
	
	public String toStringQtdCarne(int i) {
		Integer qtd = personalizaveis[i].getQuantCarne();
		return qtd.toString();
	}
	

//Get Personalizaveis
	public Personalizavel[] getPersonalizaveis() {
		return personalizaveis;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return personalizaveis[i].getNome();
	}
	
	public Burger getPersBurger(int i) {
		return personalizaveis[i].getBurgPers();
	}
	
	public int getQtdCarne(int i) {
		return personalizaveis[i].getQuantCarne();
	}
	
	public String getAddIngred(int i) {
		return personalizaveis[i].getAddIngred();
	}
	
	public String getEscolhaMolho(int i) {
		return personalizaveis[i].getEscolhaMolho();
	}
	
	public double getValor(int i) {
		return personalizaveis[i].getValor();
	}

}
