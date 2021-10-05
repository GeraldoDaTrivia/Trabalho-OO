package controleConjuntos;

import modeloDados.*;

public class ControleDado {
	
//Atributos
	private DadoPessoa pessoa = new DadoPessoa();
	private DadoProduto produto = new DadoProduto();
	private DadoLoja loja = new DadoLoja();
	private DadoVenda venda = new DadoVenda();
	
	
//Construtor
	public ControleDado() {
		pessoa.fillWithSomeData();
		produto.fillWithSomeData();
		produto.fillCardapioWithData();
		loja.fillWithSomeData();
		venda.fillWithSomeData();
	}


//Gets e sets
	public DadoPessoa getDadoPessoa() {
		return pessoa;
	}

	public DadoProduto getDadoProduto() {
		return produto;
	}

	public DadoLoja getDadoLoja() {
		return loja;
	}
	
	public DadoVenda getDadoVenda() {
		return venda;
	}

}
