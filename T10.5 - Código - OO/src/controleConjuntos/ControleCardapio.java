package controleConjuntos;

import modeloConjuntos.Cardapio;
import modeloDados.DadoProduto;
import modeloProdutos.*;

/**Classe para armazenar objetos do tipo {@link Cardapio}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleDado
 * @see ControleSobreALoja
 * @see ControleVenda
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleCardapio {

//Atributos
	private Cardapio cardapio;
	
	
//Construtor
	/**
	 * Construtor cardapio
	 * @param dados - dados do programa
	 */
	public ControleCardapio(DadoProduto dados) {
		cardapio = dados.getCardapio();
	}

	
//Get Cardapio
	public Cardapio getCardapio() {
		return cardapio;
	}

//Get Produtos
	public Acompanhamento[] getCardapioAcomp() {
		return cardapio.getAcompCardapio();
	}
	
	public Bebida[] getCardapioBeb() {
		return cardapio.getBebCardapio();
	}
	
	public Burger[] getCardapioBurg() {
		return cardapio.getBurgCardapio();
	}
	
	public Combo[] getCardapioCombo() {
		return cardapio.getComboCardapio();
	}
	
	public Infantil[] getCardapioInf() {
		return cardapio.getInfCardapio();
	}
	
	public Personalizavel[] getCardapioPers() {
		return cardapio.getPersCardapio();
	}
	
	public Promocao[] getCardapioPromo() {
		return cardapio.getPromoCardapio();
	}
	
	public Sobremesa[] getCardapioSobre(){
		return cardapio.getSobreCardapio();
	}

	
//Get Quantidade de produtos
	public int getQtdAcomp() {
		return cardapio.getQtdAcomp();
	}
	
	public int getQtdBebida() {
		return cardapio.getQtdBebida();
	}
	
	public int getQtdBurger() {
		return cardapio.getQtdBurger();
	}
	
	public int getQtdCombo() {
		return cardapio.getQtdCombo();
	}
	
	public int getQtdInfantil() {
		return cardapio.getQtdInfantil();
	}
	
	public int getQtdPers() {
		return cardapio.getQtdPers();
	}
	
	public int getQtdPromo() {
		return cardapio.getQtdPromo();
	}
	
	public int getQtdSobre() {
		return cardapio.getQtdSobre();
	}

}
