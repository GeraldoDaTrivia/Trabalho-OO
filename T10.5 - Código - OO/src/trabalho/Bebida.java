package trabalho;

public class Bebida extends Produto {
	
	private String tipoBebida;
	private String sabor;
	private String tamRecipiente;
	
	public Bebida() {
		
	}
	
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
