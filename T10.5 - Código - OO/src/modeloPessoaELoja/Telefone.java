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
	
	
//toString
	@Override
	public String toString() {
		return "("+ddd+")"+numero;
	}
	
	public String toStringDdd() {
		Integer ddd = this.ddd;
		return ddd.toString();
	}
	
	public String toStringNum() {
		Integer num = numero;
		return num.toString();
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
