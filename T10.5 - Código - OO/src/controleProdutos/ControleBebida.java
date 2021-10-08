package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Bebida;

/**Classe para armazenar objetos do tipo {@link Bebida}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBurger
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleBebida {

//Atributos
	private Bebida[] bebidas;
	private int qtdBebida;

	
//Construtor
	/**
	 * Construtor ControleBebida
	 * @param dados - dados
	 */
	public ControleBebida(ControleDado dados) {
		bebidas = dados.getDadoProduto().getBebidas();
		qtdBebida = dados.getDadoProduto().getQtdBebida();
	}
	
	
//Get-Set Quantidade
	public int getQtdBebida() {
		return qtdBebida;
	}
	
	public void setQtdBebida(int qtd) {
		this.qtdBebida = qtd;
	}


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeBebida() {
		String[] nomeBebida = new String[qtdBebida];
		
		for(int i = 0; i < qtdBebida; i++) {
			nomeBebida[i] = bebidas[i].getNome();
		}
		
		return nomeBebida;
	}
	
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = bebidas[i].getValor();
		return valor.toString();
	}
		

//Get Bebidas
	public Bebida[] getBebidas() {
		return bebidas;
	}
	
	
//Get Dados
	public String getTipo(int i) {
		return bebidas[i].getTipoBebida();
	}
	
	public String getNome(int i) {
		return bebidas[i].getNome();
	}
	
	public String getSabor(int i) {
		return bebidas[i].getSabor();
	}
		
	public String getTamanho(int i) {
		return bebidas[i].getTamRecipiente();
	}
	
	public double getValor(int i) {
		return bebidas[i].getValor();
	}
		
}
