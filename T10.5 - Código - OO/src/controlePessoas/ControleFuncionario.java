package controlePessoas;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.Funcionario;
import modeloPessoaELoja.Telefone;

public class ControleFuncionario {

//Atributos
	private Funcionario[] funcionarios;
	private int qtdFuncionarios;
	
	
//Construtor
	public ControleFuncionario(ControleDado dados) {
		funcionarios = dados.getDadoPessoa().getFuncionarios();
		qtdFuncionarios = dados.getDadoPessoa().getQtdFuncionarios();
	}
	
	
//Get-Set Quantidade
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
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
	
	
//Dados toString
	public String getOneStringId(int i) {
		return funcionarios[i].toStringId();
	}
	
	public int getRg(int i) {
		return funcionarios[i].getRg();
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
	
	public String getOneStringRg(int i) {
		return funcionarios[i].toStringRg();
	}
	
	public Telefone getNumTel(int i) {
		return funcionarios[i].getNumTel();
	}
	
	public Endereco getEndereco(int i) {
		return funcionarios[i].getEndFunc();
	}

}
