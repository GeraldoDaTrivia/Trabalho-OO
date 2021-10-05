package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controleConjuntos.ControleDado;
import controlePessoas.*;

public class TelaPessoa implements ActionListener, ListSelectionListener{

	private JFrame janela;
	private JPanel panel;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroFunc;
	private JButton refreshFunc;
	private ControleDado dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncCadastrados;
	private String[] listaNomes = new String[50];
	
	public void mostrarDados(ControleDado dado, int opcao) {
		dados = dado;
		
		switch(opcao) {
	//Mostrar dados de clientes cadastrados
		case 1:
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(80, 10, 250, 30);
			titulo.setHorizontalTextPosition(JLabel.CENTER);
			
			listaClientesCadastrados.setBounds(13, 50, 350, 200);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setLayoutOrientation(JList.VERTICAL);
			listaClientesCadastrados.setVisibleRowCount(10);
			
			cadastroCliente.setBounds(80, 265, 100, 30);
			refreshCliente.setBounds(210, 265, 100, 30);
			
			panel = new JPanel();
			janela.add(panel);
			
			panel.setLayout(null);
			
			panel.add(titulo);
			panel.add(listaClientesCadastrados);
			panel.add(cadastroCliente);
			panel.add(refreshCliente);
			
			janela.setSize(390, 350);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);
			
			break;
			
	//Mostrar dados de funcionarios cadastrados
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
			listaFuncCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFuncCadastrados.setLayoutOrientation(JList.VERTICAL);
			listaFuncCadastrados.setVisibleRowCount(10);
			
			cadastroFunc.setBounds(80, 265, 100, 30);
			refreshFunc.setBounds(210, 265, 100, 30);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(listaFuncCadastrados);
			janela.add(cadastroFunc);
			janela.add(refreshFunc);
			
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
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
			
	//Cadastro de novo funcionario
		} else if(src==cadastroFunc) {
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
			
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
			new TelaDetalhePessoa().inserirEditar(3, dados, this, listaClientesCadastrados.getSelectedIndex());
			
		}
		
	//Editar ou excluir funcionario
		if(e.getValueIsAdjusting() && src == listaFuncCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, listaFuncCadastrados.getSelectedIndex());
			
		}
		
	}

}
