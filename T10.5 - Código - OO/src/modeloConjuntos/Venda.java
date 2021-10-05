package modeloConjuntos;

import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;
import modeloProdutos.*;

public class Venda {

//Atributos
	private Cliente clienteVenda;
	private Funcionario funcVenda;
	private Acompanhamento[] acompVenda;
	private Bebida[] bebVenda;
	private Burger[] burgVenda;
	private Combo[] comboVenda;
	private Infantil[] infVenda;
	private Personalizavel[] persVenda;
	private Promocao[] promoVenda;
	private Sobremesa[] sobreVenda;
	private double valorTotal;
	private String prodVendidos;
	

//Construtores
	public Venda(Cliente cliVenda, Funcionario funcioVenda, String prodVenda, double valorVenda) {
			clienteVenda = cliVenda;
			funcVenda = funcioVenda;
			prodVendidos = prodVenda;
			valorTotal = valorVenda;
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
	
	public Burger[] getBurgVenda() {
		return burgVenda;
	}

	public void setBurgVenda(Burger[] burgVenda) {
		this.burgVenda = burgVenda;
	}

	public Combo[] getComboVenda() {
		return comboVenda;
	}

	public void setComboVenda(Combo[] comboVenda) {
		this.comboVenda = comboVenda;
	}
	
	public Infantil[] getInfVenda() {
		return infVenda;
	}

	public void setInfVenda(Infantil[] infVenda) {
		this.infVenda = infVenda;
	}

	public Personalizavel[] getPersVenda() {
		return persVenda;
	}

	public void setPersVenda(Personalizavel[] persVenda) {
		this.persVenda = persVenda;
	}

	public Promocao[] getPromoVenda() {
		return promoVenda;
	}

	public void setPromoVenda(Promocao[] promoVenda) {
		this.promoVenda = promoVenda;
	}
	
	public Sobremesa[] getSobreVenda() {
		return sobreVenda;
	}

	public void setSobreVenda(Sobremesa[] sobreVenda) {
		this.sobreVenda = sobreVenda;
	}

	public String getProdVendidos() {
		return prodVendidos;
	}

	public void setProdVendidos(String ProdVendidos) {
		this.prodVendidos = ProdVendidos;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
