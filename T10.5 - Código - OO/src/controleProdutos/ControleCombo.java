package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Burger;
import modeloProdutos.Combo;

/**Classe para armazenar objetos do tipo {@link Combo}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleCombo {

//Atributos
	private Combo[] combos;
	private int qtdCombos;
	
	
//Construtor
	/**
	 * Construtor ControleCombo
	 * @param dados - dados
	 */
	public ControleCombo(ControleDado dados) {
		combos = dados.getDadoProduto().getCombos();
		qtdCombos = dados.getDadoProduto().getQtdCombos();
	}
	
//Get-Set Quantidade
	public int getQtdCombos() {
		return qtdCombos;
	}

	public void setQtdCombos(int qtdCombos) {
		this.qtdCombos = qtdCombos;
	}


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeCombo() {
		String[] nomeCombo = new String[qtdCombos];
		
		for(int i = 0; i < qtdCombos; i++) {
			nomeCombo[i] = combos[i].getNome();
		}
		
		return nomeCombo;
	}
	
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = combos[i].getValor();
		return valor.toString();
	}


//Get Combos
	public Combo[] getCombos() {
		return combos;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return combos[i].getNome();
	}
	
	public Burger getComboBurger(int i) {
		return combos[i].getBurgCombo();
	}
	
	public Acompanhamento getComboAcomp(int i) {
		return combos[i].getAcompCombo();
	}
	
	public Bebida getComboBebida(int i) {
		return combos[i].getBebCombo();
	}
	
	public double getValor(int i) {
		return combos[i].getValor();
	}

}
