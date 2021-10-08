package modeloDados;

import modeloConjuntos.Venda;
import modeloPessoaELoja.*;

public class DadoVenda {

//Atributos
	private Venda[] vendas = new Venda[50];
	private int qtdVendas = 0;
	
	private DadoPessoa dadosPessoa = new DadoPessoa();
	private DadoProduto dadosProduto = new DadoProduto();
	
	private Cliente[] clienteVenda = new Cliente[50];
	private Funcionario[] funcVenda = new Funcionario[50];
	private String[] produtosVenda = new String[50];
	private double[] valorVenda = new double[50];
	
	
//Entrada de Dados Aleatorios
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			
			dadosPessoa.fillWithSomeData();
			dadosProduto.fillWithSomeData();
			
			clienteVenda[i] = dadosPessoa.getOneCliente(i);
			funcVenda[i] = dadosPessoa.getOneFunc(i);
			
			if(i==0) {
				
				String string1 = dadosProduto.getOneAcompanhamento(i).getNome();
				String string2 = " - ";
				String string3 = dadosProduto.getOnePers(i).getNome();
				produtosVenda[i] = string1.concat(string2.concat(string3));
				
				valorVenda[i] = dadosProduto.getOneAcompanhamento(i).getValor();
				valorVenda[i] = valorVenda[i] + dadosProduto.getOnePers(i).getValor();
			} else if(i==1) {
				String string1 = dadosProduto.getOneBebida(i).getNome();
				String string2 = " - ";
				String string3 = dadosProduto.getOnePromo(i).getNome();
				produtosVenda[i] = string1.concat(string2.concat(string3));
				
				valorVenda[i] = dadosProduto.getOneBebida(i).getValor();
				valorVenda[i] = valorVenda[i] + dadosProduto.getOnePromo(i).getValor();
			} else if(i==2) {
				String string1 = dadosProduto.getOneBurger(i).getNome();
				String string2 = " - ";
				String string3 = dadosProduto.getOneSobre(i).getNome();
				produtosVenda[i] = string1.concat(string2.concat(string3));
				
				valorVenda[i] = dadosProduto.getOneBurger(i).getValor();
				valorVenda[i] = valorVenda[i] + dadosProduto.getOneSobre(i).getValor();
			} else if(i==3) {
				produtosVenda[i] = dadosProduto.getOneCombo(i).getNome();
				
				valorVenda[i] = dadosProduto.getOneCombo(i).getValor();
			} else if(i==4) {
				String string1 = dadosProduto.getOneBurger(i).getNome();
				String string2 = " - ";
				String string3 = dadosProduto.getOneSobre(i).getNome();
				String string4 = " - ";
				String string5 = dadosProduto.getOneBebida(i).getNome();
				produtosVenda[i] = string1.concat(string2.concat(string3.concat(string4.concat(string5))));
				
				valorVenda[i] = dadosProduto.getOneBurger(i).getValor();
				valorVenda[i] = valorVenda[i] + dadosProduto.getOneSobre(i).getValor();
				valorVenda[i] = valorVenda[i] + dadosProduto.getOneBebida(i).getValor();
			}
			
			vendas[i] = new Venda(clienteVenda[i], funcVenda[i], produtosVenda[i], valorVenda[i]);
		}
		
	//Set Quantidade
		qtdVendas = 5;
	}


//Get-Set Vendas
	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}
	
	public void addOneVenda(Venda venda, int pos) {
		this.vendas[pos] = venda;
		if(pos == qtdVendas) qtdVendas++;
	}
	
	public Venda getOneVenda(int pos) {
		return vendas[pos];
	}


//Get-Set Quantidade
	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}


//Gets e sets Detalhes Venda
	public Cliente[] getClienteVenda() {
		return clienteVenda;
	}

	public void setClienteVenda(Cliente[] clienteVenda) {
		this.clienteVenda = clienteVenda;
	}

	public Funcionario[] getFuncVenda() {
		return funcVenda;
	}

	public void setFuncVenda(Funcionario[] funcVenda) {
		this.funcVenda = funcVenda;
	}

	public String[] getProdutosVenda() {
		return produtosVenda;
	}

	public void setProdutosVenda(String[] produtosVenda) {
		this.produtosVenda = produtosVenda;
	}

	public double[] getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double[] valorVenda) {
		this.valorVenda = valorVenda;
	}

}
