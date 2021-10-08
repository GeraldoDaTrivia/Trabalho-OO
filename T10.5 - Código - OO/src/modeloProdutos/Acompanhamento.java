package modeloProdutos;

import modeloAbstratas.Produto;

/**Classe para objetos do tipo Acompanhamento, onde serão armazenados os valores e métodos dos mesmos.
 * @see Bebida
 * @see Burger
 * @see Combo
 * @see Infantil
 * @see Personalizavel
 * @see Promocao
 * @see Sobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Acompanhamento extends Produto {

//Atributos
	private String tipoAcomp;
	private String ingredientes;
	

//Construtores
	public Acompanhamento(String nomeAcomp, String tipo, String ingredAcomp, double valorAcomp) {
		nome = nomeAcomp;
		tipoAcomp = tipo;
		ingredientes = ingredAcomp;
		valor = valorAcomp;
	}
	
	
//Gets e sets
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
