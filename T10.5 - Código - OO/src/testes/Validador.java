package testes;

import controleConjuntos.ControleDado;
import modeloAbstratas.Pessoa;
import modeloAbstratas.Produto;
import modeloDados.DadoLoja;
import modeloDados.DadoPessoa;
import modeloDados.DadoProduto;
import modeloPessoaELoja.*;

/**Classe que cria métodos para a realização de testes unitários em {@link TesteValidador}.
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Validador {

		/**Método para a validação da exclusão de {@link Produto}. 
		 * 
		 * (1) Compara o parâmetro recebido com os nome das classes possíveis;
		 * (2) Realiza o método de excluir produto presente em {@link DadoProduto};
		 * (3) Verifica se a quantidade de produtos continuou igual ou diminuiu;
		 * (4) Verifica se o produto na próxima posição do array ocupou o espaço do produto excluído;
		 * 
		 * @param prodExcluido - String com o nome da classe do produto que irá ser excluído
		 * @return Verdadeiro ou Falso - Se o produto foi excluído com sucesso ou se houve problemas.
		 */
		public boolean validarExcluirProduto(String prodExcluido) {
			boolean confirma = true;
			ControleDado dados = new ControleDado();
			
		//5 e a quantidade de produtos aleatorios criados
			int qtdAcomp = 5;
			int qtdBebida = 5;
			int qtdBurger = 5;
			int qtdCombo = 5;
			int qtdInfantil = 5;
			int qtdPers = 5;
			int qtdPromo = 5;
			int qtdSobre = 5;
			
			if(prodExcluido.equals("Acompanhamento")) {
			//Confirmar exclusao correta de acompanhamento
				dados.getDadoProduto().excluirAcomp(dados.getDadoProduto().getOneAcompanhamento(2), 2);
				if(dados.getDadoProduto().getQtdAcomps()==qtdAcomp) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneAcompanhamento(2).getNome().equals("Acompanhamento3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Bebida")) {
			//Confirmar exclusao correta de bebida
				dados.getDadoProduto().excluirBebida(dados.getDadoProduto().getOneBebida(2), 2);
				if(dados.getDadoProduto().getQtdBebida()==qtdBebida) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneBebida(2).getNome().equals("Bebida3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Burger")) {
			//Confirmar exclusao correta de burger
				dados.getDadoProduto().excluirBurger(dados.getDadoProduto().getOneBurger(2), 2);
				if(dados.getDadoProduto().getQtdBurger()==qtdBurger) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneBurger(2).getNome().equals("Burger3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Combo")) {
			//Confirmar exclusao correta de combo
				dados.getDadoProduto().excluirCombo(dados.getDadoProduto().getOneCombo(2), 2);
				if(dados.getDadoProduto().getQtdCombos()==qtdCombo) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneCombo(2).getNome().equals("Combo3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Infantil")) {
			//Confirmar exclusao correta de infantil
				dados.getDadoProduto().excluirInfantil(dados.getDadoProduto().getOneInfantil(2), 2);
				if(dados.getDadoProduto().getQtdInfantis()==qtdInfantil) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneInfantil(2).getNome().equals("Infantil3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Personalizavel")) {
			//Confirmar exclusao correta de personalizavel
				dados.getDadoProduto().excluirPers(dados.getDadoProduto().getOnePers(2), 2);
				if(dados.getDadoProduto().getQtdPers()==qtdPers) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOnePers(2).getNome().equals("Personalizavel3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Promocao")) {
			//Confirmar exclusao correta de promocao
				dados.getDadoProduto().excluirPromo(dados.getDadoProduto().getOnePromo(2), 2);
				if(dados.getDadoProduto().getQtdPromo()==qtdPromo) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOnePromo(2).getNome().equals("Promocao3")) {
					
					confirma = false;
				}
			}
			if(prodExcluido.equals("Sobremesa")) {
			//Confirmar exclusao correta de sobremesa
				dados.getDadoProduto().excluirSobre(dados.getDadoProduto().getOneSobre(2), 2);
				if(dados.getDadoProduto().getQtdSobremesa()==qtdSobre) {
					
					confirma = false;
				}
				if(!dados.getDadoProduto().getOneSobre(2).getNome().equals("Sobremesa3")) {
					
					confirma = false;
				}
			}
			
			return confirma;
		}
		
		/**Método para a validação da criação de {@link Pessoa}. 
		 * 
		 * (1) Compara o parâmetro recebido com os nomes das classes possíveis;
		 * (2) Realiza o método de adicionar pessoa presente em {@link DadoPessoa};
		 * (3) Verifica se o nome da pessoa adicionada está correto;
		 * (4) Verifica se a quantidade de pessoas aumentou;
		 * (5) Verifica se o CPF está no formato correto de onze números.
		 * 
		 * @param tipoPessoa - String que representa se a pessoa adicional é um {@link Cliente} ou um {@link Funcionario}.
		 * @return Verdadeiro ou falso - Se a pessoa foi adicionada com sucesso ou houve um erro.
		 */
		public boolean validarAddPessoa(String tipoPessoa) {
			boolean confirma = true;
			ControleDado dados = new ControleDado();
			
		//5 e a quantidade de pessoas aleatorios criados
			int qtdCliente = 5;
			int qtdFunc = 5;
			
		//Confirmar adicao correta de um cliente
			if(tipoPessoa.equals("Cliente")) {
				Telefone clienteTel = new Telefone(061, 998765432);
				Cliente novoCliente = new Cliente("Joao", 4567, "35632626523", clienteTel);
				
				dados.getDadoPessoa().inserirEditarCliente(novoCliente, dados.getDadoPessoa().getQtdClientes());
				if(!dados.getDadoPessoa().getOneCliente(dados.getDadoPessoa().getQtdClientes() - 1).getNome().equals("Joao")) {
					
					confirma = false;
				}
				if(dados.getDadoPessoa().getQtdClientes()==qtdCliente) {
					
					confirma = false;
				}
				if(dados.getDadoPessoa().getOneCliente(dados.getDadoPessoa().getQtdClientes() - 1).getCpf().length() != 11) {
					
					confirma = false;
				}
			}
			
		//Confirmar adicao correta de um funcionario
			if(tipoPessoa.equals("Funcionario")) {
				Telefone funcTel = new Telefone(011, 991234567);
				Endereco funcEnd = new Endereco(75432645, "Estado Azul", "Cidade Branca", "Bairro Preto", "Rua Cinza", 23);
				Funcionario novoFunc = new Funcionario("Matheus", 4567, "35632626523", 4353745, funcTel, funcEnd);
				
				dados.getDadoPessoa().inserirEditarFuncionario(novoFunc, dados.getDadoPessoa().getQtdFuncionarios());
				if(!dados.getDadoPessoa().getOneFunc(dados.getDadoPessoa().getQtdFuncionarios() - 1).getNome().equals("Matheus")) {
					
					confirma = false;
				}
				if(dados.getDadoPessoa().getQtdFuncionarios()==qtdFunc) {
					
					confirma = false;
				}
				if(dados.getDadoPessoa().getOneFunc(dados.getDadoPessoa().getQtdFuncionarios() - 1).getCpf().length() != 11) {
					
					confirma = false;
				}
				if(dados.getDadoPessoa().getOneFunc(dados.getDadoPessoa().getQtdFuncionarios() - 1).toStringRg().length() != 7) {
					
					confirma = false;
				}
			}
			
			return confirma;
		}
		
		/**Método para a validação dos dados obtidos em {@link DadoLoja}. 
		 * 
		 * (1) Verificar se o formato do {@link HoraFuncionamento} está correto.
		 * (2) Verificar se o {@link Telefone} foi preenchido.
		 * (3) Verificar se o DDD tem no máximo três números.
		 * (4) Verificar se o número de telefone tem oito ou nove números.
		 * (5) Verificar se o CEP tem 8 números.
		 * (6) Verificar se o estado não contém nenhum número em sua composição.
		 * 
		 * @param dados - Dados da loja obtido pelo método {@link DadoLoja#fillWithSomeData() Obter Dados Aleatórios}.
		 * @return Verdadeiro ou falso - Se os dados estão corretos ou houve um erro.
		 */
		public boolean validarDadosLoja(DadoLoja dados) {
			boolean confirma = true;
			
			dados.getHorFunc().getDiasAbertos().toLowerCase();
			
		//Confirma se o horario esta no formato correto
			if(!dados.getHorFunc().getHorAbrir().matches("(\\d\\d\\:\\d\\d)")) {
				
				confirma = false;
			}
			if(!dados.getHorFunc().getHorFechar().matches("(\\d\\d\\:\\d\\d)")) {
				
				confirma = false;
			}
			
		//Confirma se o telefone nao esta vazio
			if(dados.getTelLoja().toStringDdd().isBlank() || dados.getTelLoja().toStringNum().isBlank()) {
				
				confirma = false;
			}
			
		//Confirma se o DDD e composto de ate tres numeros
			if(dados.getTelLoja().toStringDdd().length() > 3) {
					
				confirma = false;
			}
			
		//Confirma se o numero de telefone e composto de oito ou nove numeros
			if(dados.getTelLoja().toStringNum().length() != 8 && dados.getTelLoja().toStringNum().length() != 9) {
					
				confirma = false;
			}
			
		//Confirma se o CEP esta correto
			if(dados.getEndLoja().toStringCep().length() != 8) {
				
				confirma = false;
			}
			
		//Confirma se o Estado e composto somente por letras
			for(int i = 0; i < dados.getEndLoja().getEstado().length(); i++) {
				
				if(Character.isDigit(dados.getEndLoja().getEstado().charAt(i))) {
					
					confirma = false;
				}
			}
			
			return confirma;
		}
}
