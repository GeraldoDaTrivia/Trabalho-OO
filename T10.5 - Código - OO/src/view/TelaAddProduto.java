package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleConjuntos.ControleDado;
import modeloProdutos.*;

public class TelaAddProduto implements ActionListener {

	private JFrame janela;
	private JPanel painel;
	
	private JLabel titulo;
	private JLabel nome;
	private JLabel valor;
	private JLabel ingred;
	private JLabel tipoProd;
	private JLabel sabor;
	private JLabel tamanho;
	private JLabel molho;
	private JLabel acomp;
	private JLabel beb;
	private JLabel burg;
	private JLabel sobre;
	private JLabel addIngred;
	private JLabel molhoEscolha;
	private JLabel qtdCarne;
	private JLabel dias;
	private JLabel aviso;
	private JLabel aviso2;
	
	private JTextField nomeField;
	private JTextField valorField;
	private JTextField ingredField;
	private JTextField tipoField;
	private JTextField saborField;
	private JTextField tamField;
	private JTextField molhoField;
	private JTextField acompField;
	private JTextField bebField;
	private JTextField burgField;
	private JTextField sobreField;
	private JTextField addIngredField;
	private JTextField escMolhoField;
	private JTextField qtdCarneField;
	private JTextField diasField;
	
	private JButton addAcomp;
	private JButton addBeb;
	private JButton addBurger;
	private JButton addCombo;
	private JButton addInf;
	private JButton addPers;
	private JButton addPromo;
	private JButton addSobre;
	
	
	public void inserirEditar(int opcao, ControleDado dados, TelaProduto telaProduto) {
		
		switch(opcao) {
	
	//Criando Acompanhamento
		case 1:
			
		//Criando elementos
			janela = new JFrame("Criar Acompanhamento");
			titulo = new JLabel("Novo Acompanhamento");
			nome = new JLabel("Nome");
			ingred = new JLabel("Ingredientes");
			tipoProd = new JLabel("Tipo de sabor");
			valor = new JLabel("Valor");
			aviso = new JLabel("*salgado, doce, ...");
			nomeField = new JTextField(30);
			ingredField = new JTextField(30);
			tipoField = new JTextField(30);
			valorField = new JTextField(30);
			addAcomp = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 15, 250, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(140, 120, 90, 30);
			ingred.setHorizontalTextPosition(JLabel.LEFT);
			ingred.setHorizontalAlignment(JLabel.LEFT);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(140, 190, 150, 30);
			tipoProd.setHorizontalTextPosition(JLabel.LEFT);
			tipoProd.setHorizontalAlignment(JLabel.LEFT);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 260, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(225, 245, 130, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			ingredField.setBounds(65, 150, 250, 30);
			ingredField.setHorizontalAlignment(JTextField.CENTER);
			
			tipoField.setBounds(65, 220, 250, 30);
			tipoField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 290, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addAcomp.setBounds(140, 330, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(ingred);
			painel.add(ingredField);
			painel.add(tipoProd);
			painel.add(tipoField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addAcomp);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 420);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addAcomp.addActionListener(this);
			
			break;
			
	//Criando bebida
		case 2:
			
		//Criando elementos
			janela = new JFrame("Criar Bebida");
			titulo = new JLabel("Nova Bebida");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo");
			sabor = new JLabel("Sabor");
			tamanho = new JLabel("Tamanho");
			valor = new JLabel("Valor");
			aviso = new JLabel("*refri, suco, ...");
			nomeField = new JTextField(30);
			tipoField = new JTextField(30);
			saborField = new JTextField(30);
			tamField = new JTextField(30);
			valorField = new JTextField(30);
			addBeb = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(165, 120, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.LEFT);
			tipoProd.setHorizontalAlignment(JLabel.LEFT);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			sabor.setBounds(160, 190, 90, 30);
			sabor.setHorizontalTextPosition(JLabel.LEFT);
			sabor.setHorizontalAlignment(JLabel.LEFT);
			sabor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tamanho.setBounds(150, 260, 100, 30);
			tamanho.setHorizontalTextPosition(JLabel.LEFT);
			tamanho.setHorizontalAlignment(JLabel.LEFT);
			tamanho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 330, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(235, 175, 130, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			tipoField.setBounds(65, 150, 250, 30);
			tipoField.setHorizontalAlignment(JTextField.CENTER);
			
			saborField.setBounds(65, 220, 250, 30);
			saborField.setHorizontalAlignment(JTextField.CENTER);
			
			tamField.setBounds(65, 290, 250, 30);
			tamField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 360, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addBeb.setBounds(140, 400, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(tipoProd);
			painel.add(tipoField);
			painel.add(sabor);
			painel.add(saborField);
			painel.add(tamanho);
			painel.add(tamField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addBeb);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 500);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addBeb.addActionListener(this);
			
			break;
			
	//Criando Burgers
		case 3:
	
		//Criando elementos
			janela = new JFrame("Criar Burger");
			titulo = new JLabel("Novo Burger");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo da carne");
			ingred = new JLabel("Ingredientes");
			molho = new JLabel("Molho");
			valor = new JLabel("Valor");
			aviso = new JLabel("*boi, frango, ...");
			nomeField = new JTextField(30);
			tipoField = new JTextField(30);
			ingredField = new JTextField(30);
			molhoField = new JTextField(30);
			valorField = new JTextField(30);
			addBurger = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(135, 120, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.LEFT);
			tipoProd.setHorizontalAlignment(JLabel.LEFT);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(140, 190, 90, 30);
			ingred.setHorizontalTextPosition(JLabel.LEFT);
			ingred.setHorizontalAlignment(JLabel.LEFT);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molho.setBounds(165, 260, 50, 30);
			molho.setHorizontalTextPosition(JLabel.LEFT);
			molho.setHorizontalAlignment(JLabel.LEFT);
			molho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 330, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(240, 175, 130, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			tipoField.setBounds(65, 150, 250, 30);
			tipoField.setHorizontalAlignment(JTextField.CENTER);
			
			ingredField.setBounds(65, 220, 250, 30);
			ingredField.setHorizontalAlignment(JTextField.CENTER);
			
			molhoField.setBounds(65, 290, 250, 30);
			molhoField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 360, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addBurger.setBounds(140, 400, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(tipoProd);
			painel.add(tipoField);
			painel.add(ingred);
			painel.add(ingredField);
			painel.add(molho);
			painel.add(molhoField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addBurger);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 500);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addBurger.addActionListener(this);
	
			break;
			
	//Criando Combo
		case 4:
			
		//Criando elementos
			janela = new JFrame("Criar Combo");
			titulo = new JLabel("Novo Combo");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			acomp = new JLabel("Acompanhamento");
			beb = new JLabel("Bebida");
			aviso = new JLabel("*valor calculado automaticamente");
			nomeField = new JTextField(30);
			burgField = new JTextField(30);
			acompField = new JTextField(30);
			bebField = new JTextField(30);
			addCombo = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(160, 120, 90, 30);
			burg.setHorizontalTextPosition(JLabel.LEFT);
			burg.setHorizontalAlignment(JLabel.LEFT);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			acomp.setBounds(120, 190, 130, 30);
			acomp.setHorizontalTextPosition(JLabel.LEFT);
			acomp.setHorizontalAlignment(JLabel.LEFT);
			acomp.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			beb.setBounds(160, 260, 50, 30);
			beb.setHorizontalTextPosition(JLabel.LEFT);
			beb.setHorizontalAlignment(JLabel.LEFT);
			beb.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(150, 320, 180, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			burgField.setBounds(65, 150, 250, 30);
			burgField.setHorizontalAlignment(JTextField.CENTER);
			
			acompField.setBounds(65, 220, 250, 30);
			acompField.setHorizontalAlignment(JTextField.CENTER);
			
			bebField.setBounds(65, 290, 250, 30);
			bebField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addCombo.setBounds(140, 350, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(burg);
			painel.add(burgField);
			painel.add(acomp);
			painel.add(acompField);
			painel.add(beb);
			painel.add(bebField);
			painel.add(addCombo);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 450);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addCombo.addActionListener(this);
			
			break;
			
			
	//Criando Infantil
		case 5:
			
		//Criando elementos
			janela = new JFrame("Criar Infantil");
			titulo = new JLabel("Novo Infantil");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de Carne");
			ingred = new JLabel("Ingredientes");
			molho = new JLabel("Molho");
			acomp = new JLabel("Acompanhamento");
			beb = new JLabel("Bebida");
			valor = new JLabel("Valor");
			aviso = new JLabel("*boi, frango, ...");
			nomeField = new JTextField(30);
			tipoField = new JTextField(30);
			ingredField = new JTextField(30);
			molhoField = new JTextField(30);
			acompField = new JTextField(30);
			bebField = new JTextField(30);
			valorField = new JTextField(30);
			addInf = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(140, 120, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.LEFT);
			tipoProd.setHorizontalAlignment(JLabel.LEFT);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(140, 190, 90, 30);
			ingred.setHorizontalTextPosition(JLabel.LEFT);
			ingred.setHorizontalAlignment(JLabel.LEFT);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molho.setBounds(165, 260, 50, 30);
			molho.setHorizontalTextPosition(JLabel.LEFT);
			molho.setHorizontalAlignment(JLabel.LEFT);
			molho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			acomp.setBounds(120, 330, 130, 30);
			acomp.setHorizontalTextPosition(JLabel.LEFT);
			acomp.setHorizontalAlignment(JLabel.LEFT);
			acomp.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			beb.setBounds(160, 400, 50, 30);
			beb.setHorizontalTextPosition(JLabel.LEFT);
			beb.setHorizontalAlignment(JLabel.LEFT);
			beb.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 470, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(240, 175, 130, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			tipoField.setBounds(65, 150, 250, 30);
			tipoField.setHorizontalAlignment(JTextField.CENTER);
			
			ingredField.setBounds(65, 220, 250, 30);
			ingredField.setHorizontalAlignment(JTextField.CENTER);
			
			molhoField.setBounds(65, 290, 250, 30);
			molhoField.setHorizontalAlignment(JTextField.CENTER);
			
			acompField.setBounds(65, 360, 250, 30);
			acompField.setHorizontalAlignment(JTextField.CENTER);
			
			bebField.setBounds(65, 430, 250, 30);
			bebField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 500, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addInf.setBounds(140, 540, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(tipoProd);
			painel.add(tipoField);
			painel.add(ingred);
			painel.add(ingredField);
			painel.add(molho);
			painel.add(molhoField);
			painel.add(acomp);
			painel.add(acompField);
			painel.add(beb);
			painel.add(bebField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addInf);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 650);
			janela.setLocation(765, 300);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addInf.addActionListener(this);
			
			break;
			
	//Criando Personalizaveis
		case 6:
			
		//Criando elementos
			janela = new JFrame("Criar Personalizavel");
			titulo = new JLabel("Novo Personalizavel");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			qtdCarne = new JLabel("Quantidade de Carnes");
			addIngred = new JLabel("Ingredientes Adicionáveis");
			molhoEscolha = new JLabel("Molhos Para Escolher");
			valor = new JLabel("Valor");
			aviso = new JLabel("*nome do burger para personalizar");
			nomeField = new JTextField(30);
			burgField = new JTextField(30);
			qtdCarneField = new JTextField(30);
			addIngredField = new JTextField(30);
			escMolhoField = new JTextField(30);
			valorField = new JTextField(30);
			addPers = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(100, 15, 240, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(160, 120, 90, 30);
			burg.setHorizontalTextPosition(JLabel.LEFT);
			burg.setHorizontalAlignment(JLabel.LEFT);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			qtdCarne.setBounds(110, 190, 180, 30);
			qtdCarne.setHorizontalTextPosition(JLabel.LEFT);
			qtdCarne.setHorizontalAlignment(JLabel.LEFT);
			qtdCarne.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			addIngred.setBounds(100, 260, 200, 30);
			addIngred.setHorizontalTextPosition(JLabel.LEFT);
			addIngred.setHorizontalAlignment(JLabel.LEFT);
			addIngred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molhoEscolha.setBounds(110, 330, 160, 30);
			molhoEscolha.setHorizontalTextPosition(JLabel.LEFT);
			molhoEscolha.setHorizontalAlignment(JLabel.LEFT);
			molhoEscolha.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 400, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(140, 175, 200, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			burgField.setBounds(65, 150, 250, 30);
			burgField.setHorizontalAlignment(JTextField.CENTER);
			
			qtdCarneField.setBounds(65, 220, 250, 30);
			qtdCarneField.setHorizontalAlignment(JTextField.CENTER);
			
			addIngredField.setBounds(65, 290, 250, 30);
			addIngredField.setHorizontalAlignment(JTextField.CENTER);
			
			escMolhoField.setBounds(65, 360, 250, 30);
			escMolhoField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 430, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addPers.setBounds(140, 480, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(burg);
			painel.add(burgField);
			painel.add(qtdCarne);
			painel.add(qtdCarneField);
			painel.add(addIngred);
			painel.add(addIngredField);
			painel.add(molhoEscolha);
			painel.add(escMolhoField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addPers);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 580);
			janela.setLocation(765, 300);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addPers.addActionListener(this);
			
			break;
			
	//Criando Promocao
		case 7:
			
		//Criando elementos
			janela = new JFrame("Criar Promocao");
			titulo = new JLabel("Nova Promoção");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			sobre = new JLabel("Sobremesa");
			dias = new JLabel("Dias Válidos");
			valor = new JLabel("Valor");
			aviso = new JLabel("*nome do burger para promoção");
			aviso2 = new JLabel("*nome da sobremesa para promoção");
			nomeField = new JTextField(30);
			burgField = new JTextField(30);
			sobreField = new JTextField(30);
			diasField = new JTextField(30);
			valorField = new JTextField(30);
			addPromo = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(110, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(160, 120, 90, 30);
			burg.setHorizontalTextPosition(JLabel.LEFT);
			burg.setHorizontalAlignment(JLabel.LEFT);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			sobre.setBounds(140, 190, 90, 30);
			sobre.setHorizontalTextPosition(JLabel.LEFT);
			sobre.setHorizontalAlignment(JLabel.LEFT);
			sobre.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			dias.setBounds(140, 260, 120, 30);
			dias.setHorizontalTextPosition(JLabel.LEFT);
			dias.setHorizontalAlignment(JLabel.LEFT);
			dias.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 330, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(150, 175, 180, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
			aviso2.setBounds(130, 245, 200, 20);
			aviso2.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			burgField.setBounds(65, 150, 250, 30);
			burgField.setHorizontalAlignment(JTextField.CENTER);
			
			sobreField.setBounds(65, 220, 250, 30);
			sobreField.setHorizontalAlignment(JTextField.CENTER);
			
			diasField.setBounds(65, 290, 250, 30);
			diasField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 360, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addPromo.setBounds(140, 400, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(burg);
			painel.add(burgField);
			painel.add(sobre);
			painel.add(sobreField);
			painel.add(dias);
			painel.add(diasField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addPromo);
			painel.add(aviso);
			painel.add(aviso2);
			
		//Definindo janela
			janela.setSize(390, 510);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addPromo.addActionListener(this);
			
			break;
			
	//Criando Sobremesa
		case 8:
			
		//Criando elementos
			janela = new JFrame("Criar Sobremesa");
			titulo = new JLabel("Nova Sobremesa");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de sobremesa");
			ingred = new JLabel("Ingredientes");
			valor = new JLabel("Valor");
			aviso = new JLabel("*casquinha, brownie, ...");
			nomeField = new JTextField(30);
			tipoField = new JTextField(30);
			ingredField = new JTextField(30);
			valorField = new JTextField(30);
			addSobre = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(105, 15, 190, 30);
			
			nome.setBounds(165, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(115, 120, 150, 30);
			tipoProd.setHorizontalTextPosition(JLabel.LEFT);
			tipoProd.setHorizontalAlignment(JLabel.LEFT);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(140, 190, 90, 30);
			ingred.setHorizontalTextPosition(JLabel.LEFT);
			ingred.setHorizontalAlignment(JLabel.LEFT);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(165, 260, 50, 30);
			valor.setHorizontalTextPosition(JLabel.LEFT);
			valor.setHorizontalAlignment(JLabel.LEFT);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(200, 175, 130, 20);
			aviso.setFont(new Font("Formato", Font.ITALIC, 11));
			
		//Definindo JTextFields
			nomeField.setBounds(65, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			tipoField.setBounds(65, 150, 250, 30);
			tipoField.setHorizontalAlignment(JTextField.CENTER);
			
			ingredField.setBounds(65, 220, 250, 30);
			ingredField.setHorizontalAlignment(JTextField.CENTER);
			
			valorField.setBounds(65, 290, 250, 30);
			valorField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addSobre.setBounds(140, 330, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(tipoProd);
			painel.add(tipoField);
			painel.add(ingred);
			painel.add(ingredField);
			painel.add(valor);
			painel.add(valorField);
			painel.add(addSobre);
			painel.add(aviso);
			
		//Definindo janela
			janela.setSize(390, 440);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			addSobre.addActionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Adicionar Acompanhamento
		if(src==addAcomp) {
			
			Acompanhamento acomp;
			
			String nome = nomeField.getText();
			String ingred = ingredField.getText();
			String tipo = tipoField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(ingredField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(tipoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tipo.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Acompanhamento
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					double valor = Double.parseDouble(valorString);
					
					acomp = new Acompanhamento(nome, tipo, ingred, valor);
					TelaMenu.dados.getDadoProduto().inserirEditarAcomp(acomp, TelaMenu.dados.getDadoProduto().getQtdAcomps());
					
					janela.dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			}

			
		}
		
	//Adicionar Bebida
		if(src==addBeb) {
			
			Bebida bebida;
			
			String nome = nomeField.getText();
			String tipo = tipoField.getText();
			String sabor = saborField.getText();
			String tamanho = tamField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(tipoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tipo.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(saborField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar sabor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(tamField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tamanho.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			}  else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Bebida
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					double valor = Double.parseDouble(valorString);
					
					bebida = new Bebida(tipo, nome, sabor, tamanho, valor);
					TelaMenu.dados.getDadoProduto().inserirEditarBebida(bebida, TelaMenu.dados.getDadoProduto().getQtdBebida());
					
					janela.dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
			
		}
		
	//Adicionar Burger
		if(src==addBurger) {
			
			Burger burger;
			
			String nome = nomeField.getText();
			String tipo = tipoField.getText();
			String ingred = ingredField.getText();
			String molho = molhoField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(tipoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tipo.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(ingredField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(molhoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar molho.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			}  else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Burger
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					double valor = Double.parseDouble(valorString);
					
					burger = new Burger(nome, tipo, ingred, molho, valor);
					TelaMenu.dados.getDadoProduto().inserirEditarBurger(burger, TelaMenu.dados.getDadoProduto().getQtdBurger());
					
					janela.dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		}
		
	//Adicionar Combo
		if(src==addCombo) {
			
			Combo combo;
			Burger burg = null;
			Acompanhamento acompanha = null;
			Bebida bebida = null;
			
			String nome = nomeField.getText();
			String burger = burgField.getText();
			String acomp = acompField.getText();
			String beb = bebField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(burgField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar burger.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(acompField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar acompanhamento.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(bebField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar bebida.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Criacao de novo Combo
			} else {
				
				int burgIguais = 0;
				int acompIguais = 0;
				int bebIguais = 0;
				double valor = 0;
				
				for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBurger(); i++) {
					if(burger.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
						burg = TelaMenu.dados.getDadoProduto().getOneBurger(i);
						valor = valor + TelaMenu.dados.getDadoProduto().getOneBurger(i).getValor();
						
						burgIguais++;
					}
				}
				
				for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdAcomps(); i++) {
					if(acomp.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
						acompanha = TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i);
						valor = valor + TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getValor();
						
						acompIguais++;
					}
				}
				
				for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBebida(); i++) {
					if(beb.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
						bebida = TelaMenu.dados.getDadoProduto().getOneBebida(i);
						valor = valor + TelaMenu.dados.getDadoProduto().getOneBebida(i).getValor();
						
						bebIguais++;
					}
				}
				
				if(burgIguais==0) {
					JOptionPane.showMessageDialog(null, "Não existe Burger com este nome.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				} else if(acompIguais==0){
					JOptionPane.showMessageDialog(null, "Não existe Acompanhamento com este nome.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				} else if(bebIguais==0) {
					JOptionPane.showMessageDialog(null, "Não existe Bebida com este nome.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				} else {
					valor = valor*0.8;
					
					combo = new Combo(nome, burg, acompanha, bebida, valor);
					TelaMenu.dados.getDadoProduto().inserirEditarCombo(combo, TelaMenu.dados.getDadoProduto().getQtdCombos());
					
					janela.dispose();
				}
			}
			
		}
		
	//Adicionar Infantil
		if(src==addInf) {
			
			Infantil infantil;
			Acompanhamento acompanha = null;
			Bebida bebida = null;
			
			String nome = nomeField.getText();
			String tipo = tipoField.getText();
			String ingred = ingredField.getText();
			String molho = molhoField.getText();
			String acomp = acompField.getText();
			String beb = bebField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(tipoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tipo.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(ingredField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(molhoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar molho.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(acompField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar acompanhamento.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(bebField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar bebida.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Infantil
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					int acompIguais = 0;
					int bebIguais = 0;
					double valor = Double.parseDouble(valorString);
					
				//Comparar nome do Acompanhamento e da Bebida
					for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdAcomps(); i++) {
						if(acomp.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
							acompanha = TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i);
							acompIguais++;
						}
					}
					for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBebida(); i++) {
						if(beb.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
							bebida = TelaMenu.dados.getDadoProduto().getOneBebida(i);
							bebIguais++;
						}
					}
					
					if(acompIguais==0){
						JOptionPane.showMessageDialog(null, "Não existe Acompanhamento com este nome.\n"
								+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					} else if(bebIguais==0) {
						JOptionPane.showMessageDialog(null, "Não existe Bebida com este nome.\n"
								+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					} else {
						
						infantil = new Infantil(nome, tipo, ingred, molho, acompanha, bebida, valor);
						TelaMenu.dados.getDadoProduto().inserirEditarInfantil(infantil, TelaMenu.dados.getDadoProduto().getQtdInfantis());
						
						janela.dispose();
						
					}
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			}
			
		}
		
	//Adicionar Personalizavel
		if(src==addPers) {
			
			Personalizavel person;
			Burger burg = null;
			
			String nome = nomeField.getText();
			String burger = burgField.getText();
			String carneString = qtdCarneField.getText();
			String addIng = addIngredField.getText();
			String addMolho = escMolhoField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(burgField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar Burger.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(qtdCarneField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(addIngredField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes adicionáveis.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(escMolhoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar molhos alternativos.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Personalizavel
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)") && carneString.matches("[0-9]+")) {
					
					int burgIguais = 0;
					int qtdCarne = Integer.parseInt(carneString);
					double valor = Double.parseDouble(valorString);
					
				//Comparar nome do Burger
					for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBurger(); i++) {
						if(burger.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
							burg = TelaMenu.dados.getDadoProduto().getOneBurger(i);
							valor = valor + TelaMenu.dados.getDadoProduto().getOneBurger(i).getValor();
							
							burgIguais++;
						}
					}
					
					if(burgIguais==0) {
						JOptionPane.showMessageDialog(null, "Não existe Burger com este nome.\n"
								+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					} else {
						
						person = new Personalizavel(nome, burg, qtdCarne, addIng, addMolho, valor);
						TelaMenu.dados.getDadoProduto().inserirEditarPers(person, TelaMenu.dados.getDadoProduto().getQtdPers());
					
						janela.dispose();
					}
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "A qtd. de carne só pode ser composta por números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
			
		}
		
	//Adicionar Promocao
		if(src==addPromo) {
			
			Promocao promocao;
			Burger burg = null;
			Sobremesa sobremesa = null;
			
			String nome = nomeField.getText();
			String dias = diasField.getText();
			String burger = burgField.getText();
			String sobre = sobreField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(diasField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar dias válidos.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(burgField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar Burger.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(sobreField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar Sobremesa.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de nova Promocao
			} else {
				
				int burgIguais = 0;
				int sobreIguais = 0;
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					double valor = Double.parseDouble(valorString);
					
				//Comparar nome do Burger e da Sobremesa
					for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBurger(); i++) {
						if(burger.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
							burg = TelaMenu.dados.getDadoProduto().getOneBurger(i);
							burgIguais++;
						}
					}
					
					for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdSobremesa(); i++) {
						if(sobre.equals(TelaMenu.dados.getDadoProduto().getOneSobre(i).getNome())) {
							sobremesa = TelaMenu.dados.getDadoProduto().getOneSobre(i);
							sobreIguais++;
						}
					}
					
					if(burgIguais==0){
						JOptionPane.showMessageDialog(null, "Não existe Burger com este nome.\n"
								+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					} else if(sobreIguais==0) {
						JOptionPane.showMessageDialog(null, "Não existe Sobremesa com este nome.\n"
								+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					} else {
						
						promocao = new Promocao(nome, dias, burg, sobremesa, valor);
						TelaMenu.dados.getDadoProduto().inserirEditarPromo(promocao, TelaMenu.dados.getDadoProduto().getQtdPromo());
						
						janela.dispose();
					}
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			
			}
		}
		
	//Adicionar Sobremesa
		if(src==addSobre) {
			
			Sobremesa sobremesa;
			
			String tipo = tipoField.getText();
			String nome = nomeField.getText();
			String ingred = ingredField.getText();
			String valorString = valorField.getText();
			
		//Verificacao de campos nulos
			if(tipoField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar tipo.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(ingredField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar ingredientes.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			}else if(valorField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar valor.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de nova Sobremesa
			} else {
				
			//Verificar valor
				if(valorString.matches("(\\d+\\.\\d+)")) {
					
					double valor = Double.parseDouble(valorString);
					
					sobremesa = new Sobremesa(tipo, nome, ingred, valor);
					TelaMenu.dados.getDadoProduto().inserirEditarSobremesa(sobremesa, TelaMenu.dados.getDadoProduto().getQtdSobremesa());
					
					janela.dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
							+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
			
		}
		
	}

}
