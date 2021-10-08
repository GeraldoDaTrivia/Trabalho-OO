package modeloProdutos;

import modeloAbstratas.Produto;

/**Classe para objetos do tipo Sobremesa, onde serão armazenados os valores e métodos dos mesmos.
 * @see Acompanhamento
 * @see Bebida
 * @see Burger
 * @see Combo
 * @see Infantil
 * @see Personalizavel
 * @see Promocao
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Sobremesa extends Produto {

//Atributos
	private String tipoSobre;
	private String ingredientes;
	
	
//Construtores
	public Sobremesa(String tipo, String nomeSobre, String ingredSobre, double valorSobre) {
		tipoSobre = tipo;
		nome = nomeSobre;
		ingredientes = ingredSobre;
		valor = valorSobre;
	}
	
	
//Gets e sets
	public String getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(String tipoSobre) {
		this.tipoSobre = tipoSobre;
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
