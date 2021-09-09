package trabalho;

public class Acompanhamento extends Produto {

//Atributos
	private String tipoAcomp;
	private String ingredientes;
	

//Construtores
	public Acompanhamento(String tipo, String ingredAcomp, String nomeAcomp, double valorAcomp) {
		tipoAcomp = tipo;
		ingredientes = ingredAcomp;
		nome = nomeAcomp;
		valor = valorAcomp;
	}
	
	@Override
	public String toString() {
		return nome + " - R$" + valor;
	}
	
	
//Gets e sets
	public String getTipoAcomp() {
		return tipoAcomp;
	}

	public void setTipoAcomp(String tipoAcomp) {
		this.tipoAcomp = tipoAcomp;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
