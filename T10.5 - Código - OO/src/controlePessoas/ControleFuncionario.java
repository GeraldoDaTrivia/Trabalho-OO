package controlePessoas;

import controleConjuntos.ControleDado;
import modeloDados.DadoPessoa;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.Funcionario;
import modeloPessoaELoja.Telefone;

public class ControleFuncionario {

//Atributos
	private Funcionario[] funcionarios;
	private int qtdFuncionarios;
	private int numCadastros;
	
	
//Construtor
	public ControleFuncionario(ControleDado dados) {
		funcionarios = dados.getDadoPessoa().getFuncionarios();
		qtdFuncionarios = dados.getDadoPessoa().getQtdFuncionarios();
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
