package trabalho;

public class Promocao extends Produto {

//Atributos
	private String diasValidos;
	private Burger burgPromo;
	private Sobremesa sobrePromo;


//Construtores
	public Promocao(String dias, Burger burg, Sobremesa sobre, String nomePromo, double valorPromo) {
		diasValidos = dias;
		burgPromo = burg;
		sobrePromo = sobre;
		nome = nomePromo;
		valor = valorPromo;
	}
	
	@Override
	public String toString() {
		return "Promocao : " + nome + " - R$" + valor;
	}
	
	
//Gets e sets
	public Burger getBurgPromo() {
		return burgPromo;
	}

	public void setBurgPromo(Burger burgPromo) {
		this.burgPromo = burgPromo;
	}

	public Sobremesa getSobrePromo() {
		return sobrePromo;
	}

	public void setSobrePromo(Sobremesa sobrePromo) {
		this.sobrePromo = sobrePromo;
	}
	
	public String getDiasValidos() {
		return diasValidos;
	}

	public void setDiasValidos(String diasValidos) {
		this.diasValidos = diasValidos;
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
