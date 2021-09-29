package controleProdutos;

import modeloProdutos.Bebida;
import principal.DadoProduto;

public class ControleBebida {

//Atributos
	private Bebida[] bebidas;
	private int qtdBebida;
	private int numCadastros;

	
//Construtor
	public ControleBebida(DadoProduto dados) {
		dados.fillWithSomeData();
		bebidas = dados.getBebidas();
		qtdBebida = dados.getQtdBebida();
	}
		
	
//Criar Produto
	public void criarBebida(DadoProduto dados) {
		for(int i = qtdBebida; i < 50||i <(qtdBebida + numCadastros); i++){
			bebidas[i] = new Bebida("Tipo"+i, "Bebida"+i, "Sabor"+i, "Tamanho"+(i*100), 2*(i+1));
			dados.inserirEditarBebida(bebidas, i);
		}
	}
	
	
//Get-Set Quantidade
	public int getQtdBebida() {
		return qtdBebida;
	}
	
	public void setQtdBebida(int qtd) {
		this.qtdBebida = qtd;
	}
		
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
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
