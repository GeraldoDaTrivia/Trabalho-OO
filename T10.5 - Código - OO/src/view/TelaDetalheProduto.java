package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controleConjuntos.ControleDado;
import controleProdutos.*;

public class TelaDetalheProduto implements ActionListener, ListSelectionListener {

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
	private JLabel reais;
	
	private String[] listaNomes = new String[50];
	private String[] listaTipo = new String[50];
	private String[] listaIngred = new String[50];
	private String[] listaMolho = new String[50];
	private String[] listaSabor = new String[50];
	private String[] listaTamanho = new String[50];
	private String[] listaAcomp = new String[50];
	private String[] listaBurger = new String[50];
	private String[] listaBebida = new String[50];
	private String[] listaSobre = new String[50];
	private String[] listaAddIng = new String[50];
	private String[] listaEscMolho = new String[50];
	private String[] listaQtdCarne = new String[50];
	private String[] listaDias = new String[50];
	private String[] listaValor = new String[50];
	
	private JList<String> nomeList;
	private JList<String> tipoList;
	private JList<String> ingredList;
	private JList<String> molhoList;
	private JList<String> saborList;
	private JList<String> tamanhoList;
	private JList<String> acompList;
	private JList<String> burgList;
	private JList<String> bebList;
	private JList<String> sobreList;
	private JList<String> addIngList;
	private JList<String> escMolhoList;
	private JList<String> qtdCarneList;
	private JList<String> diasList;
	private JList<String> valorListAcomp;
	private JList<String> valorListBeb;
	private JList<String> valorListBurg;
	private JList<String> valorListCombo;
	private JList<String> valorListInf;
	private JList<String> valorListPers;
	private JList<String> valorListPromo;
	private JList<String> valorListSobre;
	
	private JButton refreshAcomp;
	private JButton refreshBeb;
	private JButton refreshBurg;
	private JButton refreshCombo;
	private JButton refreshInf;
	private JButton refreshPers;
	private JButton refreshPromo;
	private JButton refreshSobre;
	
	private JButton excluirAcomp;
	private JButton excluirBeb;
	private JButton excluirBurg;
	private JButton excluirCombo;
	private JButton excluirInf;
	private JButton excluirPers;
	private JButton excluirPromo;
	private JButton excluirSobre;
	
	private TelaProduto produto;
	private int index;

	public void mostrarDados(int opcao, ControleDado dados, TelaProduto produto, int selectedIndex) {
		
		this.produto = produto;
		index = selectedIndex;
		
		switch(opcao) {
		
	//Detalhes acompanhamento
		case 1:
			
		//Criando elementos
			janela = new JFrame("Detalhes Acompanhamento");
			
			titulo = new JLabel("Dados do Acompanhamento");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de Sabor");
			ingred = new JLabel("Ingredientes");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleAcompanhamento(TelaMenu.dados).getNome(selectedIndex);
			listaTipo[0] = new ControleAcompanhamento(TelaMenu.dados).getTipo(selectedIndex);
			listaIngred[0] = new ControleAcompanhamento(TelaMenu.dados).getIngredientes(selectedIndex);
			listaValor[0] = new ControleAcompanhamento(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			tipoList = new JList<String>(listaTipo);
			ingredList = new JList<String>(listaIngred);
			valorListAcomp = new JList<String>(listaValor);
			
			refreshAcomp = new JButton("Refresh");
			excluirAcomp = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(60, 15, 300, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(133, 110, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.CENTER);
			tipoProd.setHorizontalAlignment(JLabel.CENTER);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(133, 170, 120, 30);
			ingred.setHorizontalTextPosition(JLabel.CENTER);
			ingred.setHorizontalAlignment(JLabel.CENTER);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 230, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 280, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 260, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			tipoList.setBounds(63, 140, 260, 20);
			tipoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tipoList.setLayoutOrientation(JList.VERTICAL);
			
			ingredList.setBounds(63, 200, 260, 20);
			ingredList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			ingredList.setLayoutOrientation(JList.VERTICAL);
			
			valorListAcomp.setBounds(63, 260, 260, 20);
			valorListAcomp.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListAcomp.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirAcomp.setBounds(63, 310, 100, 30);
			refreshAcomp.setBounds(223, 310, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(tipoProd);
			painel.add(tipoList);
			painel.add(ingred);
			painel.add(ingredList);
			painel.add(valor);
			painel.add(valorListAcomp);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshAcomp);
			painel.add(excluirAcomp);
			
		//Definindo janela
			janela.setSize(390, 430);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListAcomp.addListSelectionListener(this);
			refreshAcomp.addActionListener(this);
			excluirAcomp.addActionListener(this);
			
			break;
			
	//Detalhes bebida		
		case 2:
			
		//Criando elementos
			janela = new JFrame("Detalhes Bebida");
			
			titulo = new JLabel("Dados da Bebida");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo");
			sabor = new JLabel("Sabor");
			tamanho = new JLabel("Tamanho");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleBebida(TelaMenu.dados).getNome(selectedIndex);
			listaTipo[0] = new ControleBebida(TelaMenu.dados).getTipo(selectedIndex);
			listaSabor[0] = new ControleBebida(TelaMenu.dados).getSabor(selectedIndex);
			listaTamanho[0] = new ControleBebida(TelaMenu.dados).getTamanho(selectedIndex);
			listaValor[0] = new ControleBebida(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			tipoList = new JList<String>(listaTipo);
			saborList = new JList<String>(listaSabor);
			tamanhoList = new JList<String>(listaTamanho);
			valorListBeb = new JList<String>(listaValor);
			
			refreshBeb = new JButton("Refresh");
			excluirBeb = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(110, 15, 190, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(133, 110, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.CENTER);
			tipoProd.setHorizontalAlignment(JLabel.CENTER);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			sabor.setBounds(133, 170, 120, 30);
			sabor.setHorizontalTextPosition(JLabel.CENTER);
			sabor.setHorizontalAlignment(JLabel.CENTER);
			sabor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tamanho.setBounds(133, 230, 120, 30);
			tamanho.setHorizontalTextPosition(JLabel.CENTER);
			tamanho.setHorizontalAlignment(JLabel.CENTER);
			tamanho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 290, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 340, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 320, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			tipoList.setBounds(63, 140, 260, 20);
			tipoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tipoList.setLayoutOrientation(JList.VERTICAL);
			
			saborList.setBounds(63, 200, 260, 20);
			saborList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			saborList.setLayoutOrientation(JList.VERTICAL);
			
			tamanhoList.setBounds(63, 260, 260, 20);
			tamanhoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tamanhoList.setLayoutOrientation(JList.VERTICAL);
			
			valorListBeb.setBounds(63, 320, 260, 20);
			valorListBeb.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListBeb.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirBeb.setBounds(63, 370, 100, 30);
			refreshBeb.setBounds(223, 370, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(tipoProd);
			painel.add(tipoList);
			painel.add(sabor);
			painel.add(saborList);
			painel.add(tamanho);
			painel.add(tamanhoList);
			painel.add(valor);
			painel.add(valorListBeb);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshBeb);
			painel.add(excluirBeb);
			
		//Definindo janela
			janela.setSize(390, 490);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListBeb.addListSelectionListener(this);
			refreshBeb.addActionListener(this);
			excluirBeb.addActionListener(this);
			
			break;
			
	//Detalhes burger
		case 3:
			
		//Criando elementos
			janela = new JFrame("Detalhes Burger");
			
			titulo = new JLabel("Dados do Burger");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de Carne");
			ingred = new JLabel("Ingredientes");
			molho = new JLabel("Molho");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleBurger(TelaMenu.dados).getNome(selectedIndex);
			listaTipo[0] = new ControleBurger(TelaMenu.dados).getCarne(selectedIndex);
			listaIngred[0] = new ControleBurger(TelaMenu.dados).getIngredientes(selectedIndex);
			listaMolho[0] = new ControleBurger(TelaMenu.dados).getMolho(selectedIndex);
			listaValor[0] = new ControleBurger(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			tipoList = new JList<String>(listaTipo);
			ingredList = new JList<String>(listaIngred);
			molhoList = new JList<String>(listaMolho);
			valorListBurg = new JList<String>(listaValor);
			
			refreshBurg = new JButton("Refresh");
			excluirBurg = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(110, 15, 190, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(133, 110, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.CENTER);
			tipoProd.setHorizontalAlignment(JLabel.CENTER);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(133, 170, 120, 30);
			ingred.setHorizontalTextPosition(JLabel.CENTER);
			ingred.setHorizontalAlignment(JLabel.CENTER);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molho.setBounds(133, 230, 120, 30);
			molho.setHorizontalTextPosition(JLabel.CENTER);
			molho.setHorizontalAlignment(JLabel.CENTER);
			molho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 290, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 340, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 320, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			tipoList.setBounds(63, 140, 260, 20);
			tipoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tipoList.setLayoutOrientation(JList.VERTICAL);
			
			ingredList.setBounds(63, 200, 260, 20);
			ingredList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			ingredList.setLayoutOrientation(JList.VERTICAL);
			
			molhoList.setBounds(63, 260, 260, 20);
			molhoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			molhoList.setLayoutOrientation(JList.VERTICAL);
			
			valorListBurg.setBounds(63, 320, 260, 20);
			valorListBurg.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListBurg.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirBurg.setBounds(63, 370, 100, 30);
			refreshBurg.setBounds(223, 370, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(tipoProd);
			painel.add(tipoList);
			painel.add(ingred);
			painel.add(ingredList);
			painel.add(molho);
			painel.add(molhoList);
			painel.add(valor);
			painel.add(valorListBurg);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshBurg);
			painel.add(excluirBurg);
			
		//Definindo janela
			janela.setSize(390, 490);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListBurg.addListSelectionListener(this);
			refreshBurg.addActionListener(this);
			excluirBurg.addActionListener(this);
			
			break;
			
	//Detalhes combo
		case 4:
			
		//Criando elementos
			janela = new JFrame("Detalhes Combo");
			
			titulo = new JLabel("Dados do Combo");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			acomp = new JLabel("Acompanhamento");
			beb = new JLabel("Bebida");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleCombo(TelaMenu.dados).getNome(selectedIndex);
			listaBurger[0] = new ControleCombo(TelaMenu.dados).getComboBurger(selectedIndex).getNome();
			listaAcomp[0] = new ControleCombo(TelaMenu.dados).getComboAcomp(selectedIndex).getNome();
			listaBebida[0] = new ControleCombo(TelaMenu.dados).getComboBebida(selectedIndex).getNome();
			listaValor[0] = new ControleCombo(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			burgList = new JList<String>(listaBurger);
			acompList = new JList<String>(listaAcomp);
			bebList = new JList<String>(listaBebida);
			valorListCombo = new JList<String>(listaValor);
			
			refreshCombo = new JButton("Refresh");
			excluirCombo = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(110, 15, 190, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(133, 110, 120, 30);
			burg.setHorizontalTextPosition(JLabel.CENTER);
			burg.setHorizontalAlignment(JLabel.CENTER);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			acomp.setBounds(118, 170, 150, 30);
			acomp.setHorizontalTextPosition(JLabel.CENTER);
			acomp.setHorizontalAlignment(JLabel.CENTER);
			acomp.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			beb.setBounds(133, 230, 120, 30);
			beb.setHorizontalTextPosition(JLabel.CENTER);
			beb.setHorizontalAlignment(JLabel.CENTER);
			beb.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 290, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 340, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 320, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			burgList.setBounds(63, 140, 260, 20);
			burgList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			burgList.setLayoutOrientation(JList.VERTICAL);
			
			acompList.setBounds(63, 200, 260, 20);
			acompList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			acompList.setLayoutOrientation(JList.VERTICAL);
			
			bebList.setBounds(63, 260, 260, 20);
			bebList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			bebList.setLayoutOrientation(JList.VERTICAL);
			
			valorListCombo.setBounds(63, 320, 260, 20);
			valorListCombo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListCombo.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirCombo.setBounds(63, 370, 100, 30);
			refreshCombo.setBounds(223, 370, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(burg);
			painel.add(burgList);
			painel.add(acomp);
			painel.add(acompList);
			painel.add(beb);
			painel.add(bebList);
			painel.add(valor);
			painel.add(valorListCombo);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshCombo);
			painel.add(excluirCombo);
			
		//Definindo janela
			janela.setSize(390, 490);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListCombo.addListSelectionListener(this);
			refreshCombo.addActionListener(this);
			excluirCombo.addActionListener(this);
			
			break;
			
	//Detalhes infantil
		case 5:
			
		//Criando elementos
			janela = new JFrame("Detalhes Infantil");
			
			titulo = new JLabel("Dados do Infantil");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de Carne");
			ingred = new JLabel("Ingredientes");
			molho = new JLabel("Molho");
			acomp = new JLabel("Acompanhamento");
			beb = new JLabel("Bebida");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleInfantil(TelaMenu.dados).getNome(selectedIndex);
			listaTipo[0] = new ControleInfantil(TelaMenu.dados).getTipoCarne(selectedIndex);
			listaIngred[0] = new ControleInfantil(TelaMenu.dados).getIngredientes(selectedIndex);
			listaMolho[0] = new ControleInfantil(TelaMenu.dados).getMolho(selectedIndex);
			listaAcomp[0] = new ControleInfantil(TelaMenu.dados).getInfantilAcomp(selectedIndex).getNome();
			listaBebida[0] = new ControleInfantil(TelaMenu.dados).getInfantilBebida(selectedIndex).getNome();
			listaValor[0] = new ControleInfantil(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			tipoList = new JList<String>(listaTipo);
			ingredList = new JList<String>(listaIngred);
			molhoList = new JList<String>(listaMolho);
			acompList = new JList<String>(listaAcomp);
			bebList = new JList<String>(listaBebida);
			valorListInf = new JList<String>(listaValor);
			
			refreshInf = new JButton("Refresh");
			excluirInf = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(110, 15, 190, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(133, 110, 120, 30);
			tipoProd.setHorizontalTextPosition(JLabel.CENTER);
			tipoProd.setHorizontalAlignment(JLabel.CENTER);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(133, 170, 120, 30);
			ingred.setHorizontalTextPosition(JLabel.CENTER);
			ingred.setHorizontalAlignment(JLabel.CENTER);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molho.setBounds(133, 230, 120, 30);
			molho.setHorizontalTextPosition(JLabel.CENTER);
			molho.setHorizontalAlignment(JLabel.CENTER);
			molho.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			acomp.setBounds(118, 290, 150, 30);
			acomp.setHorizontalTextPosition(JLabel.CENTER);
			acomp.setHorizontalAlignment(JLabel.CENTER);
			acomp.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			beb.setBounds(133, 350, 120, 30);
			beb.setHorizontalTextPosition(JLabel.CENTER);
			beb.setHorizontalAlignment(JLabel.CENTER);
			beb.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 410, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 460, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 440, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			tipoList.setBounds(63, 140, 260, 20);
			tipoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tipoList.setLayoutOrientation(JList.VERTICAL);
			
			ingredList.setBounds(63, 200, 260, 20);
			ingredList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			ingredList.setLayoutOrientation(JList.VERTICAL);
			
			molhoList.setBounds(63, 260, 260, 20);
			molhoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			molhoList.setLayoutOrientation(JList.VERTICAL);
			
			acompList.setBounds(63, 320, 260, 20);
			acompList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			acompList.setLayoutOrientation(JList.VERTICAL);
			
			bebList.setBounds(63, 380, 260, 20);
			bebList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			bebList.setLayoutOrientation(JList.VERTICAL);
			
			valorListInf.setBounds(63, 440, 260, 20);
			valorListInf.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListInf.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirInf.setBounds(63, 490, 100, 30);
			refreshInf.setBounds(223, 490, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(tipoProd);
			painel.add(tipoList);
			painel.add(ingred);
			painel.add(ingredList);
			painel.add(molho);
			painel.add(molhoList);
			painel.add(acomp);
			painel.add(acompList);
			painel.add(beb);
			painel.add(bebList);
			painel.add(valor);
			painel.add(valorListInf);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshInf);
			painel.add(excluirInf);
			
		//Definindo janela
			janela.setSize(390, 610);
			janela.setLocation(765, 300);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListInf.addListSelectionListener(this);
			refreshInf.addActionListener(this);
			excluirInf.addActionListener(this);
			
			break;
			
	//Detalhes personalizavel
		case 6:
			
		//Criando elementos
			janela = new JFrame("Detalhes Personalizavel");
			
			titulo = new JLabel("Dados do Personalizavel");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			qtdCarne = new JLabel("Quantidade de Carnes");
			addIngred = new JLabel("Ingredientes Adicionáveis");
			molhoEscolha = new JLabel("Molhos Para Escolher");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControlePersonalizavel(TelaMenu.dados).getNome(selectedIndex);
			listaBurger[0] = new ControlePersonalizavel(TelaMenu.dados).getPersBurger(selectedIndex).getNome();
			listaQtdCarne[0] = new ControlePersonalizavel(TelaMenu.dados).toStringQtdCarne(selectedIndex);
			listaAddIng[0] = new ControlePersonalizavel(TelaMenu.dados).getAddIngred(selectedIndex);
			listaEscMolho[0] = new ControlePersonalizavel(TelaMenu.dados).getEscolhaMolho(selectedIndex);
			listaValor[0] = new ControlePersonalizavel(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			burgList = new JList<String>(listaBurger);
			qtdCarneList = new JList<String>(listaQtdCarne);
			addIngList = new JList<String>(listaAddIng);
			escMolhoList = new JList<String>(listaEscMolho);
			valorListPers = new JList<String>(listaValor);
			
			refreshPers = new JButton("Refresh");
			excluirPers = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 15, 260, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(133, 110, 120, 30);
			burg.setHorizontalTextPosition(JLabel.CENTER);
			burg.setHorizontalAlignment(JLabel.CENTER);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			qtdCarne.setBounds(103, 170, 180, 30);
			qtdCarne.setHorizontalTextPosition(JLabel.CENTER);
			qtdCarne.setHorizontalAlignment(JLabel.CENTER);
			qtdCarne.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			addIngred.setBounds(93, 230, 200, 30);
			addIngred.setHorizontalTextPosition(JLabel.CENTER);
			addIngred.setHorizontalAlignment(JLabel.CENTER);
			addIngred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			molhoEscolha.setBounds(103, 290, 180, 30);
			molhoEscolha.setHorizontalTextPosition(JLabel.CENTER);
			molhoEscolha.setHorizontalAlignment(JLabel.CENTER);
			molhoEscolha.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 350, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 400, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 380, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			burgList.setBounds(63, 140, 260, 20);
			burgList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			burgList.setLayoutOrientation(JList.VERTICAL);
			
			qtdCarneList.setBounds(63, 200, 260, 20);
			qtdCarneList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			qtdCarneList.setLayoutOrientation(JList.VERTICAL);
			
			addIngList.setBounds(63, 260, 260, 20);
			addIngList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			addIngList.setLayoutOrientation(JList.VERTICAL);
			
			escMolhoList.setBounds(63, 320, 260, 20);
			escMolhoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			escMolhoList.setLayoutOrientation(JList.VERTICAL);
			
			valorListPers.setBounds(63, 380, 260, 20);
			valorListPers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListPers.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirPers.setBounds(63, 440, 100, 30);
			refreshPers.setBounds(223, 440, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(burg);
			painel.add(burgList);
			painel.add(qtdCarne);
			painel.add(qtdCarneList);
			painel.add(addIngred);
			painel.add(addIngList);
			painel.add(molhoEscolha);
			painel.add(escMolhoList);
			painel.add(valor);
			painel.add(valorListPers);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshPers);
			painel.add(excluirPers);
			
		//Definindo janela
			janela.setSize(390, 550);
			janela.setLocation(765, 300);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListPers.addListSelectionListener(this);
			refreshPers.addActionListener(this);
			excluirPers.addActionListener(this);
			
			break;
			
	//Detalhes promocao
		case 7:
			
		//Criando elementos
			janela = new JFrame("Detalhes Promocao");
			
			titulo = new JLabel("Dados da Promoção");
			nome = new JLabel("Nome");
			burg = new JLabel("Burger");
			sobre = new JLabel("Sobremesa");
			dias = new JLabel("Dias Válidos");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControlePromocao(TelaMenu.dados).getNome(selectedIndex);
			listaBurger[0] = new ControlePromocao(TelaMenu.dados).getPromoBurger(selectedIndex).getNome();
			listaSobre[0] = new ControlePromocao(TelaMenu.dados).getPromoSobre(selectedIndex).getNome();
			listaDias[0] = new ControlePromocao(TelaMenu.dados).getDiasValidos(selectedIndex);
			listaValor[0] = new ControlePromocao(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			burgList = new JList<String>(listaBurger);
			sobreList = new JList<String>(listaSobre);
			diasList = new JList<String>(listaDias);
			valorListPromo = new JList<String>(listaValor);
			
			refreshPromo = new JButton("Refresh");
			excluirPromo = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(100, 15, 210, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			burg.setBounds(133, 110, 120, 30);
			burg.setHorizontalTextPosition(JLabel.CENTER);
			burg.setHorizontalAlignment(JLabel.CENTER);
			burg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			sobre.setBounds(133, 170, 120, 30);
			sobre.setHorizontalTextPosition(JLabel.CENTER);
			sobre.setHorizontalAlignment(JLabel.CENTER);
			sobre.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			dias.setBounds(133, 230, 120, 30);
			dias.setHorizontalTextPosition(JLabel.CENTER);
			dias.setHorizontalAlignment(JLabel.CENTER);
			dias.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 290, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 340, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 320, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			burgList.setBounds(63, 140, 260, 20);
			burgList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			burgList.setLayoutOrientation(JList.VERTICAL);
			
			sobreList.setBounds(63, 200, 260, 20);
			sobreList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			sobreList.setLayoutOrientation(JList.VERTICAL);
			
			diasList.setBounds(63, 260, 260, 20);
			diasList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			diasList.setLayoutOrientation(JList.VERTICAL);
			
			valorListPromo.setBounds(63, 320, 260, 20);
			valorListPromo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListPromo.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirPromo.setBounds(63, 370, 100, 30);
			refreshPromo.setBounds(223, 370, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(burg);
			painel.add(burgList);
			painel.add(sobre);
			painel.add(sobreList);
			painel.add(dias);
			painel.add(diasList);
			painel.add(valor);
			painel.add(valorListPromo);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshPromo);
			painel.add(excluirPromo);
			
		//Definindo janela
			janela.setSize(390, 490);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListPromo.addListSelectionListener(this);
			refreshPromo.addActionListener(this);
			excluirPromo.addActionListener(this);
			
			break;
			
	//Detalhes sobremesa
		case 8:
			
		//Criando elementos
			janela = new JFrame("Detalhes Sobremesa");
			
			titulo = new JLabel("Dados da Sobremesa");
			nome = new JLabel("Nome");
			tipoProd = new JLabel("Tipo de Sobremesa");
			ingred = new JLabel("Ingredientes");
			valor = new JLabel("Valor");
			aviso = new JLabel("*clique no valor para edita-lo");
			reais = new JLabel("R$");
			
			listaNomes[0]= new ControleSobremesa(TelaMenu.dados).getNome(selectedIndex);
			listaTipo[0] = new ControleSobremesa(TelaMenu.dados).getTipo(selectedIndex);
			listaIngred[0] = new ControleSobremesa(TelaMenu.dados).getIngredientes(selectedIndex);
			listaValor[0] = new ControleSobremesa(TelaMenu.dados).toStringValor(selectedIndex);
			
			nomeList = new JList<String>(listaNomes);
			tipoList = new JList<String>(listaTipo);
			ingredList = new JList<String>(listaIngred);
			valorListSobre = new JList<String>(listaValor);
			
			refreshSobre = new JButton("Refresh");
			excluirSobre = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 15, 220, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			tipoProd.setBounds(103, 110, 160, 30);
			tipoProd.setHorizontalTextPosition(JLabel.CENTER);
			tipoProd.setHorizontalAlignment(JLabel.CENTER);
			tipoProd.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ingred.setBounds(133, 170, 120, 30);
			ingred.setHorizontalTextPosition(JLabel.CENTER);
			ingred.setHorizontalAlignment(JLabel.CENTER);
			ingred.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			valor.setBounds(153, 230, 70, 30);
			valor.setHorizontalTextPosition(JLabel.CENTER);
			valor.setHorizontalAlignment(JLabel.CENTER);
			valor.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			aviso.setBounds(180, 280, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
			reais.setBounds(43, 260, 20, 20);
			reais.setFont(new Font("Reais", Font.ITALIC, 12));
			
		//Definindo JLists
			nomeList.setBounds(63, 80, 260, 20);
			nomeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeList.setLayoutOrientation(JList.VERTICAL);
			
			tipoList.setBounds(63, 140, 260, 20);
			tipoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			tipoList.setLayoutOrientation(JList.VERTICAL);
			
			ingredList.setBounds(63, 200, 260, 20);
			ingredList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			ingredList.setLayoutOrientation(JList.VERTICAL);
			
			valorListSobre.setBounds(63, 260, 260, 20);
			valorListSobre.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			valorListSobre.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirSobre.setBounds(63, 310, 100, 30);
			refreshSobre.setBounds(223, 310, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeList);
			painel.add(tipoProd);
			painel.add(tipoList);
			painel.add(ingred);
			painel.add(ingredList);
			painel.add(valor);
			painel.add(valorListSobre);
			painel.add(aviso);
			painel.add(reais);
			painel.add(refreshSobre);
			painel.add(excluirSobre);
			
		//Definindo janela
			janela.setSize(390, 430);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			valorListSobre.addListSelectionListener(this);
			refreshSobre.addActionListener(this);
			excluirSobre.addActionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

//Atualizar tela e excluir produtos
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
//Atualizar tela
		
	//Atualizar detalhes do acompanhamento
		if(src==refreshAcomp) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(1, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes da bebida
		} else if(src==refreshBeb) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(2, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes do burger
		} else if(src==refreshBurg) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(3, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes do combo
		} else if(src==refreshCombo) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(4, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes do infantil
		} else if(src==refreshInf) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(5, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes do personalizavel
		} else if(src==refreshPers) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(6, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes da promocao
		} else if(src==refreshPromo) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(7, TelaMenu.dados, produto, index);
			
	//Atualizar detalhes da sobremesa
		} else if(src==refreshSobre) {
			janela.dispose();
			new TelaDetalheProduto().mostrarDados(8, TelaMenu.dados, produto, index);
			
		}
		
//Excluir produtos
		
	//Excluir acompanhamento
		if(src==excluirAcomp) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "acompanhamento ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirAcomp(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(index), index);
				janela.dispose();
			}
			
	//Excluir bebida
		} else if(src==excluirBeb) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esta\n"
					+ "bebida ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirBebida(TelaMenu.dados.getDadoProduto().getOneBebida(index), index);
				janela.dispose();
			}
			
	//Excluir burger
		} else if(src==excluirBurg) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "burger ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirBurger(TelaMenu.dados.getDadoProduto().getOneBurger(index), index);
				janela.dispose();
			}
			
	//Excluir combo
		} else if(src==excluirCombo) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "combo ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirCombo(TelaMenu.dados.getDadoProduto().getOneCombo(index), index);
				janela.dispose();
			}
			
	//Excluir infantil
		} else if(src==excluirInf) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "combo infantil ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirInfantil(TelaMenu.dados.getDadoProduto().getOneInfantil(index), index);
				janela.dispose();
			}
			
	//Excluir personalizavel
		} else if(src==excluirPers) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "personalizável ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirPers(TelaMenu.dados.getDadoProduto().getOnePers(index), index);
				janela.dispose();
			}
			
	//Excluir promocao
		} else if(src==excluirPromo) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esta\n"
					+ "promoção ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirPromo(TelaMenu.dados.getDadoProduto().getOnePromo(index), index);
				janela.dispose();
			}
			
	//Excluir sobremesa
		} else if(src==excluirSobre) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esta\n"
					+ "sobremesa ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoProduto().excluirSobre(TelaMenu.dados.getDadoProduto().getOneSobre(index), index);
				janela.dispose();
			}
			
		}
		
	}

//Editar valor dos produtos
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
	//Editar valor acompanhamento
		if(e.getValueIsAdjusting() && src==valorListAcomp) {
			new TelaEditarValor().editarValor(1, TelaMenu.dados, this, index);
			
	//Editar valor bebida
		} else if(e.getValueIsAdjusting() && src==valorListBeb) {
			new TelaEditarValor().editarValor(2, TelaMenu.dados, this, index);
			
	//Editar valor burger
		} else if(e.getValueIsAdjusting() && src==valorListBurg) {
			new TelaEditarValor().editarValor(3, TelaMenu.dados, this, index);
			
	//Editar valor combo
		} else if(e.getValueIsAdjusting() && src==valorListCombo) {
			new TelaEditarValor().editarValor(4, TelaMenu.dados, this, index);
			
	//Editar valor infantil
		} else if(e.getValueIsAdjusting() && src==valorListInf) {
			new TelaEditarValor().editarValor(5, TelaMenu.dados, this, index);
			
	//Editar valor personalizavel
		} else if(e.getValueIsAdjusting() && src==valorListPers) {
			new TelaEditarValor().editarValor(6, TelaMenu.dados, this, index);
			
	//Editar valor promocao
		} else if(e.getValueIsAdjusting() && src==valorListPromo) {
			new TelaEditarValor().editarValor(7, TelaMenu.dados, this, index);
			
	//Editar valor sobremesa
		} else if(e.getValueIsAdjusting() && src==valorListSobre) {
			new TelaEditarValor().editarValor(8, TelaMenu.dados, this, index);
			
		}
		
	}

}
