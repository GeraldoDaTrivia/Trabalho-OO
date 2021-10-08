package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Bebida;

public class ControleBebida {

//Atributos
	private Bebida[] bebidas;
	private int qtdBebida;

	
//Construtor
	public ControleBebida(ControleDado dados) {
		bebidas = dados.getDadoProduto().getBebidas();
		qtdBebida = dados.getDadoProduto().getQtdBebida();
	}
	
	
//Get-Set Quantidade
	public int getQtdBebida() {
		return qtdBebida;
	}
	
	public void setQtdBebida(int qtd) {
		this.qtdBebida = qtd;
	}


//Filtros e Buscas
	public String[] getNomeBebida() {
		String[] nomeBebida = new String[qtdBebida];
		
		for(int i = 0; i < qtdBebida; i++) {
			nomeBebida[i] = bebidas[i].getNome();
		}
		
		return nomeBebida;
	}
	
//toString
	public String toStringValor(int i) {
		Double valor = bebidas[i].getValor();
		return valor.toString();
	}
		

//Get Bebidas
	public Bebida[] getBebidas() {
		return bebidas;
	}
	
	
//Get Dados
	public String getTipo(int i) {
		return bebidas[i].getTipoBebida();
	}
	
	public String getNome(int i) {
		return bebidas[i].getNome();
	}
	
	public String getSabor(int i) {
		return bebidas[i].getSabor();
	}
		
	public String getTamanho(int i) {
		return bebidas[i].getTamRecipiente();
	}
	
	public double getValor(int i) {
		return bebidas[i].getValor();
	}
		
}
