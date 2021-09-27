package controleProdutos;

import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Burger;
import modeloProdutos.Combo;
import principal.DadoProduto;

public class ControleCombo {

//Atributos
	private Combo[] combos;
	private int qtdCombos;
	
	
//Construtor
	public ControleCombo(DadoProduto dados) {
		combos = dados.getCombos();
		qtdCombos = dados.getQtdCombos();
	}


//Get-Set Quantidade
	public int getQtdCombos() {
		return qtdCombos;
	}

	public void setQtdCombos(int qtdCombos) {
		this.qtdCombos = qtdCombos;
	}


//Filtros e Buscas
	public String[] getNomeCombo() {
		String[] nomeCombo = new String[qtdCombos];
		
		for(int i = 0; i < qtdCombos; i++) {
			nomeCombo[i] = combos[i].getNome();
		}
		
		return nomeCombo;
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
