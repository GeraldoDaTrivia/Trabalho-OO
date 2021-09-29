package controleProdutos;

import java.util.Random;
import modeloProdutos.Burger;
import modeloProdutos.Personalizavel;
import principal.DadoProduto;

public class ControlePersonalizavel {

//Atributos
	private Personalizavel[] personalizaveis;
	private int qtdPers;
	private int numCadastros;
	
	
//Construtor
	public ControlePersonalizavel(DadoProduto dados) {
		dados.fillWithSomeData();
		personalizaveis = dados.getPersonalizaveis();
		qtdPers = dados.getQtdPers();
	}

	
//Criar Produto
	public void criarPersonalizavel(DadoProduto dados) {
		int escolhaBurger;
		Random burg = new Random();
		
		for(int i = qtdPers; i < 50; i++){
			escolhaBurger = burg.nextInt(dados.getQtdBurger());
			
			personalizaveis[i] = new Personalizavel("Personalizavel"+i, dados.getOneBurger(escolhaBurger),
					(i+1), "Ingredientes Adicionais"+i, i, 12*(i+1));
			dados.inserirEditarPers(personalizaveis, i);
		}
	}
	

//Get-Set Quantidade
	public int getQtdPers() {
		return qtdPers;
	}

	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomePers() {
		String[] nomePers = new String[qtdPers];
		
		for(int i = 0; i < qtdPers; i++) {
			nomePers[i] = personalizaveis[i].getNome();
		}
		
		return nomePers;
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
	
	public int getEscolhaMolho(int i) {
		return personalizaveis[i].getEscolhaMolho();
	}
	
	public double getValor(int i) {
		return personalizaveis[i].getValor();
	}

}
