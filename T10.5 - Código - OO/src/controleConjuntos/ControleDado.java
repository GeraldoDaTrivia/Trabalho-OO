package controleConjuntos;

import modeloDados.*;

/**Classe para reunir os dados de tipo {@link DadoLoja}, {@link DadoPessoa}, {@link DadoProduto} e {@link DadoVenda}.
 * @see ControleCardapio
 * @see ControleSobreALoja
 * @see ControleVenda
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleDado {
	
//Atributos
	private DadoPessoa pessoa = new DadoPessoa();
	private DadoProduto produto = new DadoProduto();
	private DadoLoja loja = new DadoLoja();
	private DadoVenda venda = new DadoVenda();
	
	
//Construtor
	/**
	 * Construtor ControleDado
	 */
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
