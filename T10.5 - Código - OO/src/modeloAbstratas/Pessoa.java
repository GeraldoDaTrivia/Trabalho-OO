package modeloAbstratas;

import modeloPessoaELoja.Telefone;

/**Determina atributos e métodos comuns para as classes do tipo Pessoa.
 * @see modeloPessoaELoja.Cliente
 * @see modeloPessoaELoja.Funcionario
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public abstract class Pessoa {

//Atributos
	protected String nome;
	protected int numId;
	protected String cpf;
	protected Telefone numTel;

	
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
