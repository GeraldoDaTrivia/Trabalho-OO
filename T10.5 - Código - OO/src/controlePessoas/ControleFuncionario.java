package controlePessoas;

import modeloDados.Endereco;
import modeloDados.Funcionario;
import modeloDados.Telefone;
import principal.DadoPessoa;

public class ControleFuncionario {

//Atributos
	private Funcionario[] funcionarios;
	private int qtdFuncionarios;
	
	
//Construtor
	public ControleFuncionario(DadoPessoa dados) {
		funcionarios = dados.getFuncionarios();
		qtdFuncionarios = dados.getQtdFuncionarios();
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
