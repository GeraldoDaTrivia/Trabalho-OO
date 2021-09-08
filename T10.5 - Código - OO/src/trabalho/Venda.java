package trabalho;

public class Venda {

//Atributos
	private Cliente clienteVenda;
	private Funcionario funcVenda;
	private Burger burgVenda[];
	private Acompanhamento acompVenda[];
	private Bebida bebVenda[];
	private Infantil infVenda[];
	private Combo comboVenda[];
	private Personalizavel persVenda[];
	private Sobremesa sobreVenda[];
	private Promocao promoVenda[];
	private double valorTotal;
	private int contador;
	
	
//Construtores
	public Venda(Cliente cliVenda, Funcionario funcioVenda, Burger burgV[]
			, Acompanhamento acompV[], Bebida bebV[], Infantil infV[], Combo comV[]
			, Personalizavel persV[], Sobremesa sobreV[], Promocao promoV[], double valorVenda, int contador) {
		
		clienteVenda = cliVenda;
		funcVenda = funcioVenda;
		burgVenda[contador] = burgV[contador];
		acompVenda[contador] = acompV[contador];
		bebVenda[contador] = bebV[contador];
		infVenda[contador] = infV[contador];
		comboVenda[contador] = comV[contador];
		persVenda[contador] = persV[contador];
		sobreVenda[contador] = sobreV[contador];
		promoVenda[contador] = promoV[contador];
		valorTotal = valorVenda;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + clienteVenda.getNome() + 
				"\nFuncionario: " + funcVenda.getNome() + 
				"\nValor Total: " + valorTotal;
	}
	
	
	
//Gets e sets
	public Cliente getClienteVenda() {
		return clienteVenda;
	}

	public void setClienteVenda(Cliente clienteVenda) {
		this.clienteVenda = clienteVenda;
	}

	public Funcionario getFuncVenda() {
		return funcVenda;
	}

	public void setFuncVenda(Funcionario funcVenda) {
		this.funcVenda = funcVenda;
	}
	
	public Burger[] getBurgVenda() {
		return burgVenda;
	}

	public void setBurgVenda(Burger[] burgVenda) {
		this.burgVenda = burgVenda;
	}

	public Acompanhamento[] getAcompVenda() {
		return acompVenda;
	}

	public void setAcompVenda(Acompanhamento[] acompVenda) {
		this.acompVenda = acompVenda;
	}

	public Bebida[] getBebVenda() {
		return bebVenda;
	}

	public void setBebVenda(Bebida[] bebVenda) {
		this.bebVenda = bebVenda;
	}

	public Infantil[] getInfVenda() {
		return infVenda;
	}

	public void setInfVenda(Infantil[] infVenda) {
		this.infVenda = infVenda;
	}

	public Combo[] getComboVenda() {
		return comboVenda;
	}

	public void setComboVenda(Combo[] comboVenda) {
		this.comboVenda = comboVenda;
	}

	public Personalizavel[] getPersVenda() {
		return persVenda;
	}

	public void setPersVenda(Personalizavel[] persVenda) {
		this.persVenda = persVenda;
	}

	public Sobremesa[] getSobreVenda() {
		return sobreVenda;
	}

	public void setSobreVenda(Sobremesa[] sobreVenda) {
		this.sobreVenda = sobreVenda;
	}

	public Promocao[] getPromoVenda() {
		return promoVenda;
	}

	public void setPromoVenda(Promocao[] promoVenda) {
		this.promoVenda = promoVenda;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
