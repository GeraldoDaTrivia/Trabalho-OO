package controlePessoas;

import modeloDados.Endereco;
import modeloDados.Funcionario;
import modeloDados.Telefone;
import principal.DadoPessoa;

public class ControleFuncionario {

//Atributos
	private Funcionario[] funcionarios;
	private int qtdFuncionarios;
	private int numCadastros;
	
	
//Construtor
	public ControleFuncionario(DadoPessoa dados) {
		dados.fillWithSomeData();
		funcionarios = dados.getFuncionarios();
		qtdFuncionarios = dados.getQtdFuncionarios();
	}


//Add Funcionario
	public void addFuncionario(DadoPessoa dados) {
		Telefone telFunc;
		Endereco endFunc;
		
		for(int i = qtdFuncionarios; i < (qtdFuncionarios + numCadastros); i++) {
			telFunc = new Telefone(10+i, 9900990+i);
			endFunc = new Endereco(510005*(i+1), "Estado"+i, "Cidade"+i, "Bairro"+i, "Rua"+i, 12*(i+1));
			funcionarios[i] = new Funcionario("Funcionario"+i, 1107*(i+1), "086000333-"+i, 100505*(i+1), telFunc, endFunc);
			
			dados.inserirEditarFuncionario(funcionarios, i);
		}
	}

	
//Editar Cliente
	public void editarCliente(DadoPessoa dados) {
		
	}
	
	
//Get-Set Quantidade
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtro e buscas
	public String[] getNomeFuncionario() {
		String[] nomeFuncionario = new String[qtdFuncionarios];
		
		for(int i = 0; i < qtdFuncionarios; i++) {
			nomeFuncionario[i] = funcionarios[i].getNome();
		}
		
		return nomeFuncionario;
	}
	
	
//Get Funcionarios
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return funcionarios[i].getNome();
	}
	
	public int getNumId(int i) {
		return funcionarios[i].getNumId();
	}
	
	public String getCpf(int i) {
		return funcionarios[i].getCpf();
	}
	
	public int getRg(int i) {
		return funcionarios[i].getRg();
	}
	
	public Telefone getNumTel(int i) {
		return funcionarios[i].getNumTel();
	}
	
	public Endereco getEndereco(int i) {
		return funcionarios[i].getEndFunc();
	}

}
