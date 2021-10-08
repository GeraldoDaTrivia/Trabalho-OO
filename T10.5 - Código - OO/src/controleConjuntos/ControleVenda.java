package controleConjuntos;

import modeloConjuntos.Venda;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;

/**Classe para armazenar objetos do tipo {@link Venda}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleCardapio
 * @see ControleDado
 * @see ControleSobreALoja
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleVenda {

//Atributos
	private Venda[] vendas;
	private int qtdVendas;
	
	/**
	 * Construtor ControleVenda
	 * @param dados - dados
	 */
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
