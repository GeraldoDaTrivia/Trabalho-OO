package controlePessoas;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Telefone;

/**Classe para armazenar objetos do tipo {@link Cliente}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleFuncionario
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleCliente {

//Atributos
	private Cliente[] clientes;
	private int qtdClientes;

	
//Construtor
	/**
	 * Construtor ControleCliente
	 * @param dados - dados
	 */
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
	
	
//Dados toString
	public String getOneStringId(int i) {
		return clientes[i].toStringId(); 
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
