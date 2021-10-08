package controleConjuntos;

import modeloConjuntos.SobreALoja;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

/**Classe para armazenar objetos do tipo {@link SobreALoja}, a quantidade desses objetos e chamar seus métodos.
 * @see ControleCardapio
 * @see ControleDado
 * @see ControleVenda
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class ControleSobreALoja {

//Atributos
	private SobreALoja sobreLoja;
	
	
//Construtor
	/**
	 * Construtor ControleSobreALoja
	 * @param dados - dados
	 */
	public ControleSobreALoja(ControleDado dados) {
		sobreLoja = dados.getDadoLoja().getLoja();
		
		sobreLoja.setTelLoja(dados.getDadoLoja().getTelLoja());
		sobreLoja.setHorFunc(dados.getDadoLoja().getHorFunc());
		sobreLoja.setEndLoja(dados.getDadoLoja().getEndLoja());
	}
	
//Get SobreLoja
	public SobreALoja getSobreLoja() {
		return sobreLoja;
	}
	
	
//Get Dados
	public Telefone getTel() {
		return sobreLoja.getTelLoja();
	}
	
	public HoraFuncionamento getHoraFunc() {
		return sobreLoja.getHorFunc();
	}
	
	public Endereco getEnd() {
		return sobreLoja.getEndLoja();
	}
	
}
