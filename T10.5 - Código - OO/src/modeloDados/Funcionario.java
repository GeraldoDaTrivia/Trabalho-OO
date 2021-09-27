package modeloDados;

import modeloAbstratas.Pessoa;

public class Funcionario extends Pessoa {

//Atributos
	private int rg;
	private Endereco endFunc;
	

//Construtores
	public Funcionario(String nomeFunc, int idFunc, String cpfFunc, int numRg, Telefone telFunc, Endereco enderecoFunc) {
		nome = nomeFunc;
		numId = idFunc;
		cpf = cpfFunc;
		rg = numRg;
		numTel = telFunc;
		endFunc = enderecoFunc;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
				"\nID: " + numId + 
				"\nCPF: " + cpf + 
				"\nRG: " + rg + 
				"\nTelefone: " + numTel + 
				"\nEndereco: " + endFunc;
	}
	
	
//Gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	
	public Endereco getEndFunc() {
		return endFunc;
	}

	public void setEndFunc(Endereco endFunc) {
		this.endFunc = endFunc;
	}
	
	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

}
