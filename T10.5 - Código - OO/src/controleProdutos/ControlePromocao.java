package controleProdutos;

import modeloProdutos.Burger;
import modeloProdutos.Promocao;
import modeloProdutos.Sobremesa;
import principal.DadoProduto;

public class ControlePromocao {

//Atributos
	private Promocao[] promocoes;
	private int qtdPromocoes;
	
	
//Contrutor
	public ControlePromocao(DadoProduto dados) {
		promocoes = dados.getPromocoes();
		qtdPromocoes = dados.getQtdPromo();
	}


//Get-Set Quantidade
	public int getQtdPromocoes() {
		return qtdPromocoes;
	}
	
	public void setQtdPromocoes(int qtdPromocoes) {
		this.qtdPromocoes = qtdPromocoes;
	}

	
//Filtros e Buscas
	public String[] getNomePromo() {
		String[] nomePromo = new String[qtdPromocoes];
		
		for(int i = 0; i < qtdPromocoes; i++) {
			nomePromo[i] = promocoes[i].getNome();
		}
		
		return nomePromo;
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
