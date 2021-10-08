package controlePessoas;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.Funcionario;
import modeloPessoaELoja.Telefone;

/**Classe para armazenar objetos do tipo {@link Funcionario}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleCliente
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleFuncionario {

//Atributos
	private Funcionario[] funcionarios;
	private int qtdFuncionarios;
	
	
//Construtor
	/**
	 * Construtor ControleFuncionario
	 * @param dados - dados
	 */
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
	
	public String getOneStringRg(int i) {
		return funcionarios[i].toStringRg();
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
