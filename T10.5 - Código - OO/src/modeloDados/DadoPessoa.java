package modeloDados;

import modeloPessoaELoja.*;

/**Classe que cria um objeto tipo {@link Cliente} e outro do tipo {@link Funcionario}, 
 * realiza a entrada de dados aleatórios, contém os gets e sets das informações dos objetos criados
 * cria ou edita novos objetos - {@link #inserirEditarCliente(Cliente, int) Inserir/Editar Cliente}
 * e exclue objetos - {@link #excluirCliente(Cliente, int) Excluir Cliente}.
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 * @see DadoLoja
 * @see DadoProduto
 * @see DadoVenda
 */
public class DadoPessoa {

//Atributos
	private Cliente[] clientes = new Cliente[50];
	private int qtdClientes = 0;
	private Funcionario[] funcionarios = new Funcionario[50];
	private int qtdFuncionarios = 0;
	private Telefone[] telCliente = new Telefone[50];
	private Telefone[] telFuncionario = new Telefone[50];
	private Endereco[] endFuncionario = new Endereco[50];
	
	private Cliente cliExcluido;
	private Cliente[] novoClientes = new Cliente[50];
	private Funcionario funcExcluido;
	private Funcionario[] novoFuncionarios = new Funcionario[50];
	
	
	/**Método para criação de dados aleatórios sobre classes do tipo {@link modeloAbstratas.Pessoa}.
	 * (1) criar novo {@link Telefone} para o cliente.
	 * (2) criar novo objeto do tipo {@link Cliente}.
	 * (3) criar novo {@link Telefone} para o funcionário.
	 * (4) cirar novo {@link Endereco} para o funcionário.
	 * (5) criar novo objeto do tipo {@link Funcionario}.
	 */
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			telCliente[i] = new Telefone(60+i, 98007700+i);
			clientes[i] = new Cliente("Cliente"+i, 1001+i, "045000111-"+i, telCliente[i]);
			telFuncionario[i] = new Telefone(10+i, 99009900+i);
			endFuncionario[i] = new Endereco(510005*(i+1), "Estado"+i, "Cidade"+i, "Bairro"+i, "Rua"+i, 12*(i+1));
			funcionarios[i] = new Funcionario("Funcionario"+i, 5001+i, "086000333-"+i, 
					100505+i, telFuncionario[i], endFuncionario[i]);
			
		}
		
		qtdClientes = 5;
		qtdFuncionarios = 5;
	}
	
	
	/**Cria ou edita um cliente
	 * 
	 * @param cliente - Novo objeto do tipo {@link Cliente}
	 * @param pos - Posição do novo objeto no array
	 */
	public void inserirEditarCliente(Cliente cliente, int pos) {
		this.clientes[pos] = cliente;
		if(pos == qtdClientes) qtdClientes++;
	}
	
	/**Exclui um cliente específico
	 * 
	 * @param cliente - Cliente que irá ser excluído
	 * @param pos - Posição do cliente no array
	 */
	public void excluirCliente(Cliente cliente, int pos) {
		cliExcluido = cliente;
		if(clientes[pos]==cliExcluido) {
			for(int i = 0; i < pos; i++) {
				novoClientes[i] = clientes[i];
			}
			for(int j = pos; j < (qtdClientes-1); j++) {
				novoClientes[j] = clientes[j+1];
			}
		}
		qtdClientes--;
		clientes = novoClientes;
	}
	
	/**Cria ou edita um funcionário
	 * 
	 * @param funcionario - Novo objeto do tipo {@link Funcionario}
	 * @param pos - Posição do novo objeto no array
	 */
	public void inserirEditarFuncionario(Funcionario funcionario, int pos) {
		this.funcionarios[pos] = funcionario;
		if(pos == qtdFuncionarios) qtdFuncionarios++;
	}
	
	/**Exclui um funcionário específico
	 * 
	 * @param funcionario - Funcionário que irá ser excluído
	 * @param pos - Posição do funcionário no array
	 */
	public void excluirFuncionario(Funcionario funcionario, int pos) {
		funcExcluido = funcionario;
		if(funcionarios[pos]==funcExcluido) {
			for(int i = 0; i < pos; i++) {
				novoFuncionarios[i] = funcionarios[i];
			}
			for(int j = pos; j < (qtdFuncionarios-1); j++) {
				novoFuncionarios[j] = funcionarios[j+1];
			}
		}
		qtdFuncionarios--;
		funcionarios = novoFuncionarios;
	}
	

	
//Clientes
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public Cliente getOneCliente(int pos) {
		return clientes[pos];
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}


//Funcionarios
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public Funcionario getOneFunc(int pos) {
		return funcionarios[pos];
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
}
