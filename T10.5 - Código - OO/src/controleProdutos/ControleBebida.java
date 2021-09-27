package controleProdutos;

import modeloProdutos.Bebida;
import principal.DadoProduto;

public class ControleBebida {

//Atributos
	private Bebida[] bebidas;
	private int qtdBebida;
		
		
//Construtor
	public ControleBebida(DadoProduto dados) {
		bebidas = dados.getBebidas();
		qtdBebida = dados.getQtdBebida();
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
	
	public String[] getTipoBebida() {
		String[] tipoBebida = new String[qtdBebida];
		
		for(int i = 0; i < qtdBebida; i++) {
			tipoBebida[i] = bebidas[i].getTipoBebida();
		}
		
		return tipoBebida;
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
