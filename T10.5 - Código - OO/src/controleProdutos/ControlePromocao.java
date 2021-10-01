package controleProdutos;

import java.util.Random;
import controleConjuntos.ControleDado;
import modeloDados.DadoProduto;
import modeloProdutos.Burger;
import modeloProdutos.Promocao;
import modeloProdutos.Sobremesa;

public class ControlePromocao {

//Atributos
	private Promocao[] promocoes;
	private int qtdPromocoes;
	private int numCadastros;
	
	
//Contrutor
	public ControlePromocao(ControleDado dados) {
		promocoes = dados.getDadoProduto().getPromocoes();
		qtdPromocoes = dados.getDadoProduto().getQtdPromo();
	}


//Criar Produto
	public void criarPromocao(DadoProduto dados) {
		int escolhaBurger;
		int escolhaSobre;
		Random burg = new Random();
		Random sobre = new Random();
		
		for(int i = qtdPromocoes; i < 50|| i < (qtdPromocoes + numCadastros); i++){
			escolhaBurger = burg.nextInt(dados.getQtdBurger());
			escolhaSobre = sobre.nextInt(dados.getQtdSobremesa());
			
			promocoes[i] = new Promocao("Promocao"+i, "Dias"+i, dados.getOneBurger(escolhaBurger),
					dados.getOneSobre(escolhaSobre), 9*(i+1));
			dados.inserirEditarPromo(promocoes, i);
		}
	}

	
//Get-Set Quantidade
	public int getQtdPromocoes() {
		return qtdPromocoes;
	}
	
	public void setQtdPromocoes(int qtdPromocoes) {
		this.qtdPromocoes = qtdPromocoes;
	}

	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomePromo() {
		String[] nomePromo = new String[qtdPromocoes];
		
		for(int i = 0; i < qtdPromocoes; i++) {
			nomePromo[i] = promocoes[i].getNome();
		}
		
		return nomePromo;
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
