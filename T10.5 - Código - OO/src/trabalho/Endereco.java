package trabalho;

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
	
	@Override
	public String toString() {
		return "CEP: " + cep + 
				", Estado: " + estado + 
				", Cidade: " + cidade + 
				"\nBairro: " + bairro + 
				", Rua: " + rua + 
				", Casa: " + numCasa + 
				".";
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
