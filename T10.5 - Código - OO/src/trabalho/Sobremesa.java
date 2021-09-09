package trabalho;

public class Sobremesa extends Produto {

//Atributos
	private String tipoSobre;
	private String ingredientes;
	
	
//Construtores
	public Sobremesa(String tipo, String ingredSobre, String nomeSobre, double valorSobre) {
		tipoSobre = tipo;
		ingredientes = ingredSobre;
		nome = nomeSobre;
		valor = valorSobre;
	}
	
	@Override
	public String toString() {
		return nome + " - R$" + valor;
	}
	
	
//Gets e sets
	public String getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(String tipoSobre) {
		this.tipoSobre = tipoSobre;
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
