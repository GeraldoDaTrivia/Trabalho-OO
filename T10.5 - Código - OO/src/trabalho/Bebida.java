package trabalho;

public class Bebida extends Produto {
	
//Atributos
	private String tipoBebida;
	private String sabor;
	private String tamRecipiente;
	
	
//Construtores
	public Bebida(String tipo, String sabBebida, String tamBebida, String nomeBebida, double valorBebida) {
		tipoBebida = tipo;
		sabor = sabBebida;
		tamRecipiente = tamBebida;
		nome = nomeBebida;
		valor = valorBebida;
	}
	
	@Override
	public String toString() {
		return "Bebida : " + nome + " - R$" + valor;
	}
	
	
//Gets e sets
	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamRecipiente() {
		return tamRecipiente;
	}

	public void setTamRecipiente(String tamRecipiente) {
		this.tamRecipiente = tamRecipiente;
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
