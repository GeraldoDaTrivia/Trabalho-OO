package modeloPessoaELoja;

import modeloAbstratas.Pessoa;

/**Classe para objetos do tipo Funcionario, onde serão armazenados os valores e métodos dos mesmos.
 * @see Pessoa
 * @see Cliente
 * @see Telefone
 * @see Endereco
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
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
	
	
	/**Transforma o número de ID em uma String
	 * 
	 * @return String - Número de ID
	 */
	public String toStringId() {
		Integer id = numId;
		return id.toString();
	}
	
	/**Transforma o RG em uma String
	 * 
	 * @return String - RG
	 */
	public String toStringRg() {
		Integer numRg = this.rg;
		return numRg.toString();
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
	
	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
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

}
