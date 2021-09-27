package controleProdutos;

import modeloProdutos.Sobremesa;
import principal.DadoProduto;

public class ControleSobremesa {

//Atributos
	private Sobremesa[] sobremesas;
	private int qtdSobremesa;
	
	
//Construtor
	public ControleSobremesa(DadoProduto dados) {
		sobremesas = dados.getSobremesas();
		qtdSobremesa = dados.getQtdSobremesa();
	}


//Get-Set Quantidade
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}


	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}


//Filtro e Buscas
	public String[] getNomeSobre() {
		String[] nomeSobre = new String[qtdSobremesa];
		
		for(int i = 0; i < qtdSobremesa; i++) {
			nomeSobre[i] = sobremesas[i].getNome();
		}
		
		return nomeSobre;
	}
	

//Get Dados
	public String getTipo(int i) {
		return sobremesas[i].getTipoSobre();
	}
	
	public String getNome(int i) {
		return sobremesas[i].getNome();
	}
	
	public String getIngredientes(int i) {
		return sobremesas[i].getIngredientes();
	}
	
	public double getValor(int i) {
		return sobremesas[i].getValor();
	}
	

}
