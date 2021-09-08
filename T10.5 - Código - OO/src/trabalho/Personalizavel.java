package trabalho;

public class Personalizavel extends Produto {

//Atributos
	private int quantCarne;
	private String addIngred;
	private int escolhaMolho;
	private Burger burgPers;
	

//Construtores
	public Personalizavel(int qtdCarne, String addIng, int escMolho, Burger burg, String nomePers, double valorPers) {
		quantCarne = qtdCarne;
		addIngred = addIng;
		escolhaMolho = escMolho;
		burgPers = burg;
		nome = nomePers;
		valor = valorPers;
	}

	@Override
	public String toString() {
		return "Personalizavel : " + nome + " - R$" + valor; 
	}
	
	
//Gets e sets
	public Burger getBurgPers() {
		return burgPers;
	}

	public void setBurgPers(Burger burgPers) {
		this.burgPers = burgPers;
	}
	
	public int getQuantCarne() {
		return quantCarne;
	}

	public void setQuantCarne(int quantCarne) {
		this.quantCarne = quantCarne;
	}

	public String getAddIngred() {
		return addIngred;
	}

	public void setAddIngred(String addIngred) {
		this.addIngred = addIngred;
	}

	public int getEscolhaMolho() {
		return escolhaMolho;
	}

	public void setEscolhaMolho(int escolhaMolho) {
		this.escolhaMolho = escolhaMolho;
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
