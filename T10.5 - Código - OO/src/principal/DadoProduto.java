package principal;

import modeloProdutos.*;

public class DadoProduto {

//Atributos
	private Acompanhamento[] acompanhamentos = new Acompanhamento[50];
	private int qtdAcomps = 0;
	private Bebida[] bebidas = new Bebida[50];
	private int qtdBebida = 0;
	private Burger[] burgers = new Burger[50];
	private int qtdBurger = 0;
	private Combo[] combos = new Combo[50];
	private int qtdCombos = 0;
	private Infantil[] infantis = new Infantil[50];
	private int qtdInfantis = 0;
	private Personalizavel[] personalizaveis = new Personalizavel[50];
	private int qtdPers = 0;
	private Promocao[] promocoes = new Promocao[50];
	private int qtdPromocoes = 0;
	private Sobremesa[] sobremesas = new Sobremesa[50];
	private int qtdSobremesa = 0;
	
	
//Entrada de Dados Aleatorios
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			acompanhamentos[i] = new Acompanhamento("Acompanhamento"+i, "Tipo"+i, "Ingredientes"+i, 5*(i+1));
			bebidas[i] = new Bebida("Tipo"+i, "Bebida"+i, "Sabor"+i, "Tamanho"+(i*100), 2*(i+1));
			burgers[i] = new Burger("Burger"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, 10*(i+1));
			combos[i] = new Combo("Combo"+i, burgers[i], acompanhamentos[i], bebidas[i], 14*(i+1));
			infantis[i] = new Infantil("Nome"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, acompanhamentos[i], bebidas[i], 11*(i+1));
			personalizaveis[i] = new Personalizavel("Personalizavel"+i, burgers[i], (i+1), "Ingredientes Adicionais"+i, i, 12*(i+1));
			sobremesas[i] = new Sobremesa("Tipo"+i, "Sobremesa"+i, "Ingredientes"+i, 3*(i+1));
			promocoes[i] = new Promocao("Promocao"+i, "Dias"+i, burgers[i], sobremesas[i], 9*(i+1));
			
		}
		
		qtdAcomps = 5;
		qtdBebida = 5;
		qtdBurger = 5;
		qtdCombos = 5;
		qtdInfantis = 5;
		qtdPers = 5;
		qtdPromocoes = 5;
		qtdSobremesa = 5;
	}

	
//Acompanhamentos
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}
	
	public void setAcompanhamentos(Acompanhamento[] acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	
	public void inserirEditarAcomp(Acompanhamento acompanhamentos, int pos) {
		this.acompanhamentos[pos] = acompanhamentos;
		if(pos == qtdAcomps) qtdAcomps++;
	}
	
	public int getQtdAcomps() {
		return qtdAcomps;
	}
	
	public void setQtdAcomps(int qtdAcomps) {
		this.qtdAcomps = qtdAcomps;
	}
	

//Bebidas
	public Bebida[] getBebidas() {
		return bebidas;
	}
	
	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	
	public void inserirEditarBebida(Bebida bebida, int pos) {
		this.bebidas[pos] = bebida;
		if(pos == qtdBebida) qtdBebida++;
	}
	
	public int getQtdBebida() {
		return qtdBebida;
	}
	
	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
	}


//Burgers
	public Burger[] getBurgers() {
		return burgers;
	}

	public void setBurgers(Burger[] burgers) {
		this.burgers = burgers;
	}

	public void inserirEditarBurger(Burger burger, int pos) {
		this.burgers[pos] = burger;
		if(pos == qtdBurger) qtdBurger++;
	}
	
	public int getQtdBurger() {
		return qtdBurger;
	}

	public void setQtdBurger(int qtdBurger) {
		this.qtdBurger = qtdBurger;
	}

	
//Combos
	public Combo[] getCombos() {
		return combos;
	}
	
	public void setCombos(Combo[] combos) {
		this.combos = combos;
	}
	
	public void inserirEditarCombo(Combo combo, int pos) {
		this.combos[pos] = combo;
		if(pos == qtdCombos) qtdCombos++;
	}
	
	public int getQtdCombos() {
		return qtdCombos;
	}
	
	public void setQtdCombos(int qtdCombos) {
		this.qtdCombos = qtdCombos;
	}


//Infantis
	public Infantil[] getInfantil() {
		return infantis;
	}
	
	public void setInfantis(Infantil[] infantis) {
		this.infantis = infantis;
	}
	
	public void inserirEditarInfantil(Infantil infantil, int pos) {
		this.infantis[pos] = infantil;
		if(pos == qtdInfantis) qtdInfantis++;
	}
	
	public int getQtdInfantis() {
		return qtdInfantis;
	}
	
	public void setQtdInfantis(int qtdInfantis) {
		this.qtdInfantis = qtdInfantis;
	}
	
	
//Personalizaveis
	public Personalizavel[] getPersonalizaveis() {
		return personalizaveis;
	}
	
	public void setPersonalizaveis(Personalizavel[] personalizavel) {
		this.personalizaveis = personalizavel;
	}
	
	public void inserirEditarPers(Personalizavel personalizavel, int pos) {
		this.personalizaveis[pos] = personalizavel;
		if(pos == qtdPers) qtdPers++;
	}
	
	public int getQtdPers() {
		return qtdPers;
	}
	
	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}
	
	
//Promocoes
	public Promocao[] getPromocoes() {
		return promocoes;
	}
	
	public void setPromocoes(Promocao[] promocoes) {
		this.promocoes = promocoes;
	}
	
	public void inserirEditarPromo(Promocao promo, int pos) {
		this.promocoes[pos] = promo;
		if(pos == qtdPromocoes) qtdPromocoes++;
	}
	
	public int getQtdPromo() {
		return qtdPromocoes;
	}
	
	public void setQtdPromo(int qtdPromo) {
		this.qtdPromocoes = qtdPromo;
	}
	
	
//Sobremesas
	public Sobremesa[] getSobremesas() {
		return sobremesas;
	}
	
	public void setSobremesas(Sobremesa[] sobremesas) {
		this.sobremesas = sobremesas;
	}
	
	public void inserirEditarSobremesa(Sobremesa sobre, int pos) {
		this.sobremesas[pos] = sobre;
		if(pos == qtdSobremesa) qtdSobremesa++;
	}
	
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}
	
	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}

}
