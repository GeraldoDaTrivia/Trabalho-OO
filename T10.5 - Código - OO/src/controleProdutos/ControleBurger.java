package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;

/**Classe para armazenar objetos do tipo {@link Burger}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleBurger {

//Atributos
	private Burger[] burgers;
	private int qtdBurger;
	
	
//Construtor
	/**
	 * Construtor ControleBurger
	 * @param dados - dados
	 */
	public ControleBurger(ControleDado dados) {
		burgers = dados.getDadoProduto().getBurgers();
		qtdBurger = dados.getDadoProduto().getQtdBurger();
	}
		
	
//Get-Set Quantidade
	public int getQtdBurger() {
		return qtdBurger;
	}
	
	public void setQtdBurger(int qtd) {
		this.qtdBurger = qtd;
	}


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeBurger() {
		String[] nomeBurger = new String[qtdBurger];
		
		for(int i = 0; i < qtdBurger; i++) {
			nomeBurger[i] = burgers[i].getNome();
		}
		
		return nomeBurger;
	}
	
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = burgers[i].getValor();
		return valor.toString();
	}
	

//Get Burgers
	public Burger[] getBurgers() {
		return burgers;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return burgers[i].getNome();
	}
	
	public String getCarne(int i) {
		return burgers[i].getTipoCarne();
	}
	
	public String getIngredientes(int i) {
		return burgers[i].getIngredientes();
	}
	
	public String getMolho(int i) {
		return burgers[i].getMolho();
	}
	
	public double getValor(int i) {
		return burgers[i].getValor();
	}
	
}
