package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Sobremesa;

public class ControleSobremesa {

//Atributos
	private Sobremesa[] sobremesas;
	private int qtdSobremesa;
	
	
//Construtor
	public ControleSobremesa(ControleDado dados) {
		sobremesas = dados.getDadoProduto().getSobremesas();
		qtdSobremesa = dados.getDadoProduto().getQtdSobremesa();
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
	
//toString
	public String toStringValor(int i) {
		Double valor = sobremesas[i].getValor();
		return valor.toString();
	}
	

//Get Sobremesas
	public Sobremesa[] getSobremesas() {
		return sobremesas;
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
