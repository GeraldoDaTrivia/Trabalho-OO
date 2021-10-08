package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Acompanhamento;

/**Classe para armazenar objetos do tipo {@link Acompanhamento} a quantidade desses objetos e chamar seus m�todos.
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author Jo�o Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleAcompanhamento {

//Atributos
	private Acompanhamento[] acompanhamentos;
	private int qtdAcomps;
	
	
//Construtor
	/**
	 * Construtor ControleAcompanhamento
	 * @param dados - dados
	 */
	public ControleAcompanhamento(ControleDado dados) {
		acompanhamentos = dados.getDadoProduto().getAcompanhamentos();
		qtdAcomps = dados.getDadoProduto().getQtdAcomps();
	}
	
	
//Get-Set Quantidade
	public int getQtdAcomps() {
		return qtdAcomps;
	}

	public void setQtdAcomps(int qtdAcomps) {
		this.qtdAcomps = qtdAcomps;
	}


	/**M�todo para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeAcomp() {
		String[] nomeAcomp = new String[qtdAcomps];
		
		for(int i = 0; i < qtdAcomps; i++) {
			nomeAcomp[i] = acompanhamentos[i].getNome();
		}
		
		return nomeAcomp;
	}
	
	
	/**M�todo para transformar o valor do produto em String
	 * 
	 * @param i - Posi��o do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = acompanhamentos[i].getValor();
		return valor.toString();
	}
	

//Get Acompanhamentos
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return acompanhamentos[i].getNome();
	}
	
	public String getTipo(int i) {
		return acompanhamentos[i].getTipoAcomp();
	}
	
	public String getIngredientes(int i) {
		return acompanhamentos[i].getIngredientes();
	}
	
	public double getValor(int i) {
		return acompanhamentos[i].getValor();
	}


}
