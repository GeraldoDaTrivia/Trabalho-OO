package modeloConjuntos;

import java.util.*;
import modeloProdutos.*;
import principal.Teste;

public class Cardapio {

//Atributos
	
	//ArrayLists de produtos
	private ArrayList<Burger> burgCardapio = new ArrayList<>();
	private ArrayList<Acompanhamento> acompCardapio = new ArrayList<>();
	private ArrayList<Bebida> bebCardapio = new ArrayList<>();
	private ArrayList<Infantil> infCardapio = new ArrayList<>();
	private ArrayList<Combo> comboCardapio = new ArrayList<>();
	private ArrayList<Personalizavel> persCardapio = new ArrayList<>();
	private ArrayList<Sobremesa> sobreCardapio = new ArrayList<>();
	private ArrayList<Promocao> promoCardapio = new ArrayList<>();
	
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
	private int qtdBurger;
	private int qtdAcomp;
	private int qtdBebida;
	private int qtdInfantil;
	private int qtdCombo;
	private int qtdPers;
	private int qtdSobre;
	private int qtdPromo;
	
	
//Construtores
	public Cardapio(int qtdBurg, int qtdAcom, int qtdBeb, int qtdInf, int qtdCom, int qtdPer, int qtdSob, int qtdPro) {
		qtdBurger = qtdBurg;
		qtdAcomp = qtdAcom;
		qtdBebida = qtdBeb;
		qtdInfantil = qtdInf;
		qtdCombo = qtdCom;
		qtdPers = qtdPer;
		qtdSobre = qtdSob;
		qtdPromo = qtdPro;
	}
	
	
//toString Principal
	@Override
	public String toString() {
		
		burgCardapio = Teste.burgCardapio;
		acompCardapio = Teste.acompCardapio;
		bebCardapio = Teste.bebCardapio;
		infCardapio = Teste.infCardapio;
		comboCardapio = Teste.comboCardapio;
		persCardapio = Teste.persCardapio;
		sobreCardapio = Teste.sobreCardapio;
		promoCardapio = Teste.promoCardapio;
		
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
	//toString Burger
	public String toStringBurger() {
		
		for(int i = 0; i < qtdBurger; i++) {
			burgerLista = burgerLista.concat("[");
			burgerLista = burgerLista.concat(burgCardapio.get(i).toString());
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
	
	//toString Acompanhamento
	public String toStringAcomp() {
		
		for(int i = 0; i < qtdAcomp; i++) {
			acompLista = acompLista.concat("[");
			acompLista = acompLista.concat(acompCardapio.get(i).toString());
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
			bebidaLista = bebidaLista.concat(bebCardapio.get(i).toString());
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
	
	
	//toString Infantil
	public String toStringInfantil() {
		
		for(int i = 0; i < qtdInfantil; i++) {
			infantilLista = infantilLista.concat("[");
			infantilLista = infantilLista.concat(infCardapio.get(i).toString());
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
	
	
	//toString Combo
	public String toStringCombo() {
		
		for(int i = 0; i < qtdCombo; i++) {
			comboLista = comboLista.concat("[");
			comboLista = comboLista.concat(comboCardapio.get(i).toString());
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
	
	
	//toString Personalizavel
	public String toStringPers() {
		
		for(int i = 0; i < qtdPers; i++) {
			persLista = persLista.concat("[");
			persLista = persLista.concat(persCardapio.get(i).toString());
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
	
	
	//toString Sobremesa
	public String toStringSobre() {
		
		for(int i = 0; i < qtdSobre; i++) {
			sobreLista = sobreLista.concat("[");
			sobreLista = sobreLista.concat(sobreCardapio.get(i).toString());
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
	
	
	//toString Promocao
	public String toStringPromo() {
		
		for(int i = 0; i < qtdPromo; i++) {
			promoLista = promoLista.concat("[");
			promoLista = promoLista.concat(promoCardapio.get(i).toString());
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
	
	
//Gets e sets
	public ArrayList<Burger> getBurgCardapio() {
		return burgCardapio;
	}

	public void setBurgCardapio(ArrayList<Burger> burgCardapio) {
		this.burgCardapio = burgCardapio;
	}

	public ArrayList<Acompanhamento> getAcompCardapio() {
		return acompCardapio;
	}

	public void setAcompCardapio(ArrayList<Acompanhamento> acompCardapio) {
		this.acompCardapio = acompCardapio;
	}

	public ArrayList<Bebida> getBebCardapio() {
		return bebCardapio;
	}

	public void setBebCardapio(ArrayList<Bebida> bebCardapio) {
		this.bebCardapio = bebCardapio;
	}

	public ArrayList<Infantil> getInfCardapio() {
		return infCardapio;
	}

	public void setInfCardapio(ArrayList<Infantil> infCardapio) {
		this.infCardapio = infCardapio;
	}

	public ArrayList<Combo> getComboCardapio() {
		return comboCardapio;
	}

	public void setComboCardapio(ArrayList<Combo> comboCardapio) {
		this.comboCardapio = comboCardapio;
	}

	public ArrayList<Personalizavel> getPersCardapio() {
		return persCardapio;
	}

	public void setPersCardapio(ArrayList<Personalizavel> persCardapio) {
		this.persCardapio = persCardapio;
	}

	public ArrayList<Sobremesa> getSobreCardapio() {
		return sobreCardapio;
	}

	public void setSobreCardapio(ArrayList<Sobremesa> sobreCardapio) {
		this.sobreCardapio = sobreCardapio;
	}

	public ArrayList<Promocao> getPromoCardapio() {
		return promoCardapio;
	}

	public void setPromoCardapio(ArrayList<Promocao> promoCardapio) {
		this.promoCardapio = promoCardapio;
	}
	
	public int getQtdBurger() {
		return qtdBurger;
	}

	public void setQtdBurger(int qtdBurger) {
		this.qtdBurger = qtdBurger;
	}

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

	public int getQtdInfantil() {
		return qtdInfantil;
	}

	public void setQtdInfantil(int qtdInfantil) {
		this.qtdInfantil = qtdInfantil;
	}

	public int getQtdCombo() {
		return qtdCombo;
	}

	public void setQtdCombo(int qtdCombo) {
		this.qtdCombo = qtdCombo;
	}

	public int getQtdPers() {
		return qtdPers;
	}

	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}

	public int getQtdSobre() {
		return qtdSobre;
	}

	public void setQtdSobre(int qtdSobre) {
		this.qtdSobre = qtdSobre;
	}

	public int getQtdPromo() {
		return qtdPromo;
	}

	public void setQtdPromo(int qtdPromo) {
		this.qtdPromo = qtdPromo;
	}
	
}
