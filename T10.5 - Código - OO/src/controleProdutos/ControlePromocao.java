package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;
import modeloProdutos.Promocao;
import modeloProdutos.Sobremesa;

/**Classe para armazenar objetos do tipo {@link Promocao}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleAcompanhamento
 * @see ControleBebida
 * @see ControleBurger
 * @see ControleCombo
 * @see ControleInfantil
 * @see ControlePersonalizavel
 * @see ControleSobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControlePromocao {

//Atributos
	private Promocao[] promocoes;
	private int qtdPromocoes;
	
	
//Contrutor
	/**
	 * Construtor ControlePromocao
	 * @param dados - dados
	 */
	public ControlePromocao(ControleDado dados) {
		promocoes = dados.getDadoProduto().getPromocoes();
		qtdPromocoes = dados.getDadoProduto().getQtdPromo();
	}

	
//Get-Set Quantidade
	public int getQtdPromocoes() {
		return qtdPromocoes;
	}
	
	public void setQtdPromocoes(int qtdPromocoes) {
		this.qtdPromocoes = qtdPromocoes;
	}


	/**Método para receber uma lista de produtos
	 * 
	 * @return String - Lista de Nomes
	 */
	public String[] getNomePromo() {
		String[] nomePromo = new String[qtdPromocoes];
		
		for(int i = 0; i < qtdPromocoes; i++) {
			nomePromo[i] = promocoes[i].getNome();
		}
		
		return nomePromo;
	}
	
	/**Método para transformar o valor do produto em String
	 * 
	 * @param i - Posição do produto no array
	 * @return String - Valor do produto
	 */
	public String toStringValor(int i) {
		Double valor = promocoes[i].getValor();
		return valor.toString();
	}
	

//Get Promocoes
	public Promocao[] getPromocoes() {
		return promocoes;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return promocoes[i].getNome();
	}
	
	public String getDiasValidos(int i) {
		return promocoes[i].getDiasValidos();
	}
	
	public Burger getPromoBurger(int i) {
		return promocoes[i].getBurgPromo();
	}
	
	public Sobremesa getPromoSobre(int i) {
		return promocoes[i].getSobrePromo();
	}
	
	public double getValor(int i) {
		return promocoes[i].getValor();
	}

}
