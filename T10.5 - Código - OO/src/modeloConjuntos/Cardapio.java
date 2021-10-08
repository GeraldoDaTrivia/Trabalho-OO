package modeloConjuntos;

import modeloDados.DadoProduto;
import modeloProdutos.*;

/**Classe composta únicamente das classes do tipo Produto.
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
public class Cardapio {

//Atributos
	
	//Arrays de produtos
	private Acompanhamento[] acompCardapio = new Acompanhamento[50];
	private Bebida[] bebCardapio = new Bebida[50];
	private Burger[] burgCardapio = new Burger[50];
	private Combo[] comboCardapio = new Combo[50];
	private Infantil[] infCardapio = new Infantil[50];
	private Personalizavel[] persCardapio = new Personalizavel[50];
	private Promocao[] promoCardapio = new Promocao[50];
	private Sobremesa[] sobreCardapio = new Sobremesa[50];
	
	//Quantidade de produtos
	private int qtdAcomp;
	private int qtdBebida;
	private int qtdBurger;
	private int qtdCombo;
	private int qtdInfantil;
	private int qtdPers;
	private int qtdPromo;
	private int qtdSobre;
	
	private DadoProduto dados = new DadoProduto();
	
	
//Construtores
	public Cardapio() {
		
		acompCardapio = dados.getAcompanhamentos();
		bebCardapio = dados.getBebidas();
		burgCardapio = dados.getBurgers();
		comboCardapio = dados.getCombos();
		infCardapio = dados.getInfantil();
		persCardapio = dados.getPersonalizaveis();
		promoCardapio = dados.getPromocoes();
		sobreCardapio = dados.getSobremesas();
		
		qtdAcomp = dados.getQtdAcomps();
		qtdBebida = dados.getQtdBebida();
		qtdBurger = dados.getQtdBurger();
		qtdCombo = dados.getQtdCombos();
		qtdInfantil = dados.getQtdInfantis();
		qtdPers = dados.getQtdPers();
		qtdPromo = dados.getQtdPromo();
		qtdSobre = dados.getQtdSobremesa();
		
	}
	
	
//Get-set Produtos
	public Acompanhamento[] getAcompCardapio() {
		return acompCardapio;
	}

	public void setAcompCardapio(Acompanhamento[] acompCardapio) {
		this.acompCardapio = acompCardapio;
	}

	public Bebida[] getBebCardapio() {
		return bebCardapio;
	}

	public void setBebCardapio(Bebida[] bebCardapio) {
		this.bebCardapio = bebCardapio;
	}
	
	public Burger[] getBurgCardapio() {
		return burgCardapio;
	}

	public void setBurgCardapio(Burger[] burgCardapio) {
		this.burgCardapio = burgCardapio;
	}
	
	public Combo[] getComboCardapio() {
		return comboCardapio;
	}

	public void setComboCardapio(Combo[] comboCardapio) {
		this.comboCardapio = comboCardapio;
	}
	
	public Infantil[] getInfCardapio() {
		return infCardapio;
	}

	public void setInfCardapio(Infantil[] infCardapio) {
		this.infCardapio = infCardapio;
	}

	public Personalizavel[] getPersCardapio() {
		return persCardapio;
	}

	public void setPersCardapio(Personalizavel[] persCardapio) {
		this.persCardapio = persCardapio;
	}
	
	public Promocao[] getPromoCardapio() {
		return promoCardapio;
	}

	public void setPromoCardapio(Promocao[] promoCardapio) {
		this.promoCardapio = promoCardapio;
	}
	
	public Sobremesa[] getSobreCardapio() {
		return sobreCardapio;
	}

	public void setSobreCardapio(Sobremesa[] sobreCardapio) {
		this.sobreCardapio = sobreCardapio;
	}

	
//Get-Set Quantidade
	public int getQtdAcomp() {
		return qtdAcomp;
	}

	public void setQtdAcomp(int qtdAcomp) {
		this.qtdAcomp = qtdAcomp;
	}

	public int getQtdBebida() {
		return qtdBebida;
	}

	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
	}
	
	public int getQtdBurger() {
		return qtdBurger;
	}

	public void setQtdBurger(int qtdBurger) {
		this.qtdBurger = qtdBurger;
	}
	
	public int getQtdCombo() {
		return qtdCombo;
	}

	public void setQtdCombo(int qtdCombo) {
		this.qtdCombo = qtdCombo;
	}
	
	public int getQtdInfantil() {
		return qtdInfantil;
	}

	public void setQtdInfantil(int qtdInfantil) {
		this.qtdInfantil = qtdInfantil;
	}

	public int getQtdPers() {
		return qtdPers;
	}

	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}
	
	public int getQtdPromo() {
		return qtdPromo;
	}

	public void setQtdPromo(int qtdPromo) {
		this.qtdPromo = qtdPromo;
	}
	
	public int getQtdSobre() {
		return qtdSobre;
	}

	public void setQtdSobre(int qtdSobre) {
		this.qtdSobre = qtdSobre;
	}
	
}
