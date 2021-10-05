package modeloPessoaELoja;

import modeloAbstratas.Pessoa;

public class Cliente extends Pessoa {

//Construtores
	public Cliente(String nomeCliente, int idCliente, String cpfCliente, Telefone telCliente) {
		nome = nomeCliente;
		numId = idCliente;
		cpf = cpfCliente;
		numTel = telCliente;
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
	
}
