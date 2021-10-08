package modeloPessoaELoja;

/**Classe para objetos do tipo Telefone, onde serão armazenados os valores e métodos dos mesmos.
 * @see Endereco
 * @see HoraFuncionamento
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 */
public class Telefone {

//Atributos
	private int ddd;
	private int numero;
	
	
//Construtores
	public Telefone(int numDdd, int num) {
		ddd = numDdd;
		numero = num;
	}
	
	/**Tranforma o valor do DDD em uma String
	 * 
	 * @return String - DDD
	 */
	public String toStringDdd() {
		Integer ddd = this.ddd;
		return ddd.toString();
	}
	
	/**Transforma o número de telefone em uma String
	 * 
	 * @return String - Número de telefone
	 */
	public String toStringNum() {
		Integer num = numero;
		return num.toString();
	}
	
//Gets e sets
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
