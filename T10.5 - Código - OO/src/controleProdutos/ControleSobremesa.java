package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Sobremesa;

/**Classe para armazenar objetos do tipo {@link Sobremesa}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleSobremesa {

//Atributos
	private Sobremesa[] sobremesas;
	private int qtdSobremesa;
	
	
//Construtor
	/**
	 * Construtor ControleSobremesa
	 * @param dados - dados
	 */
	public ControleSobremesa(ControleDado dados) {
		sobremesas = dados.getDadoProduto().getSobremesas();
		qtdSobremesa = dados.getDadoProduto().getQtdSobremesa();
	}
	
	
//Get-Set Quantidade
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}

	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeSobre() {
		String[] nomeSobre = new String[qtdSobremesa];
		
		for(int i = 0; i < qtdSobremesa; i++) {
			nomeSobre[i] = sobremesas[i].getNome();
		}
		
		return nomeSobre;
	}
		
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = sobremesas[i].getValor();
		return valor.toString();
	}
	

//Get Sobremesas
	public Sobremesa[] getSobremesas() {
		return sobremesas;
	}
	
	
//Get Dados
	public String getTipo(int i) {
		return sobremesas[i].getTipoSobre();
	}
	
	public String getNome(int i) {
		return sobremesas[i].getNome();
	}
	
	public String getIngredientes(int i) {
		return sobremesas[i].getIngredientes();
	}
	
	public double getValor(int i) {
		return sobremesas[i].getValor();
	}
	

}
