package controleProdutos;

import controleConjuntos.ControleDado;
import modeloDados.DadoProduto;
import modeloProdutos.Burger;

public class ControleBurger {

//Atributos
	private Burger[] burgers;
	private int qtdBurger;
	private int numCadastros;
	
	
//Construtor
	public ControleBurger(ControleDado dados) {
		burgers = dados.getDadoProduto().getBurgers();
		qtdBurger = dados.getDadoProduto().getQtdBurger();
	}

	
//Criar Produto
	public void criarBurger(DadoProduto dados) {
		//String nome;
		//String tipoCarne;
		//String ingred;
		//String molho;
		//double valor;
		
		for(int i = qtdBurger; i < 50||i < (qtdBurger + numCadastros); i++){
			burgers[i] = new Burger("Burger"+i, "Carne"+i, "Ingredientes"+i, "Molho"+i, 10*(i+1));
			
			//burgers[i] = new Burger(nome, tipoCarne, ingred, molho, valor);
			
			dados.inserirEditarBurger(burgers, i);
		}
	}
	
	
//Editar Produto
	public void editarBurger(DadoProduto dados) {
		//int escolhaBurger;
		
		//println("Qual hamburger deseja editar?");
		//println(getBurgers());
		
	}
		
	
//Get-Set Quantidade
	public int getQtdBurger() {
		return qtdBurger;
	}
	
	public void setQtdBurger(int qtd) {
		this.qtdBurger = qtd;
	}
	
	public int getNumCadastros() {
		return numCadastros;
	}

	public void setNumCadastros(int numCadastros) {
		this.numCadastros = numCadastros;
	}


//Filtros e Buscas
	public String[] getNomeBurger() {
		String[] nomeBurger = new String[qtdBurger];
		
		for(int i = 0; i < qtdBurger; i++) {
			nomeBurger[i] = burgers[i].getNome();
		}
		
		return nomeBurger;
	}
	
	public String[] getCarneBurger() {
		String[] carneBurger = new String[qtdBurger];
		
		for(int i = 0; i < qtdBurger; i++) {
			carneBurger[i] = burgers[i].getTipoCarne();
		}
		
		return carneBurger;
	}
	

//Get Burgers
	public Burger[] getBurgers() {
		return burgers;
	}
	
	
//Get Dados
	public String getNome(int i) {
		return burgers[i].getNome();
	}
	
	public String getCarne(int i) {
		return burgers[i].getTipoCarne();
	}
	
	public String getIngredientes(int i) {
		return burgers[i].getIngredientes();
	}
	
	public String getMolho(int i) {
		return burgers[i].getMolho();
	}
	
	public double getValor(int i) {
		return burgers[i].getValor();
	}
	
}
