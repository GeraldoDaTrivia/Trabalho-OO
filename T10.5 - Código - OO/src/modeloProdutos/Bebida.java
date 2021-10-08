package modeloProdutos;

import modeloAbstratas.Produto;

/**Classe para objetos do tipo Bebida, onde serão armazenados os valores e métodos dos mesmos.
 * @see Acompanhamento
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
public class Bebida extends Produto {
	
//Atributos
	private String tipoBebida;
	private String sabor;
	private String tamRecipiente;
	
	
//Construtores
	public Bebida(String tipo, String nomeBebida, String sabBebida, String tamBebida, double valorBebida) {
		tipoBebida = tipo;
		nome = nomeBebida;
		sabor = sabBebida;
		tamRecipiente = tamBebida;
		valor = valorBebida;
	}
	
	
//Gets e sets
	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamRecipiente() {
		return tamRecipiente;
	}

	public void setTamRecipiente(String tamRecipiente) {
		this.tamRecipiente = tamRecipiente;
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
