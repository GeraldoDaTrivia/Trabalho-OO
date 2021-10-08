package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modeloDados.DadoLoja;

/**Classe que realiza os teste unitários dos métodos criados na classe {@link Validador}.
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
class TesteValidador {
	Validador v = new Validador();
	
	/**Teste para validar o método {@link Validador#validarExcluirProduto(String) ValidarExcluirProduto}.
	 *
	 */
	@Test
	void testValidarExcluirProduto() {
		
		assertTrue(v.validarExcluirProduto("Acompanhamento"));
		assertTrue(v.validarExcluirProduto("Bebida"));
		assertTrue(v.validarExcluirProduto("Burger"));
		assertTrue(v.validarExcluirProduto("Combo"));
		assertTrue(v.validarExcluirProduto("Infantil"));
		assertTrue(v.validarExcluirProduto("Personalizavel"));
		assertTrue(v.validarExcluirProduto("Promocao"));
		assertTrue(v.validarExcluirProduto("Sobremesa"));
		
	}
	
	/**Teste para validar o método {@link Validador#validarAddPessoa(String) ValidarAdicionarPessoa}.
	 * 
	 */
	@Test
	void testValidarAddPessoa() {
		
		assertTrue(v.validarAddPessoa("Cliente"));
		assertTrue(v.validarAddPessoa("Funcionario"));
		
	}
	
	/**Teste para validar o método {@link Validador#validarDadosLoja(DadoLoja) ValidarDadosLoja}.
	 * 
	 */
	@Test
	void testValidarDadosLoja() {
		DadoLoja dados = new DadoLoja();
		dados.fillWithSomeData();
		
		assertTrue(v.validarDadosLoja(dados));
	}

}
