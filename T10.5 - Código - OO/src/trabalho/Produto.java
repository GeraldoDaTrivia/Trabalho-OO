package trabalho;

public abstract class Produto {

//Atributos
	protected String nome;
	protected double valor;
	
	
//Gets e sets
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
