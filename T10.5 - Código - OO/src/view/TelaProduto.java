package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controleConjuntos.ControleDado;
import controleProdutos.*;

public class TelaProduto implements ActionListener, ListSelectionListener{
	
	private JFrame janela;
	private JPanel painelCima;
	private JPanel painelLista;
	private JPanel painelBaixo;
	private JLabel titulo;
	
//JButtons
	private JButton cadastroAcomp;
	private JButton refreshAcomp;
	private JButton cadastroBebida;
	private JButton refreshBebida;
	private JButton cadastroBurger;
	private JButton refreshBurger;
	private JButton cadastroCombo;
	private JButton refreshCombo;
	private JButton cadastroInf;
	private JButton refreshInf;
	private JButton cadastroPers;
	private JButton refreshPers;
	private JButton cadastroPromo;
	private JButton refreshPromo;
	private JButton cadastroSobre;
	private JButton refreshSobre;
	
	private ControleDado dados;
	
//JLists
	private JList<String> listaAcomp;
	private JList<String> listaBebida;
	private JList<String> listaBurger;
	private JList<String> listaCombo;
	private JList<String> listaInfantil;
	private JList<String> listaPers;
	private JList<String> listaPromo;
	private JList<String> listaSobre;
	
	private String[] listaNomes = new String[50];
	private JScrollPane scroll;

	public void mostrarDados(ControleDado dados, int opcao) {
		this.dados = dados;
		
		switch(opcao) {
	//Mostrar lista de acompanhamentos
		case 1:
			listaNomes = new ControleAcompanhamento(dados).getNomeAcomp();
			listaAcomp = new JList<String>(listaNomes);
			
			janela = new JFrame("Acompanhamentos");

			titulo = new JLabel("Acompanhamento");
			cadastroAcomp = new JButton("Cadastro");
			refreshAcomp = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(100, 10, 200, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaAcomp.setBounds(13, 50, 350, 200);
			listaAcomp.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAcomp.setLayoutOrientation(JList.VERTICAL);
			listaAcomp.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaAcomp);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroAcomp.setBounds(80, 265, 100, 30);
			refreshAcomp.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroAcomp);
			painelBaixo.add(refreshAcomp);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroAcomp.addActionListener(this);
			refreshAcomp.addActionListener(this);
			listaAcomp.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de bebidas
		case 2:
			listaNomes = new ControleBebida(dados).getNomeBebida();
			listaBebida = new JList<String>(listaNomes);
			
			janela = new JFrame("Bebidas");
			
			titulo = new JLabel("Bebida");
			cadastroBebida = new JButton("Cadastro");
			refreshBebida = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(160, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaBebida.setBounds(13, 50, 350, 200);
			listaBebida.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBebida.setLayoutOrientation(JList.VERTICAL);
			listaBebida.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaBebida);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroBebida.setBounds(80, 265, 100, 30);
			refreshBebida.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroBebida);
			painelBaixo.add(refreshBebida);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroBebida.addActionListener(this);
			refreshBebida.addActionListener(this);
			listaBebida.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de burgers
		case 3:
			listaNomes = new ControleBurger(dados).getNomeBurger();
			listaBurger = new JList<String>(listaNomes);
			
			janela = new JFrame("Burgers");

			titulo = new JLabel("Burger");
			cadastroBurger = new JButton("Cadastro");
			refreshBurger = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(160, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaBurger.setBounds(13, 50, 350, 200);
			listaBurger.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBurger.setLayoutOrientation(JList.VERTICAL);
			listaBurger.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaBurger);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroBurger.setBounds(80, 265, 100, 30);
			refreshBurger.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroBurger);
			painelBaixo.add(refreshBurger);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroBurger.addActionListener(this);
			refreshBurger.addActionListener(this);
			listaBurger.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de combos
		case 4:
			listaNomes = new ControleCombo(dados).getNomeCombo();
			listaCombo = new JList<String>(listaNomes);
			
			janela = new JFrame("Combos");
			
			titulo = new JLabel("Combo");
			cadastroCombo = new JButton("Cadastro");
			refreshCombo = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(160, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaCombo.setBounds(13, 50, 350, 200);
			listaCombo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCombo.setLayoutOrientation(JList.VERTICAL);
			listaCombo.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaCombo);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroCombo.setBounds(80, 265, 100, 30);
			refreshCombo.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroCombo);
			painelBaixo.add(refreshCombo);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroCombo.addActionListener(this);
			refreshCombo.addActionListener(this);
			listaCombo.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de infantis
		case 5:
			listaNomes = new ControleInfantil(dados).getNomeInfantil();
			listaInfantil = new JList<String>(listaNomes);
			
			janela = new JFrame("Infantil");
			
			titulo = new JLabel("Infantil");
			cadastroInf = new JButton("Cadastro");
			refreshInf = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(160, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaInfantil.setBounds(13, 50, 350, 200);
			listaInfantil.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaInfantil.setLayoutOrientation(JList.VERTICAL);
			listaInfantil.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaInfantil);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroInf.setBounds(80, 265, 100, 30);
			refreshInf.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroInf);
			painelBaixo.add(refreshInf);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroInf.addActionListener(this);
			refreshInf.addActionListener(this);
			listaInfantil.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de personalizaveis
		case 6:
			listaNomes = new ControlePersonalizavel(dados).getNomePers();
			listaPers = new JList<String>(listaNomes);
			
			janela = new JFrame("Personalizavel");

			titulo = new JLabel("Personalizavel");
			cadastroPers = new JButton("Cadastro");
			refreshPers = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaPers.setBounds(13, 50, 350, 200);
			listaPers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPers.setLayoutOrientation(JList.VERTICAL);
			listaPers.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaPers);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroPers.setBounds(80, 265, 100, 30);
			refreshPers.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroPers);
			painelBaixo.add(refreshPers);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroPers.addActionListener(this);
			refreshPers.addActionListener(this);
			listaPers.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de promocoes
		case 7:
			listaNomes = new ControlePromocao(dados).getNomePromo();
			listaPromo = new JList<String>(listaNomes);
			
			janela = new JFrame("Promoções");
			
			titulo = new JLabel("Promoção");
			cadastroPromo = new JButton("Cadastro");
			refreshPromo = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaPromo.setBounds(13, 50, 350, 200);
			listaPromo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPromo.setLayoutOrientation(JList.VERTICAL);
			listaPromo.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaPromo);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroPromo.setBounds(80, 265, 100, 30);
			refreshPromo.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroPromo);
			painelBaixo.add(refreshPromo);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroPromo.addActionListener(this);
			refreshPromo.addActionListener(this);
			listaPromo.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de sobremesas
		case 8:
			listaNomes = new ControleSobremesa(dados).getNomeSobre();
			listaSobre = new JList<String>(listaNomes);
			
			janela = new JFrame("Sobremesas");
			
			titulo = new JLabel("Sobremesa");
			cadastroSobre = new JButton("Cadastro");
			refreshSobre = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 10, 150, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaSobre.setBounds(13, 50, 350, 200);
			listaSobre.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaSobre.setLayoutOrientation(JList.VERTICAL);
			listaSobre.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaSobre);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroSobre.setBounds(80, 265, 100, 30);
			refreshSobre.setBounds(210, 265, 100, 30);
			
			painelCima = new JPanel();
			painelLista = new JPanel();
			painelBaixo = new JPanel();
			painelCima.setSize(390, 50);
			painelLista.setSize(365, 200);
			painelBaixo.setSize(390, 100);
			janela.add(painelCima);
			janela.add(painelLista);
			janela.add(painelBaixo);
			painelCima.setLocation(0, 0);
			painelLista.setLocation(5, 50);
			painelBaixo.setLocation(0, 250);
			
			painelCima.setLayout(null);
			painelLista.setLayout(new GridLayout(1, 1));
			painelBaixo.setLayout(null);
			
			painelCima.add(titulo);
			painelLista.add(scroll);
			painelBaixo.add(cadastroSobre);
			painelBaixo.add(refreshSobre);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroSobre.addActionListener(this);
			refreshSobre.addActionListener(this);
			listaSobre.addListSelectionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
//Cadastrar novo produto
		
	//Cadastro de novo acompanhamento
		if(src==cadastroAcomp) {
			new TelaAddProduto().inserirEditar(1, dados, this);
			
	//Cadastro de nova bebida
		} else if(src==cadastroBebida) {
			new TelaAddProduto().inserirEditar(2, dados, this);
			
	//Cadastro de novo burger
		} else if(src==cadastroBurger) {
			new TelaAddProduto().inserirEditar(3, dados, this);
			
	//Cadastro de novo combo
		} else if(src==cadastroCombo) {
			new TelaAddProduto().inserirEditar(4, dados, this);
			
	//Cadastro de novo infantil
		} else if(src==cadastroInf) {
			new TelaAddProduto().inserirEditar(5, dados, this);
			
	//Cadastro de novo personalizavel
		} else if(src==cadastroPers) {
			new TelaAddProduto().inserirEditar(6, dados, this);
			
	//Cadastro de nova promocao
		} else if(src==cadastroPromo) {
			new TelaAddProduto().inserirEditar(7, dados, this);
			
	//Cadastro de nova sobremesa
		} else if(src==cadastroSobre) {
			new TelaAddProduto().inserirEditar(8, dados, this);
				
//Atualizar a tela
	
		//Atualizar a lista de acompanhamentos
			} else if(src==refreshAcomp) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 1);
				
		//Atualizar a lista de bebidas
			} else if(src==refreshBebida) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 2);
				
		//Atualizar a lista de burgers
			} else if(src==refreshBurger) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 3);
				
		//Atualizar a lista de combos
			} else if(src==refreshCombo) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 4);
				
		//Atualizar a lista de infantis
			} else if(src==refreshInf) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 5);
				
		//Atualizar a lista de personalizaveis
			} else if(src==refreshPers) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 6);
				
		//Atualizar a lista de promocoes
			} else if(src==refreshPromo) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 7);
				
		//Atualizar a lista de sobremesas
			} else if(src==refreshSobre) {
				janela.dispose();
				new TelaProduto().mostrarDados(dados, 8);
				
			}
			
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
//Detalhar, editar valor ou excluir produto
		
	//Detalhar, editar ou excluir acompanhamento
		if(e.getValueIsAdjusting() && src == listaAcomp) {
			new TelaDetalheProduto().mostrarDados(1, dados, this, listaAcomp.getSelectedIndex());
			
		}
			
	//Detalhar, editar ou excluir bebida
		if(e.getValueIsAdjusting() && src == listaBebida) {
			new TelaDetalheProduto().mostrarDados(2, dados, this, listaBebida.getSelectedIndex());

		}	
		
	//Detalhar, editar ou excluir burger
		if(e.getValueIsAdjusting() && src == listaBurger) {
			new TelaDetalheProduto().mostrarDados(3, dados, this, listaBurger.getSelectedIndex());
			
		}
		
	//Detalhar, editar ou excluir combo
		if(e.getValueIsAdjusting() && src == listaCombo) {
			new TelaDetalheProduto().mostrarDados(4, dados, this, listaCombo.getSelectedIndex());
			
		}
		
	//Detalhar, editar ou excluir infantil
		if(e.getValueIsAdjusting() && src == listaInfantil) {
			new TelaDetalheProduto().mostrarDados(5, dados, this, listaInfantil.getSelectedIndex());
			
		}
		
	//Detalhar, editar ou excluir personalizavel
		if(e.getValueIsAdjusting() && src == listaPers) {
			new TelaDetalheProduto().mostrarDados(6, dados, this, listaPers.getSelectedIndex());
			
		}
		
	//Detalhar, editar ou excluir promocao
		if(e.getValueIsAdjusting() && src == listaPromo) {
			new TelaDetalheProduto().mostrarDados(7, dados, this, listaPromo.getSelectedIndex());
			
		}
		
	//Detalhar, editar ou excluir sobremesa
		if(e.getValueIsAdjusting() && src == listaSobre) {
			new TelaDetalheProduto().mostrarDados(8, dados, this, listaSobre.getSelectedIndex());
			
		}
	}

}
