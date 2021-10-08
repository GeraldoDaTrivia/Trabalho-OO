package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Burger;
import modeloProdutos.Combo;

public class ControleCombo {

//Atributos
	private Combo[] combos;
	private int qtdCombos;
	
	
//Construtor
	public ControleCombo(ControleDado dados) {
		combos = dados.getDadoProduto().getCombos();
		qtdCombos = dados.getDadoProduto().getQtdCombos();
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
	
//toString
	public String toStringValor(int i) {
		Double valor = combos[i].getValor();
		return valor.toString();
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
