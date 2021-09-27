package controlePessoas;

import modeloDados.Cliente;
import modeloDados.Telefone;
import principal.DadoPessoa;

public class ControleCliente {

//Atributos
	private Cliente[] clientes;
	private int qtdClientes;

	
//Construtor
	public ControleCliente(DadoPessoa dados) {
		clientes = dados.getClientes();
		qtdClientes = dados.getQtdClientes();
	}


//Get-Set Quantidade
	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	
//Filtros e Buscas
	public String[] getNomeCliente() {
		String[] nomeCliente = new String[qtdClientes];
		
		for(int i = 0; i < qtdClientes; i++) {
			nomeCliente[i] = clientes[i].getNome();
		}
		
		return nomeCliente;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return clientes[i].getNome();
	}
	
	public int getNumId(int i) {
		return clientes[i].getNumId();
	}
	
	public String getCpf(int i) {
		return clientes[i].getCpf();
	}
	
	public Telefone getNumTel(int i) {
		return clientes[i].getNumTel();
	}

}
