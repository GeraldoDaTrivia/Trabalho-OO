package modeloAbstratas;

import modeloProdutos.*;

/**Determina atributos e métodos comuns para as classes do tipo Produto.
 * @see Acompanhamento
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
public abstract class Produto {

//Atributos
	protected String nome;
	protected double valor;
	
	
//Gets e sets
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
