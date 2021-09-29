package controleProdutos;

import java.util.Random;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Burger;
import modeloProdutos.Combo;
import principal.DadoProduto;

public class ControleCombo {

//Atributos
	private Combo[] combos;
	private int qtdCombos;
	private int numCadastros;
	
	
//Construtor
	public ControleCombo(DadoProduto dados) {
		dados.fillWithSomeData();
		combos = dados.getCombos();
		qtdCombos = dados.getQtdCombos();
	}


//Criar Produto
	public void criarCombo(DadoProduto dados) {
		int escolhaAcomp;
		int escolhaBebida;
		int escolhaBurger;
		Random acomp = new Random();
		Random beb = new Random();
		Random burg = new Random();
		
		for(int i = qtdCombos; i < 50||i < (qtdCombos + numCadastros); i++){
			escolhaAcomp = acomp.nextInt(dados.getQtdAcomps());
			escolhaBebida = beb.nextInt(dados.getQtdBebida());
			escolhaBurger = burg.nextInt(dados.getQtdBurger());
			
			combos[i] = new Combo("Combo"+i, dados.getOneBurger(escolhaBurger), 
					dados.getOneAcompanhamento(escolhaAcomp), dados.getOneBebida(escolhaBebida), 14*(i+1));
			dados.inserirEditarCombo(combos, i);
		}
	}
	
	
//Get-Set Quantidade
	public int getQtdCombos() {
		return qtdCombos;
	}

	public void setQtdCombos(int qtdCombos) {
		this.qtdCombos = qtdCombos;
	}

	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomeCombo() {
		String[] nomeCombo = new String[qtdCombos];
		
		for(int i = 0; i < qtdCombos; i++) {
			nomeCombo[i] = combos[i].getNome();
		}
		
		return nomeCombo;
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
