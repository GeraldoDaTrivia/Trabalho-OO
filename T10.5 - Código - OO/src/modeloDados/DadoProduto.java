package modeloDados;

import modeloConjuntos.Cardapio;
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
	
	private Cardapio cardapio;
	
	
//Entrada de Dados Aleatorios
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			acompanhamentos[i] = new Acompanhamento("Acompanhamento"+i, "Tipo"+i, "Ingredientes"+i, 5*(i+1));
			bebidas[i] = new Bebida("Tipo"+i, "Bebida"+i, "Sabor"+i, "Tamanho"+(i*100), 2*(i+1));
			burgers[i] = new Burger("Burger"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, 10*(i+1));
			combos[i] = new Combo("Combo"+i, burgers[i], acompanhamentos[i], bebidas[i], 14*(i+1));
			infantis[i] = new Infantil("Infantil"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, acompanhamentos[i], bebidas[i], 11*(i+1));
			personalizaveis[i] = new Personalizavel("Personalizavel"+i, burgers[i], (i+1), "Ingredientes Adicionais"+i, i, 12*(i+1));
			sobremesas[i] = new Sobremesa("Tipo"+i, "Sobremesa"+i, "Ingredientes"+i, 3*(i+1));
			promocoes[i] = new Promocao("Promocao"+i, "Dias"+i, burgers[i], sobremesas[i], 9*(i+1));
			
		}
		
	//Set Quantidade
		qtdAcomps = 5;
		qtdBebida = 5;
		qtdBurger = 5;
		qtdCombos = 5;
		qtdInfantis = 5;
		qtdPers = 5;
		qtdPromocoes = 5;
		qtdSobremesa = 5;
		
	}
	
	public void fillCardapioWithData() {
		cardapio = new Cardapio();
	}

	
//Cardapio
	public Cardapio getCardapio() {
		return cardapio;
	}
	
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	public void resetarCardapio() {
		cardapio = new Cardapio();
	}

	
//Acompanhamentos
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}
	
	public Acompanhamento getOneAcompanhamento(int i) {
		return acompanhamentos[i];
	}
	
	public void setAcompanhamentos(Acompanhamento[] acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	
	public void inserirEditarAcomp(Acompanhamento[] acompanhamentos, int pos) {
		this.acompanhamentos[pos] = acompanhamentos[pos];
		if(pos == qtdAcomps) qtdAcomps++;
		this.cardapio.setAcompCardapio(this.acompanhamentos);
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
	
	public Bebida getOneBebida(int i) {
		return bebidas[i];
	}
	
	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	
	public void inserirEditarBebida(Bebida[] bebida, int pos) {
		this.bebidas[pos] = bebida[pos];
		if(pos == qtdBebida) qtdBebida++;
		this.cardapio.setBebCardapio(this.bebidas);
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
	
	public Burger getOneBurger(int i) {
		return burgers[i];
	}
	
	public void setBurgers(Burger[] burgers) {
		this.burgers = burgers;
	}

	public void inserirEditarBurger(Burger[] burger, int pos) {
		this.burgers[pos] = burger[pos];
		if(pos == qtdBurger) qtdBurger++;
		this.cardapio.setBurgCardapio(this.burgers);
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
	
	public Combo getOneCombo(int i) {
		return combos[i];
	}
	
	public void setCombos(Combo[] combos) {
		this.combos = combos;
	}
	
	public void inserirEditarCombo(Combo[] combo, int pos) {
		this.combos[pos] = combo[pos];
		if(pos == qtdCombos) qtdCombos++;
		this.cardapio.setComboCardapio(this.combos);
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
	
	public Infantil getOneInfantil(int i) {
		return infantis[i];
	}
	
	public void setInfantis(Infantil[] infantis) {
		this.infantis = infantis;
	}
	
	public void inserirEditarInfantil(Infantil[] infantil, int pos) {
		this.infantis[pos] = infantil[pos];
		if(pos == qtdInfantis) qtdInfantis++;
		this.cardapio.setInfCardapio(this.infantis);
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
	
	public Personalizavel getOnePers(int i) {
		return personalizaveis[i];
	}
	
	public void setPersonalizaveis(Personalizavel[] personalizavel) {
		this.personalizaveis = personalizavel;
	}
	
	public void inserirEditarPers(Personalizavel[] personalizavel, int pos) {
		this.personalizaveis[pos] = personalizavel[pos];
		if(pos == qtdPers) qtdPers++;
		this.cardapio.setPersCardapio(this.personalizaveis);
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
	
	public Promocao getOnePromo(int i) {
		return promocoes[i];
	}
	
	public void setPromocoes(Promocao[] promocoes) {
		this.promocoes = promocoes;
	}
	
	public void inserirEditarPromo(Promocao[] promo, int pos) {
		this.promocoes[pos] = promo[pos];
		if(pos == qtdPromocoes) qtdPromocoes++;
		this.cardapio.setPromoCardapio(this.promocoes);
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
	
	public Sobremesa getOneSobre(int i) {
		return sobremesas[i];
	}
	
	public void setSobremesas(Sobremesa[] sobremesas) {
		this.sobremesas = sobremesas;
	}
	
	public void inserirEditarSobremesa(Sobremesa[] sobre, int pos) {
		this.sobremesas[pos] = sobre[pos];
		if(pos == qtdSobremesa) qtdSobremesa++;
		this.cardapio.setSobreCardapio(this.sobremesas);
	}
	
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}
	
	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}

}
