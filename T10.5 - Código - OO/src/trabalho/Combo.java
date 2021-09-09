package trabalho;

public class Combo extends Produto {

//Atributos
	private int escolhaBebida;
	private Burger burgCombo;
	private Acompanhamento acompCombo;
	private Bebida bebCombo;
	

//Construtores
	public Combo(Burger burgCom, Acompanhamento acompCom, Bebida bebCom, String nomeCom, double valorCom) {
		burgCombo = burgCom;
		acompCombo = acompCom;
		bebCombo = bebCom;
		nome = nomeCom;
		valor = valorCom;
	}
	
	@Override
	public String toString() {
		return nome + " - R$" + valor;
	}
	
	
//Gets e sets
	public Burger getBurgCombo() {
		return burgCombo;
	}

	public void setBurgCombo(Burger burgCombo) {
		this.burgCombo = burgCombo;
	}

	public Acompanhamento getAcompCombo() {
		return acompCombo;
	}

	public void setAcompCombo(Acompanhamento acompCombo) {
		this.acompCombo = acompCombo;
	}

	public Bebida getBebCombo() {
		return bebCombo;
	}

	public void setBebCombo(Bebida bebCombo) {
		this.bebCombo = bebCombo;
	}
	
	public int getEscolhaBebida() {
		return escolhaBebida;
	}

	public void setEscolhaBebida(int escolhaBebida) {
		this.escolhaBebida = escolhaBebida;
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
