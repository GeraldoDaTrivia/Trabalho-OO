package trabalho;

public class Personalizavel extends Produto {

	private int quantCarne;
	private String addIngred;
	private int escolhaMolho;
	private Burger burgPerson;
	

	public Personalizavel() {
		
	}

	public Burger getBurgPerson() {
		return burgPerson;
	}

	public void setBurgPerson(Burger burgPerson) {
		this.burgPerson = burgPerson;
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
