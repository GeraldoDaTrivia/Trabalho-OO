package trabalho;

public class Acompanhamento extends Produto {

	private String tipoAcomp;
	private String ingredientes;
	
	public Acompanhamento() {
		
	}
	
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
