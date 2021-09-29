package controleProdutos;

import java.util.Random;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Infantil;
import principal.DadoProduto;

public class ControleInfantil {

//Atributos
	private Infantil[] infantis;
	private int qtdInfantis;
	private int numCadastros;
	
	
//Construtor
	public ControleInfantil(DadoProduto dados) {
		dados.fillWithSomeData();
		infantis = dados.getInfantil();
		qtdInfantis = dados.getQtdInfantis();
	}


//Criar Produto
	public void criarInfantil(DadoProduto dados) {
		int escolhaAcomp;
		int escolhaBebida;
		Random acomp = new Random();
		Random beb = new Random();
		
		for(int i = qtdInfantis; i < 50||i < (qtdInfantis + numCadastros); i++){
			escolhaAcomp = acomp.nextInt(dados.getQtdAcomps());
			escolhaBebida = beb.nextInt(dados.getQtdBebida());
			
			infantis[i] = new Infantil("Nome"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i,
					dados.getOneAcompanhamento(escolhaAcomp), dados.getOneBebida(escolhaBebida), 11*(i+1));
			dados.inserirEditarInfantil(infantis, i);
		}
	}
	
	
//Get-Set Quantidade
	public int getQtdInfantis() {
		return qtdInfantis;
	}

	public void setQtdInfantis(int qtdInfantis) {
		this.qtdInfantis = qtdInfantis;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomeInfantil() {
		String[] nomeInfantil = new String[qtdInfantis];
		
		for(int i = 0; i < qtdInfantis; i++) {
			nomeInfantil[i] = infantis[i].getNome();
		}
		
		return nomeInfantil;
	}
	
	
//Get Infantis
	public Infantil[] getInfantis() {
		return infantis;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return infantis[i].getNome();
	}
	
	public String getTipoCarne(int i) {
		return infantis[i].getTipoCarne();
	}
	
	public String getIngredientes(int i) {
		return infantis[i].getIngredientes();
	}
	
	public String getMolho(int i) {
		return infantis[i].getMolho();
	}
	
	public Acompanhamento getInfantilAcomp(int i) {
		return infantis[i].getAcompInfantil();
	}
	
	public Bebida getInfantilBebida(int i) {
		return infantis[i].getBebInfantil();
	}
	
	public double getValor(int i) {
		return infantis[i].getValor();
	}

}
