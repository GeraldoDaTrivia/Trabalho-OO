package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;
import modeloProdutos.Promocao;
import modeloProdutos.Sobremesa;

public class ControlePromocao {

//Atributos
	private Promocao[] promocoes;
	private int qtdPromocoes;
	
	
//Contrutor
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


//Filtros e Buscas
	public String[] getNomePromo() {
		String[] nomePromo = new String[qtdPromocoes];
		
		for(int i = 0; i < qtdPromocoes; i++) {
			nomePromo[i] = promocoes[i].getNome();
		}
		
		return nomePromo;
	}
	
//toString
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
