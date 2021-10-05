package controlePessoas;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Telefone;

public class ControleCliente {

//Atributos
	private Cliente[] clientes;
	private int qtdClientes;
	private int numCadastros;

	
//Construtor
	public ControleCliente(ControleDado dados) {
		clientes = dados.getDadoPessoa().getClientes();
		qtdClientes = dados.getDadoPessoa().getQtdClientes();
	}
	

//Get-Set Quantidade
	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomeCliente() {
		String[] nomeCliente = new String[qtdClientes];
		
		for(int i = 0; i < qtdClientes; i++) {
			nomeCliente[i] = clientes[i].getNome();
		}
		
		return nomeCliente;
	}
	
	
//Get Clientes
	public Cliente[] getClientes() {
		return clientes;
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
