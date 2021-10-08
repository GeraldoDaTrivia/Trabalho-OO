package controleConjuntos;

import modeloConjuntos.Venda;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;

public class ControleVenda {

//Atributos
	private Venda[] vendas;
	private int qtdVendas;
	
	public ControleVenda(ControleDado dados) {
		vendas = dados.getDadoVenda().getVendas();
		qtdVendas = dados.getDadoVenda().getQtdVendas();
	}

	
//Get-Set Quantidade
	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
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
