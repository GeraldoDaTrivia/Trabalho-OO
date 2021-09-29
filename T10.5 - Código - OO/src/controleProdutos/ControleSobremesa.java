package controleProdutos;

import modeloProdutos.Sobremesa;
import principal.DadoProduto;

public class ControleSobremesa {

//Atributos
	private Sobremesa[] sobremesas;
	private int qtdSobremesa;
	private int numCadastros;
	
	
//Construtor
	public ControleSobremesa(DadoProduto dados) {
		dados.fillWithSomeData();
		sobremesas = dados.getSobremesas();
		qtdSobremesa = dados.getQtdSobremesa();
	}


//Criar Produto
	public void criarSobremesa(DadoProduto dados) {
		for(int i = qtdSobremesa; i < 50||i < (qtdSobremesa + numCadastros); i++){
			sobremesas[i] = new Sobremesa("Tipo"+i, "Sobremesa"+i, "Ingredientes"+i, 3*(i+1));
			dados.inserirEditarSobremesa(sobremesas, i);
		}
	}
	
	
//Get-Set Quantidade
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}

	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}

	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtro e Buscas
	public String[] getNomeSobre() {
		String[] nomeSobre = new String[qtdSobremesa];
		
		for(int i = 0; i < qtdSobremesa; i++) {
			nomeSobre[i] = sobremesas[i].getNome();
		}
		
		return nomeSobre;
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
