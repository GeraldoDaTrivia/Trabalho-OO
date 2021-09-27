package principal;

import java.util.*;

import modeloConjuntos.*;
import modeloDados.*;
import modeloProdutos.*;

public class Teste {
	
//Atributos
	static Burger burger1;
	static Burger burger2;
	static Acompanhamento acomp1;
	static Bebida bebida1;
	static Combo combo1;
	static Cliente cliente1;
	static Telefone telC1;
	static Funcionario func1;
	static Telefone telF1;
	static Endereco endF1;
	static Venda venda1;
	static SobreALoja loja1;
	static Telefone telLoja1;
	static HoraFuncionamento horLoja1;
	static Endereco endLoja1;
	static Cardapio cardapioLoja;
	public static ArrayList<Burger> burgCardapio = new ArrayList<>();
	public static ArrayList<Acompanhamento> acompCardapio = new ArrayList<>();
	public static ArrayList<Bebida> bebCardapio = new ArrayList<>();
	public static ArrayList<Infantil> infCardapio = new ArrayList<>();
	public static ArrayList<Combo> comboCardapio = new ArrayList<>();
	public static ArrayList<Personalizavel> persCardapio = new ArrayList<>();
	public static ArrayList<Sobremesa> sobreCardapio = new ArrayList<>();
	public static ArrayList<Promocao> promoCardapio = new ArrayList<>();
	
	public static void main(String[] args) {
		
//Entrada de Dados
		
	//Cliente
		telC1 = new Telefone(061, 998007700);
		cliente1 = new Cliente("Joao", 100001, "787878787", telC1);
	//Funcionario
		telF1 = new Telefone(061, 985224422);
		endF1 = new Endereco(70000000, "Goias", "Cidade Azul", "Bairro Vermelho", "Rua Amarela", 14);
		func1 = new Funcionario("Matheus", 90001, "34343434343", 3000000, telF1, endF1);
	//Burgers
		burger1 = new Burger("Duplo Bacon", "Carne Bovina.", "Pao de hamburger, duas carnes bovinas, queijo, bacon.", 
				"Maionese Tradicional", 14.99);
		burger2 = new Burger("Triplo Ovo", "Carne Bovina.", "Pao de hamburger, tres carnes bovinas, queijo, ovo frito, alface.", 
				"Maionese Temperada.", 16.99);
	//Acompanhamentos
		acomp1 = new Acompanhamento("Batata com Bacon", "Batata Frita.", "Batata, queijo, bacon.", 5.99);
	//Bebidas
		bebida1 = new Bebida("Refrigerante", "Coca-cola", "Cola", "600 ml", 3.99);
	//Combos
		combo1 = new Combo("Combo Duplo Bacon", burger1, acomp1, bebida1, 22.49);
	//Venda
		venda1 = new Venda(cliente1, func1, "Combo Dublo Bacon; Triplo Ovo", 39.48);
	//Loja
		telLoja1 = new Telefone(061, 999444433);
		horLoja1 = new HoraFuncionamento("10:00", "18:00", "Segunda a Sabado");
		endLoja1 = new Endereco(75000000, "Goias", "Cidade Azul", "Bairro Vermelho", "Rua Verde", 22);
		loja1 = new SobreALoja(telLoja1, horLoja1, endLoja1);
	//Cardapio
		cardapioLoja = new Cardapio(2, 1, 1, 0, 1, 0, 0, 0);
		burgCardapio.add(0, burger1);;
		burgCardapio.add(1, burger2);
		acompCardapio.add(0, acomp1);
		bebCardapio.add(0, bebida1);
		comboCardapio.add(0, combo1);
		
//Saida de dados
		
	//Cardapio
		System.out.println(cardapioLoja.toString());
	//Venda
		System.out.println("*** Venda ***\n");
		System.out.println(venda1.toString());
	//Sobre A Loja
		System.out.println(loja1.toString());
	}

}
