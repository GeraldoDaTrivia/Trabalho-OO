package modeloProdutos;

import modeloAbstratas.Produto;

/**Classe para objetos do tipo Burger, onde serão armazenados os valores e métodos dos mesmos.
 * @see Acompanhamento
 * @see Bebida
 * @see Combo
 * @see Infantil
 * @see Personalizavel
 * @see Promocao
 * @see Sobremesa
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Burger extends Produto {

//Atributos
	private String tipoCarne;
	private String ingredientes;
	private String molho;
	
	
//Construtores
	public Burger(String nomeBurg, String carne, String ingredBurg, String molhoBurg, double valorBurg) {
		nome = nomeBurg;
		tipoCarne = carne;
		ingredientes = ingredBurg;
		molho = molhoBurg;
		valor = valorBurg;
	}
	
	
//Gets e sets
	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
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
