package modeloPessoaELoja;

/**Classe para objetos do tipo Endereco, onde serão armazenados os valores e métodos dos mesmos.
 * @see Telefone
 * @see HoraFuncionamento
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Endereco {

//Atributos
	private int cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numCasa;
	
	
//Construtores
	public Endereco(int numCep, String est, String cid, String bai, String nomeRua, int numeroCasa) {
		cep = numCep;
		estado = est;
		cidade = cid;
		bairro = bai;
		rua = nomeRua;
		numCasa = numeroCasa;
	}
	
	/**Transforma o valor do CEP em uma String
	 * 
	 * @return String - CEP
	 */
	public String toStringCep() {
		Integer cep = this.cep;
		return cep.toString();
	}
	
	/**Transforma o número da casa em uma String
	 * 
	 * @return String - Número da casa
	 */
	public String toStringNumCasa() {
		Integer numCasa = this.numCasa;
		return numCasa.toString();
	}
	

//Gets e sets
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

}
