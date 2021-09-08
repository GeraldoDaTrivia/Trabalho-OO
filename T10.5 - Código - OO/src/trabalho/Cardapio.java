package trabalho;

public class Cardapio {

//Atributos
	private Burger burgCardapio[];
	private Acompanhamento acompCardapio[];
	private Bebida bebCardapio[];
	private Infantil infCardapio[];
	private Combo comboCardapio[];
	private Personalizavel persCardapio[];
	private Sobremesa sobreCardapio[];
	private Promocao promoCardapio[];
	private int contador;
	
	
	public Cardapio(Burger burgC[], Acompanhamento acompC[], Bebida bebC[]
			, Infantil infC[], Combo comC[], Personalizavel persC[]
			, Sobremesa sobreC[], Promocao promoC[], int contador) {
		
		burgCardapio[contador] = burgC[contador];
		acompCardapio[contador] = acompC[contador];
		bebCardapio[contador] = bebC[contador];
		infCardapio[contador] = infC[contador];
		comboCardapio[contador] = comC[contador];
		persCardapio[contador] = persC[contador];
		sobreCardapio[contador] = sobreC[contador];
		promoCardapio[contador] = promoC[contador];
	}
	
	@Override
	public String toString() {
		return "-------======= Cardapio =======-------\n" + burgCardapio[contador] + 
				"\n" + acompCardapio[contador] + 
				"\n" + bebCardapio[contador] + 
				"\n" + infCardapio[contador] + 
				"\n" + comboCardapio[contador] + 
				"\n" + persCardapio[contador] + 
				"\n" + sobreCardapio[contador] + 
				"\n" + promoCardapio[contador] + 
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

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
}
