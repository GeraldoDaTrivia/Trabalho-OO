package modeloPessoaELoja;

/**Classe para objetos do tipo HoraFuncionamento, onde serão armazenados os valores e métodos dos mesmos.
 * @see Endereco
 * @see Telefone
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class HoraFuncionamento {

//Atributos
	private String horAbrir;
	private String horFechar;
	private String diasAbertos;
	
	
//Construtores
	public HoraFuncionamento(String abrir, String fechar, String dias) {
		horAbrir = abrir;
		horFechar = fechar;
		diasAbertos = dias;
	}
	
	
//Gets e sets
	public String getHorAbrir() {
		return horAbrir;
	}

	public void setHorAbrir(String horAbrir) {
		this.horAbrir = horAbrir;
	}

	public String getHorFechar() {
		return horFechar;
	}

	public void setHorFechar(String horFechar) {
		this.horFechar = horFechar;
	}

	public String getDiasAbertos() {
		return diasAbertos;
	}

	public void setDiasAbertos(String diasAbertos) {
		this.diasAbertos = diasAbertos;
	}

}
