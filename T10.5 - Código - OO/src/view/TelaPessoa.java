package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controleConjuntos.ControleDado;
import controlePessoas.*;

public class TelaPessoa implements ActionListener, ListSelectionListener{

	private JFrame janela;
	private JPanel painelCima;
	private JPanel painelLista;
	private JPanel painelBaixo;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroFunc;
	private JButton refreshFunc;
	private ControleDado dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncCadastrados;
	private String[] listaNomes = new String[50];
	private JScrollPane scroll;
	
	public void mostrarDados(ControleDado dado, int opcao) {
		dados = dado;
		
		switch(opcao) {
	//Mostrar lista de clientes cadastrados
		case 1:
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(85, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaClientesCadastrados.setBounds(13, 50, 350, 200);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listaClientesCadastrados.setLayoutOrientation(JList.VERTICAL);
			listaClientesCadastrados.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaClientesCadastrados);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroCliente.setBounds(80, 265, 100, 30);
			refreshCliente.setBounds(205, 265, 100, 30);
			
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
			painelBaixo.add(cadastroCliente);
			painelBaixo.add(refreshCliente);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);
			
			break;
			
	//Mostrar lista de funcionarios cadastrados
		case 2:
			listaNomes = new ControleFuncionario(dados).getNomeFuncionario();
			listaFuncCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Funcionarios");
			titulo = new JLabel("Funcionarios Cadastrados");
			cadastroFunc = new JButton("Cadastrar");
			refreshFunc = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 10, 330, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaFuncCadastrados.setBounds(13, 50, 350, 200);
			listaFuncCadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listaFuncCadastrados.setLayoutOrientation(JList.VERTICAL);
			listaFuncCadastrados.setVisibleRowCount(5);
			
			scroll = new JScrollPane(listaFuncCadastrados);
			scroll.setPreferredSize(new Dimension(200, 80));
			
			cadastroFunc.setBounds(80, 265, 100, 30);
			refreshFunc.setBounds(205, 265, 100, 30);
			
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
			painelBaixo.add(cadastroFunc);
			painelBaixo.add(refreshFunc);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroFunc.addActionListener(this);
			refreshFunc.addActionListener(this);
			listaFuncCadastrados.addListSelectionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Cadastro de novo cliente
		if(src==cadastroCliente) {
			new TelaAddPessoa().inserirEditar(1, dados, this);
			
	//Cadastro de novo funcionario
		} else if(src==cadastroFunc) {
			new TelaAddPessoa().inserirEditar(2, dados, this);
			
	//Atualizar a lista de nomes de clientes
		} else if(src==refreshCliente) {
			janela.dispose();
			new TelaPessoa().mostrarDados(dados, 1);
			
	//Atualizar a lista de nomes de funcionarios
		} else if(src==refreshFunc) {
			janela.dispose();
			new TelaPessoa().mostrarDados(dados, 2);
		}
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
	//Editar ou excluir cliente
		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalhePessoa().mostrarDados(1, dados, this, listaClientesCadastrados.getSelectedIndex());
			
		}
		
	//Editar ou excluir funcionario
		if(e.getValueIsAdjusting() && src == listaFuncCadastrados) {
			new TelaDetalhePessoa().mostrarDados(2, dados, this, listaFuncCadastrados.getSelectedIndex());
			
		}
		
	}

}
