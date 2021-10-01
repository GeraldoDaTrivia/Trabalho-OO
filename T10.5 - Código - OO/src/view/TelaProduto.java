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

public class TelaProduto implements ActionListener, ListSelectionListener{
	
	private JFrame janela;
	private JPanel painel;
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

	public void mostrarDados(ControleDado dados, int opcao) {
		this.dados = dados;
		
		switch(opcao) {
	//Mostrar lista de acompanhamentos
		case 1:
			listaNomes = new ControleAcompanhamento(dados).getNomeAcomp();
			listaAcomp = new JList<String>(listaNomes);
			
			janela = new JFrame("Acompanhamentos");
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Acompanhamento");
			cadastroAcomp = new JButton("Cadastro");
			refreshAcomp = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaAcomp.setBounds(13, 50, 350, 200);
			listaAcomp.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAcomp.setLayoutOrientation(JList.VERTICAL);
			listaAcomp.setVisibleRowCount(10);
			
			cadastroAcomp.setBounds(80, 265, 100, 30);
			refreshAcomp.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaAcomp);
			painel.add(cadastroAcomp);
			painel.add(refreshAcomp);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Bebida");
			cadastroBebida = new JButton("Cadastro");
			refreshBebida = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaBebida.setBounds(13, 50, 350, 200);
			listaBebida.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBebida.setLayoutOrientation(JList.VERTICAL);
			listaBebida.setVisibleRowCount(10);
			
			cadastroBebida.setBounds(80, 265, 100, 30);
			refreshBebida.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaBebida);
			painel.add(cadastroBebida);
			painel.add(refreshBebida);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Burger");
			cadastroBurger = new JButton("Cadastro");
			refreshBurger = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaBurger.setBounds(13, 50, 350, 200);
			listaBurger.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBurger.setLayoutOrientation(JList.VERTICAL);
			listaBurger.setVisibleRowCount(10);
			
			cadastroBurger.setBounds(80, 265, 100, 30);
			refreshBurger.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaBurger);
			painel.add(cadastroBurger);
			painel.add(refreshBurger);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Combo");
			cadastroCombo = new JButton("Cadastro");
			refreshCombo = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaCombo.setBounds(13, 50, 350, 200);
			listaCombo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCombo.setLayoutOrientation(JList.VERTICAL);
			listaCombo.setVisibleRowCount(10);
			
			cadastroCombo.setBounds(80, 265, 100, 30);
			refreshCombo.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaCombo);
			painel.add(cadastroCombo);
			painel.add(refreshCombo);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Infantil");
			cadastroInf = new JButton("Cadastro");
			refreshInf = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaInfantil.setBounds(13, 50, 350, 200);
			listaInfantil.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaInfantil.setLayoutOrientation(JList.VERTICAL);
			listaInfantil.setVisibleRowCount(10);
			
			cadastroInf.setBounds(80, 265, 100, 30);
			refreshInf.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaInfantil);
			painel.add(cadastroInf);
			painel.add(refreshInf);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Personalizavel");
			cadastroPers = new JButton("Cadastro");
			refreshPers = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaPers.setBounds(13, 50, 350, 200);
			listaPers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPers.setLayoutOrientation(JList.VERTICAL);
			listaPers.setVisibleRowCount(10);
			
			cadastroPers.setBounds(80, 265, 100, 30);
			refreshPers.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaPers);
			painel.add(cadastroPers);
			painel.add(refreshPers);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Promoção");
			cadastroPromo = new JButton("Cadastro");
			refreshPromo = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaPromo.setBounds(13, 50, 350, 200);
			listaPromo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPromo.setLayoutOrientation(JList.VERTICAL);
			listaPromo.setVisibleRowCount(10);
			
			cadastroPromo.setBounds(80, 265, 100, 30);
			refreshPromo.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaPromo);
			painel.add(cadastroPromo);
			painel.add(refreshPromo);
			
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
			painel = new JPanel();
			janela.add(painel);
			
			titulo = new JLabel("Sobremesa");
			cadastroSobre = new JButton("Cadastro");
			refreshSobre = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaSobre.setBounds(13, 50, 350, 200);
			listaSobre.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaSobre.setLayoutOrientation(JList.VERTICAL);
			listaSobre.setVisibleRowCount(10);
			
			cadastroSobre.setBounds(80, 265, 100, 30);
			refreshSobre.setBounds(210, 265, 100, 30);
			
			painel.setLayout(null);
			
			painel.add(titulo);
			painel.add(listaSobre);
			painel.add(cadastroSobre);
			painel.add(refreshSobre);
			
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
		
		//Cadastro de novo acompanhamento
			if(src==cadastroAcomp) {
				//new TelaDetalheProduto.inserirEditar(1, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de nova bebida
			} else if(src==cadastroBebida) {
				//new TelaDetalheProduto.inserirEditar(2, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de novo burger
			} else if(src==cadastroBurger) {
				//new TelaDetalheProduto.inserirEditar(3, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Cadastro de novo combo
			} else if(src==cadastroCombo) {
				//new TelaDetalheProduto.inserirEditar(4, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de novo infantil
			} else if(src==cadastroInf) {
				//new TelaDetalheProduto.inserirEditar(5, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de novo personalizavel
			} else if(src==cadastroPers) {
				//new TelaDetalheProduto.inserirEditar(6, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de nova promocao
			} else if(src==cadastroPromo) {
				//new TelaDetalheProduto.inserirEditar(7, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Cadastro de nova sobremesa
			} else if(src==cadastroSobre) {
				//new TelaDetalheProduto.inserirEditar(8, dados, this, 0);
				JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
						+ "relacionadas ao cadastro.", null, JOptionPane.INFORMATION_MESSAGE);
				
		//Atualizar a lista de acompanhamentos
			} else if(src==refreshAcomp) {
				listaAcomp.setListData(new ControleAcompanhamento(dados).getNomeAcomp());
				listaAcomp.updateUI();
				
		//Atualizar a lista de bebidas
			} else if(src==refreshBebida) {
				listaBebida.setListData(new ControleBebida(dados).getNomeBebida());
				listaBebida.updateUI();
				
		//Atualizar a lista de burgers
			} else if(src==refreshBebida) {
				listaBurger.setListData(new ControleBurger(dados).getNomeBurger());
				listaBurger.updateUI();
				
		//Atualizar a lista de combos
			} else if(src==refreshBebida) {
				listaCombo.setListData(new ControleCombo(dados).getNomeCombo());
				listaCombo.updateUI();
				
		//Atualizar a lista de infantis
			} else if(src==refreshBebida) {
				listaInfantil.setListData(new ControleInfantil(dados).getNomeInfantil());
				listaInfantil.updateUI();
				
		//Atualizar a lista de personalizaveis
			} else if(src==refreshBebida) {
				listaPers.setListData(new ControlePersonalizavel(dados).getNomePers());
				listaPers.updateUI();
				
		//Atualizar a lista de promocoes
			} else if(src==refreshBebida) {
				listaPromo.setListData(new ControlePromocao(dados).getNomePromo());
				listaPromo.updateUI();
				
		//Atualizar a lista de sobremesas
			} else if(src==refreshBebida) {
				listaSobre.setListData(new ControleSobremesa(dados).getNomeSobre());
				listaSobre.updateUI();
				
			}
			
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
	//Editar ou excluir acompanhamento
		if(e.getValueIsAdjusting() && src == listaAcomp) {
			//new TelaDetalheProduto().inserirEditar(9, dados, this, listaAcomp.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
			
	//Editar ou excluir bebida
		if(e.getValueIsAdjusting() && src == listaBebida) {
			//new TelaDetalheProduto().inserirEditar(10, dados, this, listaBebida.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}	
		
	//Editar ou excluir burger
		if(e.getValueIsAdjusting() && src == listaBurger) {
			//new TelaDetalheProduto().inserirEditar(11, dados, this, listaBurger.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	//Editar ou excluir combo
		if(e.getValueIsAdjusting() && src == listaCombo) {
			//new TelaDetalheProduto().inserirEditar(12, dados, this, listaCombo.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	//Editar ou excluir infantil
		if(e.getValueIsAdjusting() && src == listaInfantil) {
			//new TelaDetalheProduto().inserirEditar(13, dados, this, listaInfantil.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	//Editar ou excluir personalizavel
		if(e.getValueIsAdjusting() && src == listaPers) {
			//new TelaDetalheProduto().inserirEditar(14, dados, this, listaPers.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	//Editar ou excluir promocao
		if(e.getValueIsAdjusting() && src == listaPromo) {
			//new TelaDetalheProduto().inserirEditar(15, dados, this, listaPromo.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	//Editar ou excluir sobremesa
		if(e.getValueIsAdjusting() && src == listaSobre) {
			//new TelaDetalheProduto().inserirEditar(16, dados, this, listaSobre.getSelectedIndex());
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas à edição e exclusão.", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
	}

}
