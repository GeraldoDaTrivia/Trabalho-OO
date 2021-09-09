package trabalho;

public class Cardapio {

//Atributos
	private Burger[] burgCardapio = new Burger[8];
	private Acompanhamento[] acompCardapio = new Acompanhamento[5];
	private Bebida[] bebCardapio = new Bebida[18];
	private Infantil[] infCardapio = new Infantil[3];
	private Combo[] comboCardapio = new Combo[4];
	private Personalizavel[] persCardapio = new Personalizavel[24];
	private Sobremesa[] sobreCardapio = new Sobremesa[8];
	private Promocao[] promoCardapio = new Promocao[3];
	private int qtdBurger = 0;
	private int qtdAcomp = 0;
	private int qtdBebida = 0;
	private int qtdInfantil = 0;
	private int qtdCombo = 0;
	private int qtdPers = 0;
	private int qtdSobre = 0;
	private int qtdPromo = 0;
	private int qtdCadastro;
	
	
//Construtores
	public Cardapio(Burger burgC[], Acompanhamento acompC[], Bebida bebC[]
			, Infantil infC[], Combo comC[], Personalizavel persC[]
			, Sobremesa sobreC[], Promocao promoC[]) {
		
		
		for(int contador=qtdBurger; contador < 8||contador < qtdCadastro; contador++) {
			burgCardapio[contador] = burgC[contador];
			qtdBurger++;
		}
		for(int contador=qtdAcomp; contador < 5||contador < qtdCadastro; contador++) {
			acompCardapio[contador] = acompC[contador];
			qtdAcomp++;
		}
		for(int contador=qtdBebida; contador < 18||contador < qtdCadastro; contador++) {
			bebCardapio[contador] = bebC[contador];
			qtdBebida++;
		}
		for(int contador=qtdInfantil; contador < 3||contador < qtdCadastro; contador++) {
			infCardapio[contador] = infC[contador];
			qtdInfantil++;
		}
		for(int contador=qtdCombo; contador < 4||contador < qtdCadastro; contador++) {
			comboCardapio[contador] = comC[contador];
			qtdCombo++;
		}
		for(int contador=qtdPers; contador < 24||contador < qtdCadastro; contador++) {
			persCardapio[contador] = persC[contador];
			qtdPers++;
		}
		for(int contador=qtdSobre; contador < 8||contador < qtdCadastro; contador++) {
			sobreCardapio[contador] = sobreC[contador];
			qtdSobre++;
		}
		for(int contador=qtdPromo; contador < 3||contador < qtdCadastro; contador++) {
			promoCardapio[contador] = promoC[contador];
			qtdPromo++;
		}
	}
	
	@Override
	public String toString() {
		return "-------======= Cardapio =======-------" +
				"\n" + burgCardapio + 
				"\n" + acompCardapio + 
				"\n" + bebCardapio + 
				"\n" + infCardapio + 
				"\n" + comboCardapio + 
				"\n" + persCardapio + 
				"\n" + sobreCardapio + 
				"\n" + promoCardapio + 
				"\n-------=======##########=======-------";
	}

	
//Gets e sets
	public Burger[] getBurgCardapio() {
		return burgCardapio;
	}

	public void setBurgCardapio(Burger[] burgCardapio) {
		this.burgCardapio = burgCardapio;
	}

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

	public Infantil[] getInfCardapio() {
		return infCardapio;
	}

	public void setInfCardapio(Infantil[] infCardapio) {
		this.infCardapio = infCardapio;
	}

	public Combo[] getComboCardapio() {
		return comboCardapio;
	}

	public void setComboCardapio(Combo[] comboCardapio) {
		this.comboCardapio = comboCardapio;
	}

	public Personalizavel[] getPersCardapio() {
		return persCardapio;
	}

	public void setPersCardapio(Personalizavel[] persCardapio) {
		this.persCardapio = persCardapio;
	}

	public Sobremesa[] getSobreCardapio() {
		return sobreCardapio;
	}

	public void setSobreCardapio(Sobremesa[] sobreCardapio) {
		this.sobreCardapio = sobreCardapio;
	}

	public Promocao[] getPromoCardapio() {
		return promoCardapio;
	}

	public void setPromoCardapio(Promocao[] promoCardapio) {
		this.promoCardapio = promoCardapio;
	}

	public int getQtdCadastro() {
		return qtdCadastro;
	}

	public void setQtdCadastro(int qtdCadastro) {
		this.qtdCadastro = qtdCadastro;
	}
	
	
}
