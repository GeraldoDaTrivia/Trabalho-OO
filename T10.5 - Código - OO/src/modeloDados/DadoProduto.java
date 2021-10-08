package modeloDados;

import modeloAbstratas.Produto;
import modeloConjuntos.Cardapio;
import modeloProdutos.*;

/**Classe que cria objetos do tipo {@link Produto}, realiza a entrada de dados aleatórios, 
 * contém os gets e sets das informações dos objetos criados,
 * cria ou edita novos objetos - {@link #inserirEditarBurger(Burger, int) Inserir/Editar Burger}
 * e exclue objetos - {@link #excluirBurger(Burger, int) Excluir Burger}.
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Set 2021
 * @see DadoLoja
 * @see DadoProduto
 * @see DadoVenda
 */
public class DadoProduto {

//Atributos
	private Acompanhamento[] acompanhamentos = new Acompanhamento[50];
	private int qtdAcomps = 0;
	private Bebida[] bebidas = new Bebida[50];
	private int qtdBebida = 0;
	private Burger[] burgers = new Burger[50];
	private int qtdBurger = 0;
	private Combo[] combos = new Combo[50];
	private int qtdCombos = 0;
	private Infantil[] infantis = new Infantil[50];
	private int qtdInfantis = 0;
	private Personalizavel[] personalizaveis = new Personalizavel[50];
	private int qtdPers = 0;
	private Promocao[] promocoes = new Promocao[50];
	private int qtdPromocoes = 0;
	private Sobremesa[] sobremesas = new Sobremesa[50];
	private int qtdSobremesa = 0;
	
	private Cardapio cardapio;
	
	private Acompanhamento acompExcluido;
	private Acompanhamento[] novoAcomp = new Acompanhamento[50];
	private Bebida bebExcluido;
	private Bebida[] novoBebida = new Bebida[50];
	private Burger burgerExcluido;
	private Burger[] novoBurger = new Burger[50];
	private Combo comboExcluido;
	private Combo[] novoCombo = new Combo[50];
	private Infantil infExcluido;
	private Infantil[] novoInf = new Infantil[50];
	private Personalizavel persExcluido;
	private Personalizavel[] novoPers = new Personalizavel[50];
	private Promocao promoExcluido;
	private Promocao[] novoPromo = new Promocao[50];
	private Sobremesa sobreExcluido;
	private Sobremesa[] novoSobre = new Sobremesa[50];
	
	
	/**Método para criação de dados aleatórios sobre classes do tipo {@link modeloAbstratas.Pessoa}.
	 * (1) criar novo objeto do tipo {@link Acompanhamento}.
	 * (2) criar novo objeto do tipo {@link Bebida}.
	 * (3) criar novo objeto do tipo {@link Burger}.
	 * (4) criar novo objeto do tipo {@link Combo}.
	 * (5) criar novo objeto do tipo {@link Infantil}.
	 * (6) criar novo objeto do tipo {@link Personalizavel}.
	 * (7) criar novo objeto do tipo {@link Promocao}.
	 * (8) criar novo objeto do tipo {@link Sobremesa}.
	 */
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			acompanhamentos[i] = new Acompanhamento("Acompanhamento"+i, "Tipo"+i, "Ingredientes"+i, 5*(i+1));
			bebidas[i] = new Bebida("Tipo"+i, "Bebida"+i, "Sabor"+i, "Tamanho"+(i*100), 2*(i+1));
			burgers[i] = new Burger("Burger"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, 10*(i+1));
			combos[i] = new Combo("Combo"+i, burgers[i], acompanhamentos[i], bebidas[i], 14*(i+1));
			infantis[i] = new Infantil("Infantil"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, acompanhamentos[i], bebidas[i], 11*(i+1));
			personalizaveis[i] = new Personalizavel("Personalizavel"+i, burgers[i], (i+1), "Ingredientes Adicionais"+i, "Molho"+i, 12*(i+1));
			sobremesas[i] = new Sobremesa("Tipo"+i, "Sobremesa"+i, "Ingredientes"+i, 3*(i+1));
			promocoes[i] = new Promocao("Promocao"+i, "Dias"+i, burgers[i], sobremesas[i], 9*(i+1));
			
		}
		
	//Set Quantidade
		qtdAcomps = 5;
		qtdBebida = 5;
		qtdBurger = 5;
		qtdCombos = 5;
		qtdInfantis = 5;
		qtdPers = 5;
		qtdPromocoes = 5;
		qtdSobremesa = 5;
		
	}
	
	public void fillCardapioWithData() {
		cardapio = new Cardapio();
	}


	/**Cria ou edita um objeto do tipo {@link Acompanhamento}
	 * 
	 * @param acompanhamentos - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarAcomp(Acompanhamento acompanhamentos, int pos) {
		this.acompanhamentos[pos] = acompanhamentos;
		if(pos == qtdAcomps) qtdAcomps++;
		this.cardapio.setAcompCardapio(this.acompanhamentos);
	}
	
	/**Exclui um objeto do tipo {@link Acompanhamento}
	 * 
	 * @param acompanhamentos - Objeto a ser excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirAcomp(Acompanhamento acompanhamentos, int pos) {
		acompExcluido = acompanhamentos;
		if(this.acompanhamentos[pos]==acompExcluido) {
			for(int i = 0; i < pos; i++) {
				novoAcomp[i] = this.acompanhamentos[i];
			}
			for(int j = pos; j < (qtdAcomps-1); j++) {
				novoAcomp[j] = this.acompanhamentos[j+1];
			}
		}
		qtdAcomps--;
		this.acompanhamentos = novoAcomp;
	}
	
	/**Cria ou edita um objeto do tipo {@link Bebida}
	 * 
	 * @param bebida - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarBebida(Bebida bebida, int pos) {
		this.bebidas[pos] = bebida;
		if(pos == qtdBebida) qtdBebida++;
		this.cardapio.setBebCardapio(this.bebidas);
	}
	
	/**Exclue um objeto do tipo {@link Bebida}
	 * 
	 * @param bebida - Objeto a ser excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirBebida(Bebida bebida, int pos) {
		bebExcluido = bebida;
		if(this.bebidas[pos]==bebExcluido) {
			for(int i = 0; i < pos; i++) {
				novoBebida[i] = this.bebidas[i];
			}
			for(int j = pos; j < (qtdBebida-1); j++) {
				novoBebida[j] = this.bebidas[j+1];
			}
		}
		qtdBebida--;
		this.bebidas = novoBebida;
	}
	
	/**Cria ou edita um objeto do tipo {@link Burger}
	 * 
	 * @param burger - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarBurger(Burger burger, int pos) {
		this.burgers[pos] = burger;
		if(pos == qtdBurger) qtdBurger++;
		this.cardapio.setBurgCardapio(this.burgers);
	}
	
	/**Exclue um objeto do tipo {@link Burger}
	 * 
	 * @param burger - Objeto a ser excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirBurger(Burger burger, int pos) {
		burgerExcluido = burger;
		if(this.burgers[pos]==burgerExcluido) {
			for(int i = 0; i < pos; i++) {
				novoBurger[i] = this.burgers[i];
			}
			for(int j = pos; j < (qtdBurger-1); j++) {
				novoBurger[j] = this.burgers[j+1];
			}
		}
		qtdBurger--;
		this.burgers = novoBurger;
	}
	
	/**Cria ou edita um objeto do tipo {@link Combo}
	 * 
	 * @param combo - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarCombo(Combo combo, int pos) {
		this.combos[pos] = combo;
		if(pos == qtdCombos) qtdCombos++;
		this.cardapio.setComboCardapio(this.combos);
	}
	
	/**Exclue um objeto do tipo {@link Combo}
	 * 
	 * @param combo - Objeto a ser excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirCombo(Combo combo, int pos) {
		comboExcluido = combo;
		if(this.combos[pos]==comboExcluido) {
			for(int i = 0; i < pos; i++) {
				novoCombo[i] = this.combos[i];
			}
			for(int j = pos; j < (qtdCombos-1); j++) {
				novoCombo[j] = this.combos[j+1];
			}
		}
		qtdCombos--;
		this.combos = novoCombo;
	}
	
	/**Cria ou edita um objeto do tipo {@link Infantil}
	 * 
	 * @param infantil - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarInfantil(Infantil infantil, int pos) {
		this.infantis[pos] = infantil;
		if(pos == qtdInfantis) qtdInfantis++;
		this.cardapio.setInfCardapio(this.infantis);
	}
	
	/**Exclue um objeto do tipo {@link Infantil}
	 * 
	 * @param infantil - Objeto excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirInfantil(Infantil infantil, int pos) {
		infExcluido = infantil;
		if(this.infantis[pos]==infExcluido) {
			for(int i = 0; i < pos; i++) {
				novoInf[i] = this.infantis[i];
			}
			for(int j = pos; j < (qtdInfantis-1); j++) {
				novoInf[j] = this.infantis[j+1];
			}
		}
		qtdInfantis--;
		this.infantis = novoInf;
	}
	
	/**Cria ou edita um objeto do tipo {@link Personalizavel}
	 * 
	 * @param personalizavel - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarPers(Personalizavel personalizavel, int pos) {
		this.personalizaveis[pos] = personalizavel;
		if(pos == qtdPers) qtdPers++;
		this.cardapio.setPersCardapio(this.personalizaveis);
	}
	
	/**Exclue um objeto do tipo {@link Personalizavel}
	 * 
	 * @param person - Objeto excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirPers(Personalizavel person, int pos) {
		persExcluido = person;
		if(this.personalizaveis[pos]==persExcluido) {
			for(int i = 0; i < pos; i++) {
				novoPers[i] = this.personalizaveis[i];
			}
			for(int j = pos; j < (qtdPers-1); j++) {
				novoPers[j] = this.personalizaveis[j+1];
			}
		}
		qtdPers--;
		this.personalizaveis = novoPers;
	}
	
	/**Cria ou edita um objeto do tipo {@link Promocao}
	 * 
	 * @param promo - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarPromo(Promocao promo, int pos) {
		this.promocoes[pos] = promo;
		if(pos == qtdPromocoes) qtdPromocoes++;
		this.cardapio.setPromoCardapio(this.promocoes);
	}
	
	/**Exclue um objeto do tipo {@link Promocao}
	 * 
	 * @param promo - Objeto excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirPromo(Promocao promo, int pos) {
		promoExcluido = promo;
		if(this.promocoes[pos]==promoExcluido) {
			for(int i = 0; i < pos; i++) {
				novoPromo[i] = this.promocoes[i];
			}
			for(int j = pos; j < (qtdPromocoes-1); j++) {
				novoPromo[j] = this.promocoes[j+1];
			}
		}
		qtdPromocoes--;
		this.promocoes = novoPromo;
	}
	
	/**Cria ou edita um objeto do tipo {@link Sobremesa}
	 * 
	 * @param sobre - Novo objeto
	 * @param pos - Posição do objeto no array
	 */
	public void inserirEditarSobremesa(Sobremesa sobre, int pos) {
		this.sobremesas[pos] = sobre;
		if(pos == qtdSobremesa) qtdSobremesa++;
		this.cardapio.setSobreCardapio(this.sobremesas);
	}
	
	/**Exclue um objeto do tipo {@link Sobremesa}
	 * 
	 * @param sobre - Objeto excluído
	 * @param pos - Posição do objeto no array
	 */
	public void excluirSobre(Sobremesa sobre, int pos) {
		sobreExcluido = sobre;
		if(this.sobremesas[pos]==sobreExcluido) {
			for(int i = 0; i < pos; i++) {
				novoSobre[i] = this.sobremesas[i];
			}
			for(int j = pos; j < (qtdSobremesa-1); j++) {
				novoSobre[j] = this.sobremesas[j+1];
			}
		}
		qtdSobremesa--;
		this.sobremesas = novoSobre;
	}
	
	
//Cardapio
	public Cardapio getCardapio() {
		return cardapio;
	}
	
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	
//Acompanhamentos
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}
	
	public Acompanhamento getOneAcompanhamento(int i) {
		return acompanhamentos[i];
	}
	
	public void setAcompanhamentos(Acompanhamento[] acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	
	public int getQtdAcomps() {
		return qtdAcomps;
	}
	
	public void setQtdAcomps(int qtdAcomps) {
		this.qtdAcomps = qtdAcomps;
	}
	

//Bebidas
	public Bebida[] getBebidas() {
		return bebidas;
	}
	
	public Bebida getOneBebida(int i) {
		return bebidas[i];
	}
	
	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	
	public int getQtdBebida() {
		return qtdBebida;
	}
	
	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
	}


//Burgers
	public Burger[] getBurgers() {
		return burgers;
	}
	
	public Burger getOneBurger(int i) {
		return burgers[i];
	}
	
	public void setBurgers(Burger[] burgers) {
		this.burgers = burgers;
	}
	
	public int getQtdBurger() {
		return qtdBurger;
	}

	public void setQtdBurger(int qtdBurger) {
		this.qtdBurger = qtdBurger;
	}

	
//Combos
	public Combo[] getCombos() {
		return combos;
	}
	
	public Combo getOneCombo(int i) {
		return combos[i];
	}
	
	public void setCombos(Combo[] combos) {
		this.combos = combos;
	}
	
	public int getQtdCombos() {
		return qtdCombos;
	}
	
	public void setQtdCombos(int qtdCombos) {
		this.qtdCombos = qtdCombos;
	}


//Infantis
	public Infantil[] getInfantil() {
		return infantis;
	}
	
	public Infantil getOneInfantil(int i) {
		return infantis[i];
	}
	
	public void setInfantis(Infantil[] infantis) {
		this.infantis = infantis;
	}
	
	public int getQtdInfantis() {
		return qtdInfantis;
	}
	
	public void setQtdInfantis(int qtdInfantis) {
		this.qtdInfantis = qtdInfantis;
	}
	
	
//Personalizaveis
	public Personalizavel[] getPersonalizaveis() {
		return personalizaveis;
	}
	
	public Personalizavel getOnePers(int i) {
		return personalizaveis[i];
	}
	
	public void setPersonalizaveis(Personalizavel[] personalizavel) {
		this.personalizaveis = personalizavel;
	}
	
	public int getQtdPers() {
		return qtdPers;
	}
	
	public void setQtdPers(int qtdPers) {
		this.qtdPers = qtdPers;
	}
	
	
//Promocoes
	public Promocao[] getPromocoes() {
		return promocoes;
	}
	
	public Promocao getOnePromo(int i) {
		return promocoes[i];
	}
	
	public void setPromocoes(Promocao[] promocoes) {
		this.promocoes = promocoes;
	}
	
	public int getQtdPromo() {
		return qtdPromocoes;
	}
	
	public void setQtdPromo(int qtdPromo) {
		this.qtdPromocoes = qtdPromo;
	}
	
	
//Sobremesas
	public Sobremesa[] getSobremesas() {
		return sobremesas;
	}
	
	public Sobremesa getOneSobre(int i) {
		return sobremesas[i];
	}
	
	public void setSobremesas(Sobremesa[] sobremesas) {
		this.sobremesas = sobremesas;
	}
	
	public int getQtdSobremesa() {
		return qtdSobremesa;
	}
	
	public void setQtdSobremesa(int qtdSobremesa) {
		this.qtdSobremesa = qtdSobremesa;
	}

}
