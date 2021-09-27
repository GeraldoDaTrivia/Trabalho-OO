package modeloConjuntos;

import modeloDados.Cliente;
import modeloDados.Funcionario;
import modeloProdutos.*;

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
	private String prodVendidos;
	

//Construtores
	public Venda(Cliente cliVenda, Funcionario funcioVenda, String prodVenda, double valorVenda) {
			clienteVenda = cliVenda;
			funcVenda = funcioVenda;
			prodVendidos = prodVenda;
			valorTotal = valorVenda;
	}
	
	@Override
	public String toString() {
		return "# Cliente\n" + clienteVenda.getNumId() + " - " + clienteVenda.getNome() + 
				"\n# Funcionario\n" + funcVenda.getNumId() + " - " + funcVenda.getNome() + 
				"\n# Produtos Vendidos\n" + prodVendidos +
				"\n# Valor Total\nR$" + valorTotal;
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

	public String getProdVendidos() {
		return prodVendidos;
	}

	public void setProdVendidos(String ProdVendidos) {
		this.prodVendidos = ProdVendidos;
	}

}
