package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Burger;

public class ControleBurger {

//Atributos
	private Burger[] burgers;
	private int qtdBurger;
	
	
//Construtor
	public ControleBurger(ControleDado dados) {
		burgers = dados.getDadoProduto().getBurgers();
		qtdBurger = dados.getDadoProduto().getQtdBurger();
	}
		
	
//Get-Set Quantidade
	public int getQtdBurger() {
		return qtdBurger;
	}
	
	public void setQtdBurger(int qtd) {
		this.qtdBurger = qtd;
	}


//Filtros e Buscas
	public String[] getNomeBurger() {
		String[] nomeBurger = new String[qtdBurger];
		
		for(int i = 0; i < qtdBurger; i++) {
			nomeBurger[i] = burgers[i].getNome();
		}
		
		return nomeBurger;
	}
	
//toString
	public String toStringValor(int i) {
		Double valor = burgers[i].getValor();
		return valor.toString();
	}
	

//Get Burgers
	public Burger[] getBurgers() {
		return burgers;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return burgers[i].getNome();
	}
	
	public String getCarne(int i) {
		return burgers[i].getTipoCarne();
	}
	
	public String getIngredientes(int i) {
		return burgers[i].getIngredientes();
	}
	
	public String getMolho(int i) {
		return burgers[i].getMolho();
	}
	
	public double getValor(int i) {
		return burgers[i].getValor();
	}
	
}
