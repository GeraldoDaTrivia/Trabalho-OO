package principal;

import modeloDados.*;

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
			telCliente[i] = new Telefone(06+i, 99800770+i);
			clientes[i] = new Cliente("Cliente"+i, 1001*(i+1), "045000111-9"+i, telCliente[i]);
			telFuncionario[i] = new Telefone(01+i, 98300990+i);
			endFuncionario[i] = new Endereco(51000005*(i+1), "Estado"+i, "Cidade"+i, "Bairro"+i, "Rua"+i, 12*(i+1));
			funcionarios[i] = new Funcionario("Funcioanrio"+i, 1107*(i+1), "086000333-5"+i, 1000505*(i+1), telFuncionario[i], endFuncionario[i]);
			
		}
		
		qtdClientes = 5;
		qtdFuncionarios = 5;
	}
	
	
//Clientes
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public void inserirEditarCliente(Cliente clientes, int pos) {
		this.clientes[pos] = clientes;
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
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void inserirEditarFuncionario(Funcionario funcionarios, int pos) {
		this.funcionarios[pos] = funcionarios;
		if(pos == qtdFuncionarios) qtdFuncionarios++;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	
}
