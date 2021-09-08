package trabalho;

public class Burger extends Produto {

//Atributos
	private String tipoCarne;
	private String ingredientes;
	private String molho;
	
	
//Construtores
	public Burger(String carne, String ingredBurg, String molhoBurg, String nomeBurg, double valorBurg) {
		tipoCarne = carne;
		ingredientes = ingredBurg;
		molho = molhoBurg;
		nome = nomeBurg;
		valor = valorBurg;
	}
	
	@Override
	public String toString() {
		return "Burger: " + nome + " - R$%" + valor; 
	}
	
	
//Gets e sets
	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
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
