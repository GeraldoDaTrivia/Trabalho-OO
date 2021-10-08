package modeloDados;

import modeloConjuntos.SobreALoja;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

/**Classe que cria um objeto tipo {@link SobreALoja}, realiza a entrada de dados aleatórios
 * e contém os gets e sets das informações da loja.
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 * @see DadoPessoa
 * @see DadoProduto
 * @see DadoVenda
 */
public class DadoLoja {

//Atributos
	private SobreALoja loja;
	private Telefone telLoja;
	private Endereco endLoja;
	private HoraFuncionamento horFunc;
	
	
	/**Método para criação de dados aleatórios sobre a loja.
	 * (1) criar novo {@link Telefone}.
	 * (2) criar novo {@link Endereco}.
	 * (3) cirar novo {@link HoraFuncionamento}.
	 * (4) criar novo objeto do tipo {@link SobreALoja}.
	 */
	public void fillWithSomeData() {
		telLoja = new Telefone(061, 99876543);
		endLoja = new Endereco(73005000, "Estado Branco", "Cidade Azul", "Bairro Cinza", "Rua Verde", 18);
		horFunc = new HoraFuncionamento("08:00", "20:00", "Segunda a Sabado");
		loja = new SobreALoja(telLoja, horFunc, endLoja);
	}
	
	
//Gets e sets
	public SobreALoja getLoja() {
		return loja;
	}

	public void setLoja(SobreALoja loja) {
		this.loja = loja;
	}

	public Telefone getTelLoja() {
		return telLoja;
	}

	public void setTelLoja(Telefone telLoja) {
		this.telLoja = telLoja;
	}

	public Endereco getEndLoja() {
		return endLoja;
	}

	public void setEndLoja(Endereco endLoja) {
		this.endLoja = endLoja;
	}

	public HoraFuncionamento getHorFunc() {
		return horFunc;
	}

	public void setHorFunc(HoraFuncionamento horFunc) {
		this.horFunc = horFunc;
	}
	
}
