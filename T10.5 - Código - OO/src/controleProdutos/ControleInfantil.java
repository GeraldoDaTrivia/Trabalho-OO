package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Infantil;

/**Classe para armazenar objetos do tipo {@link Infantil}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleCombo
 * @see ControlePersonalizavel
 * @see ControlePromocao
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleInfantil {

//Atributos
	private Infantil[] infantis;
	private int qtdInfantis;
	
	
//Construtor
	/**
	 * Construtor ControleInfantil
	 * @param dados - dados
	 */
	public ControleInfantil(ControleDado dados) {
		infantis = dados.getDadoProduto().getInfantil();
		qtdInfantis = dados.getDadoProduto().getQtdInfantis();
	}
	
	
//Get-Set Quantidade
	public int getQtdInfantis() {
		return qtdInfantis;
	}

	public void setQtdInfantis(int qtdInfantis) {
		this.qtdInfantis = qtdInfantis;
	}
	

	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomeInfantil() {
		String[] nomeInfantil = new String[qtdInfantis];
		
		for(int i = 0; i < qtdInfantis; i++) {
			nomeInfantil[i] = infantis[i].getNome();
		}
		
		return nomeInfantil;
	}
	
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = infantis[i].getValor();
		return valor.toString();
	}
	
	
//Get Infantis
	public Infantil[] getInfantis() {
		return infantis;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return infantis[i].getNome();
	}
	
	public String getTipoCarne(int i) {
		return infantis[i].getTipoCarne();
	}
	
	public String getIngredientes(int i) {
		return infantis[i].getIngredientes();
	}
	
	public String getMolho(int i) {
		return infantis[i].getMolho();
	}
	
	public Acompanhamento getInfantilAcomp(int i) {
		return infantis[i].getAcompInfantil();
	}
	
	public Bebida getInfantilBebida(int i) {
		return infantis[i].getBebInfantil();
	}
	
	public double getValor(int i) {
		return infantis[i].getValor();
	}

}
