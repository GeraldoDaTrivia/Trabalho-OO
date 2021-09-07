package trabalho;

public class Sobremesa extends Produto {

	private String tipoSobre;
	private String ingredienets;
	
	public Sobremesa() {
		
	}
	
	public String getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(String tipoSobre) {
		this.tipoSobre = tipoSobre;
	}

	public String getIngredienets() {
		return ingredienets;
	}

	public void setIngredienets(String ingredienets) {
		this.ingredienets = ingredienets;
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
