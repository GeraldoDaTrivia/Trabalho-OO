package controleConjuntos;

import modeloConjuntos.Venda;
import modeloDados.DadoVenda;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;

public class ControleVenda {

//Atributos
	private Venda[] vendas;
	private int qtdVendas;
	private int numCadastros;
	
	public ControleVenda(ControleDado dados) {
		vendas = dados.getDadoVenda().getVendas();
		qtdVendas = dados.getDadoVenda().getQtdVendas();
	}

	
//Add Vendas
	public void addEditVenda(DadoVenda dados) {
		
		for(int i = qtdVendas; i < 50||i < (qtdVendas + numCadastros); i++) {
			
			
			dados.inserirEditarVenda(vendas, i);
		}
	}

	
//Get-Set Quantidade
	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}
	

//Filtros e Buscas
	public String[] getVendaPorFunc() {
		String[] vendasPorFunc = new String[qtdVendas];
		
		for(int i = 0; i < qtdVendas; i++) {
			vendasPorFunc[i] = vendas[i].getFuncVenda().getNome();
		}
		
		return vendasPorFunc;
	}

	
//Get Vendas
	public Venda[] getVendas() {
		return vendas;
	}
	
	
//Get Dados
	public Cliente getClienteVenda(int i) {
		return vendas[i].getClienteVenda();
	}
	
	public Funcionario getFuncVenda(int i) {
		return vendas[i].getFuncVenda();
	}
	
	public String getProdVendidos(int i) {
		return vendas[i].getProdVendidos();
	}
	
	public double getValorVenda(int i) {
		return vendas[i].getValorTotal();
	}
	
}
