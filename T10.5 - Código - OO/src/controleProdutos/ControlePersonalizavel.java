package controleProdutos;

import modeloProdutos.Burger;
import modeloProdutos.Personalizavel;
import principal.DadoProduto;

public class ControlePersonalizavel {

//Atributos
	private Personalizavel[] personalizaveis;
	private int qtdPers;
	
	
//Construtor
	public ControlePersonalizavel(DadoProduto dados) {
		personalizaveis = dados.getPersonalizaveis();
		qtdPers = dados.getQtdPers();
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
	
	public int getEscolhaMolho(int i) {
		return personalizaveis[i].getEscolhaMolho();
	}
	
	public double getValor(int i) {
		return personalizaveis[i].getValor();
	}

}
