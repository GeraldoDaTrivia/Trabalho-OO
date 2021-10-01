package modeloConjuntos;

import modeloDados.DadoProduto;
import modeloProdutos.*;

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
	
	//Strings para melhor formatacao
	private String burgerLista = "";
	private String acompLista = "";
	private String bebidaLista = "";
	private String infantilLista = "";
	private String comboLista = "";
	private String persLista = "";
	private String sobreLista = "";
	private String promoLista = "";
	
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
	
	
//toString Principal
	@Override
	public String toString() {
		return "-------======= Cardapio =======-------\n" + 
				"\n# Burgers #\n" +
				toStringBurger() +
				"\n# Acompanhamentos #\n" +
				toStringAcomp() + 
				"\n# Bebidas #\n" +
				toStringBebida() + 
				"\n# Infantis #\n" +
				toStringInfantil() + 
				"\n# Combos #\n" +
				toStringCombo() + 
				"\n# Personalizaveis #\n" +
				toStringPers() + 
				"\n# Sobremesas #\n" +
				toStringSobre() + 
				"\n# Promocoes #\n" +
				toStringPromo() + 
				"\n-------=======##########=======-------\n\n";
	}
	
//toString Secundarias
	
	//toString Acompanhamento
	public String toStringAcomp() {
		
		for(int i = 0; i < qtdAcomp; i++) {
			acompLista = acompLista.concat("[");
			acompLista = acompLista.concat(acompCardapio[i].toString());
			acompLista = acompLista.concat("]");
			acompLista = acompLista.concat("\n");
		}
		
		if(qtdAcomp==0) {
			acompLista = acompLista.concat("[");
			acompLista = acompLista.concat("]");
			acompLista = acompLista.concat("\n");
		}
		
		return acompLista;
	}
	
	
	//toString Bebida
	public String toStringBebida() {
		
		for(int i = 0; i < qtdBebida; i++) {
			bebidaLista = bebidaLista.concat("[");
			bebidaLista = bebidaLista.concat(bebCardapio[i].toString());
			bebidaLista = bebidaLista.concat("]");
			bebidaLista = bebidaLista.concat("\n");
		}
		
		if(qtdBebida==0) {
			bebidaLista = bebidaLista.concat("[");
			bebidaLista = bebidaLista.concat("]");
			bebidaLista = bebidaLista.concat("\n");
		}
		
		return bebidaLista;
	}
	
	//toString Burger
	public String toStringBurger() {
		
		for(int i = 0; i < qtdBurger; i++) {
			burgerLista = burgerLista.concat("[");
			burgerLista = burgerLista.concat(burgCardapio[i].toString());
			burgerLista = burgerLista.concat("]");
			burgerLista = burgerLista.concat("\n");
		}
		
		if(qtdBurger==0) {
			burgerLista = burgerLista.concat("[");
			burgerLista = burgerLista.concat("]");
			burgerLista = burgerLista.concat("\n");
		}
		
		return burgerLista;
	}
	
	//toString Combo
	public String toStringCombo() {
		
		for(int i = 0; i < qtdCombo; i++) {
			comboLista = comboLista.concat("[");
			comboLista = comboLista.concat(comboCardapio[i].toString());
			comboLista = comboLista.concat("]");
			comboLista = comboLista.concat("\n");
		}
		
		if(qtdCombo==0) {
			comboLista = comboLista.concat("[");
			comboLista = comboLista.concat("]");
			comboLista = comboLista.concat("\n");
		}
		
		return comboLista;
	}
	
	//toString Infantil
	public String toStringInfantil() {
		
		for(int i = 0; i < qtdInfantil; i++) {
			infantilLista = infantilLista.concat("[");
			infantilLista = infantilLista.concat(infCardapio[i].toString());
			infantilLista = infantilLista.concat("]");
			infantilLista = infantilLista.concat("\n");
		}
		
		if(qtdInfantil==0) {
			infantilLista = infantilLista.concat("[");
			infantilLista = infantilLista.concat("]");
			infantilLista = infantilLista.concat("\n");
		}
		
		return infantilLista;
	}
	
	//toString Personalizavel
	public String toStringPers() {
		
		for(int i = 0; i < qtdPers; i++) {
			persLista = persLista.concat("[");
			persLista = persLista.concat(persCardapio[i].toString());
			persLista = persLista.concat("]");
			persLista = persLista.concat("\n");
		}
		
		if(qtdPers==0) {
			persLista = persLista.concat("[");
			persLista = persLista.concat("]");
			persLista = persLista.concat("\n");
		}
		
		return persLista;
	}
	
	//toString Promocao
	public String toStringPromo() {
		
		for(int i = 0; i < qtdPromo; i++) {
			promoLista = promoLista.concat("[");
			promoLista = promoLista.concat(promoCardapio[i].toString());
			promoLista = promoLista.concat("]");
			promoLista = promoLista.concat("\n");
		}
		
		if(qtdPromo==0) {
			promoLista = promoLista.concat("[");
			promoLista = promoLista.concat("]");
			promoLista = promoLista.concat("\n");
		}
		
		return promoLista;
	}
	
	//toString Sobremesa
	public String toStringSobre() {
		
		for(int i = 0; i < qtdSobre; i++) {
			sobreLista = sobreLista.concat("[");
			sobreLista = sobreLista.concat(sobreCardapio[i].toString());
			sobreLista = sobreLista.concat("]");
			sobreLista = sobreLista.concat("\n");
		}
		
		if(qtdSobre==0) {
			sobreLista = sobreLista.concat("[");
			sobreLista = sobreLista.concat("]");
			sobreLista = sobreLista.concat("\n");
		}
		
		return sobreLista;
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
