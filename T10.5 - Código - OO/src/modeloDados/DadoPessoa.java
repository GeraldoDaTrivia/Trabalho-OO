package modeloDados;

import modeloPessoaELoja.*;

public class DadoPessoa {

//Atributos
	private Cliente[] clientes = new Cliente[50];
	private int qtdClientes = 0;
	private Funcionario[] funcionarios = new Funcionario[50];
	private int qtdFuncionarios = 0;
	private Telefone[] telCliente = new Telefone[50];
	private Telefone[] telFuncionario = new Telefone[50];
	private Endereco[] endFuncionario = new Endereco[50];
	
	
//Entrada de Dados Aleatorios
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			telCliente[i] = new Telefone(60+i, 9800770+i);
			clientes[i] = new Cliente("Cliente"+i, 1001+i, "045000111-"+i, telCliente[i]);
			telFuncionario[i] = new Telefone(10+i, 9900990+i);
			endFuncionario[i] = new Endereco(510005*(i+1), "Estado"+i, "Cidade"+i, "Bairro"+i, "Rua"+i, 12*(i+1));
			funcionarios[i] = new Funcionario("Funcionario"+i, 5001+i, "086000333-"+i, 
					100505*(i+1), telFuncionario[i], endFuncionario[i]);
			
		}
		
		qtdClientes = 5;
		qtdFuncionarios = 5;
	}
	
	
//Clientes
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public Cliente getOneCliente(int pos) {
		return clientes[pos];
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public Telefone[] getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(Telefone[] telCliente) {
		this.telCliente = telCliente;
	}

	public void inserirEditarCliente(Cliente cliente, int pos) {
		this.clientes[pos] = cliente;
		if(pos == qtdClientes) qtdClientes++;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	
//Funcionarios
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public Funcionario getOneFunc(int pos) {
		return funcionarios[pos];
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public Telefone[] getTelFuncionario() {
		return telFuncionario;
	}

	public void setTelFuncionario(Telefone[] telFuncionario) {
		this.telFuncionario = telFuncionario;
	}

	public Endereco[] getEndFuncionario() {
		return endFuncionario;
	}

	public void setEndFuncionario(Endereco[] endFuncionario) {
		this.endFuncionario = endFuncionario;
	}

	public void inserirEditarFuncionario(Funcionario funcionario, int pos) {
		this.funcionarios[pos] = funcionario;
		if(pos == qtdFuncionarios) qtdFuncionarios++;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	
}
