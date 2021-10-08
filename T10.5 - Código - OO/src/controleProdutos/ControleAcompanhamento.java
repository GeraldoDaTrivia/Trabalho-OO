package controleProdutos;

import controleConjuntos.ControleDado;
import modeloProdutos.Acompanhamento;

public class ControleAcompanhamento {

//Atributos
	private Acompanhamento[] acompanhamentos;
	private int qtdAcomps;
	
	
//Construtor
	public ControleAcompanhamento(ControleDado dados) {
		acompanhamentos = dados.getDadoProduto().getAcompanhamentos();
		qtdAcomps = dados.getDadoProduto().getQtdAcomps();
	}
	
	
//Get-Set Quantidade
	public int getQtdAcomps() {
		return qtdAcomps;
	}

	public void setQtdAcomps(int qtdAcomps) {
		this.qtdAcomps = qtdAcomps;
	}


//Filtros e Buscas
	public String[] getNomeAcomp() {
		String[] nomeAcomp = new String[qtdAcomps];
		
		for(int i = 0; i < qtdAcomps; i++) {
			nomeAcomp[i] = acompanhamentos[i].getNome();
		}
		
		return nomeAcomp;
	}
	
	
//toString
	public String toStringValor(int i) {
		Double valor = acompanhamentos[i].getValor();
		return valor.toString();
	}
	

//Get Acompanhamentos
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return acompanhamentos[i].getNome();
	}
	
	public String getTipo(int i) {
		return acompanhamentos[i].getTipoAcomp();
	}
	
	public String getIngredientes(int i) {
		return acompanhamentos[i].getIngredientes();
	}
	
	public double getValor(int i) {
		return acompanhamentos[i].getValor();
	}


}
