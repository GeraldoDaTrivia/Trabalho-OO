package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;
import modeloProdutos.Personalizavel;

/**Classe para armazenar objetos do tipo {@link Personalizavel}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControlePersonalizavel {

//Atributos
	private Personalizavel[] personalizaveis;
	private int qtdPers;
	
	
//Construtor
	/**
	 * Construtor ControlePersonalizavel
	 * @param dados - dados
	 */
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


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomePers() {
		String[] nomePers = new String[qtdPers];
		
		for(int i = 0; i < qtdPers; i++) {
			nomePers[i] = personalizaveis[i].getNome();
		}
		
		return nomePers;
	}

	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = personalizaveis[i].getValor();
		return valor.toString();
	}
	
	/**Método para transformar a quantidade de carne em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Quantidade de carne
	 */
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
