package modeloPessoaELoja;

import modeloAbstratas.Pessoa;

/**Classe para objetos do tipo Cliente, onde ser�o armazenados os valores e m�todos dos mesmos.
 * @see Pessoa
 * @see Funcionario
 * @see Telefone
 * @author Jo�o Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Cliente extends Pessoa {

//Construtores
	public Cliente(String nomeCliente, int idCliente, String cpfCliente, Telefone telCliente) {
		nome = nomeCliente;
		numId = idCliente;
		cpf = cpfCliente;
		numTel = telCliente;
	}
	
	
	/**Transforma o n�mero de ID em uma String
	 * 
	 * @return String - N�mero de ID
	 */
	public String toStringId() {
		Integer id = numId;
		return id.toString();
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
