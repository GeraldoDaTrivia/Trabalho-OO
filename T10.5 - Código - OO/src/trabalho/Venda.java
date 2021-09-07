package trabalho;

public class Venda {

	private double valorTotal;
	private Cliente clienteVenda;
	private Funcionario funcVenda;
	
	public Venda() {
		
	}
	
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

	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
