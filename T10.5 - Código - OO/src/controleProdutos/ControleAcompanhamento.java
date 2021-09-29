package controleProdutos;

import modeloProdutos.Acompanhamento;
import principal.DadoProduto;

public class ControleAcompanhamento {

//Atributos
	private Acompanhamento[] acompanhamentos;
	private int qtdAcomps;
	private int numCadastros;
	
	
//Construtor
	public ControleAcompanhamento(DadoProduto dados) {
		dados.fillWithSomeData();
		acompanhamentos = dados.getAcompanhamentos();
		qtdAcomps = dados.getQtdAcomps();
	}


//Criar Produto
	public void criarAcompanhamento(DadoProduto dados) {
		for(int i = qtdAcomps; i < 50||i < (qtdAcomps + numCadastros); i++) {
			acompanhamentos[i] = new Acompanhamento("Acompanhamento"+i, "Tipo"+i, "Ingredientes"+i, 5*(i+1));
			dados.inserirEditarAcomp(acompanhamentos, i);
		}
	}
	
	
//Get-Set Quantidade
	public int getQtdAcomps() {
		return qtdAcomps;
	}

	public void setQtdAcomps(int qtdAcomps) {
		this.qtdAcomps = qtdAcomps;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomeAcomp() {
		String[] nomeAcomp = new String[qtdAcomps];
		
		for(int i = 0; i < qtdAcomps; i++) {
			nomeAcomp[i] = acompanhamentos[i].getNome();
		}
		
		return nomeAcomp;
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
