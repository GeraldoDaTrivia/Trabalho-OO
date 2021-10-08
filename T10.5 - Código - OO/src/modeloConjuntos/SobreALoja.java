package modeloConjuntos;

import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

/**Classe que define quais informações terá a loja, onde estão contidos valores e métodos para os mesmos.
 * @see Endereco
 * @see HoraFuncionamento
 * @see Telefone
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class SobreALoja {
	
//Atributos
	private HoraFuncionamento horFunc;
	private Endereco endLoja;
	private Telefone telLoja;
	
	
//Construtores
	public SobreALoja(Telefone tel, HoraFuncionamento hora, Endereco end) {
		telLoja = tel;
		horFunc = hora;
		endLoja = end;
	}
	
	
//Gets e sets
	public HoraFuncionamento getHorFunc() {
		return horFunc;
	}

	public void setHorFunc(HoraFuncionamento horFunc) {
		this.horFunc = horFunc;
	}

	public Endereco getEndLoja() {
		return endLoja;
	}

	public void setEndLoja(Endereco endLoja) {
		this.endLoja = endLoja;
	}

	public Telefone getTelLoja() {
		return telLoja;
	}

	public void setTelLoja(Telefone telLoja) {
		this.telLoja = telLoja;
	}

}
