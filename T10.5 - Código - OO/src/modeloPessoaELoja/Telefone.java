package modeloPessoaELoja;

public class Telefone {

//Atributos
	private int ddd;
	private int numero;
	
	
//Construtores
	public Telefone(int numDdd, int num) {
		ddd = numDdd;
		numero = num;
	}
	
	@Override
	public String toString() {
		return "(" + ddd + ")" + numero; 
	}
	
	
//Gets e sets
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
