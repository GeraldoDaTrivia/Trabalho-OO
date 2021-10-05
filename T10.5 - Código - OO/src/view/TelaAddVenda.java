package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modeloConjuntos.Venda;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;

public class TelaAddVenda implements ActionListener {
	
	private JFrame janela;
	private JPanel painel;
	private JLabel titulo;
	private JLabel cliente;
	private JTextField clienteField;
	private JLabel func;
	private JTextField funcField;
	private JLabel prodVenda;
	private JTextField prodField1;
	private JTextField prodField2;
	private JTextField prodField3;
	private JButton adicionar;
	
	private int erros;
	
		
	public TelaAddVenda() {
		
	//Criando elementos
		janela = new JFrame("Cadastrar Venda");
		painel = new JPanel();
		titulo = new JLabel("Nova Venda");
		cliente = new JLabel("Cliente:");
		func = new JLabel("Funcionário:");
		prodVenda = new JLabel("Produtos:");
		clienteField = new JTextField(30);
		funcField = new JTextField(30);
		prodField1 = new JTextField(30);
		prodField2 = new JTextField(30);
		prodField3 = new JTextField(30);
		adicionar = new JButton("Adicionar");
		
	//Definindo painel
		janela.add(painel);
		painel.setLayout(null);
		
	//Definindo JLabels
		titulo.setFont(new Font("Arial", Font.BOLD, 25));
		titulo.setBounds(115, 15, 190, 30);
		cliente.setBounds(13, 50, 100, 30);
		func.setBounds(13, 100, 100, 30);
		prodVenda.setBounds(13, 150, 100, 30);
		
	//Definindo JTextFields
		clienteField.setBounds(93, 50, 200, 30);
		clienteField.setHorizontalAlignment(JTextField.CENTER);
		funcField.setBounds(93, 100, 200, 30);
		funcField.setHorizontalAlignment(JTextField.CENTER);
		prodField1.setBounds(93, 150, 200, 30);
		prodField1.setHorizontalAlignment(JTextField.CENTER);
		prodField2.setBounds(93, 180, 200, 30);
		prodField2.setHorizontalAlignment(JTextField.CENTER);
		prodField3.setBounds(93, 210, 200, 30);
		prodField3.setHorizontalAlignment(JTextField.CENTER);
		
	//Definindo botao
		adicionar.setBounds(150, 250, 100, 30);
		
	//Adicionando componentes
		painel.add(titulo);
		painel.add(cliente);
		painel.add(clienteField);
		painel.add(func);
		painel.add(funcField);
		painel.add(prodVenda);
		painel.add(prodField1);
		painel.add(prodField2);
		painel.add(prodField3);
		painel.add(adicionar);
		
	//Definindo janela
		janela.setSize(390, 350);
		janela.setLocation(765, 400);
		janela.setResizable(false);
		janela.setVisible(true);
		
	//Adicionando ActionListener
		adicionar.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==adicionar) {
		//Declaracoes
			Cliente cliente = null;
			Funcionario func = null;
			String clienteBusca = clienteField.getText();
			String funcBusca = funcField.getText();
			String prodBusca1 = prodField1.getText();
			String prodBusca2 = prodField2.getText();
			String prodBusca3 = prodField3.getText();
			double valorTotal = 0;
			int clientesIguais = 0;
			int funcIguais = 0;
			int prodIguais1 = 0;
			int prodIguais2 = 0;
			int prodIguais3 = 0;
			int semProduto = 0;
			erros = 0;
			
		//Comparar Clientes
			for(int i = 0; i < TelaMenu.dados.getDadoPessoa().getQtdClientes(); i++) {
				if(clienteBusca.equals(TelaMenu.dados.getDadoPessoa().getOneCliente(i).getNome())) {
					cliente = TelaMenu.dados.getDadoPessoa().getOneCliente(i);
					clientesIguais++;
				}
			}
		
		//Mensagem de falha na busca
			if(clientesIguais==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um cliente com o nome\n"
						+ "igual ao escrito.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			}
			
		//Comparar Funcionarios
			for(int i = 0; i < TelaMenu.dados.getDadoPessoa().getQtdFuncionarios(); i++) {
				if(funcBusca.equals(TelaMenu.dados.getDadoPessoa().getOneFunc(i).getNome())) {
					func = TelaMenu.dados.getDadoPessoa().getOneFunc(i);
					funcIguais++;
				}
			}
			
		//Mensagem de falha na busca
			if(funcIguais==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um funcionário com o nome\n"
						+ "igual ao escrito.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			}
			
		//Comparar Acompanhamentos
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdAcomps(); i++) {
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Bebidas
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBebida(); i++) {
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBebida(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBebida(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBebida(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Burgers
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBurger(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBurger(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBurger(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneBurger(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Combos
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdCombos(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneCombo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneCombo(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneCombo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneCombo(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneCombo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneCombo(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Infantis
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdInfantis(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneInfantil(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneInfantil(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneInfantil(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneInfantil(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneInfantil(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneInfantil(i).getValor();
					prodIguais3++;
					
				}
			}
			
		//Comparar Personalizaveis
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdPers(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOnePers(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePers(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOnePers(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePers(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOnePers(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePers(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Promocoes
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdPromo(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOnePromo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePromo(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOnePromo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePromo(i).getValor();
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOnePromo(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOnePromo(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Comparar Sobremesas
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdSobremesa(); i++){
				
				if(prodBusca1.equals(TelaMenu.dados.getDadoProduto().getOneSobre(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneSobre(i).getValor();
					prodIguais1++;
					
				} else if(prodBusca2.equals(TelaMenu.dados.getDadoProduto().getOneSobre(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneSobre(i).getValor();	
					prodIguais2++;
					
				} else if(prodBusca3.equals(TelaMenu.dados.getDadoProduto().getOneSobre(i).getNome())) {
					valorTotal = valorTotal + TelaMenu.dados.getDadoProduto().getOneSobre(i).getValor();
					prodIguais3++;
					
				}
			}
				
		//Verificar se os campos estao limpos
			if(prodBusca1.equals("") && prodBusca2.equals("") && prodBusca3.equals("")) {
				semProduto = 3;
				prodIguais1++;
				prodIguais2++;
				prodIguais3++;
			} else if(prodBusca1.equals("") && prodBusca2.equals("")) {
				semProduto = 2;
				prodIguais1++;
				prodIguais2++;
			}  else if(prodBusca1.equals("") && prodBusca3.equals("")) {
				semProduto = 2;
				prodIguais1++;
				prodIguais3++;
			}  else if(prodBusca2.equals("") && prodBusca3.equals("")) {
				semProduto = 2;
				prodIguais2++;
				prodIguais3++;
			} else if(prodBusca1.equals("")) {
				semProduto++;
				prodIguais1++;
			} else if(prodBusca2.equals("")) {
				semProduto++;
				prodIguais2++;
			} else if(prodBusca3.equals("")) {
				semProduto++;
				prodIguais3++;
			}
			if(semProduto==3) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar produtos.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			}
				
		//Mensagem de falha na busca
			if(prodIguais1==0 && prodIguais2==0 && prodIguais3==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar produtos com os nomes\n"
						+ "iguais aos escritos nas opções de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais1==0 && prodIguais2==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar produtos com os nomes\n"
						+ "iguais aos escritos nas opções 1 e 2 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais1==0 && prodIguais3==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar produtos com os nomes\n"
						+ "iguais aos escritos nas opções 1 e 3 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais2==0 && prodIguais3==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar produtos com os nomes\n"
						+ "iguais aos escritos nas opções 2 e 3 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais1==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um produto com o nome\n"
						+ "igual ao escrito na opção 1 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais2==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um produto com o nome\n"
						+ "igual ao escrito na opção 2 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			} else if(prodIguais3==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um produto com o nome\n"
						+ "igual ao escrito na opção 3 de produto.", null, JOptionPane.INFORMATION_MESSAGE);
				erros++;
			}
			
		//Verificacao de erros
			if(erros==0) {
				String produtosVendidos = new String();
				
			//Concatenacao dos nomes dos produtos vendidos
				if(prodIguais1==1 && prodIguais2==1 && prodIguais3==1) {
					produtosVendidos = prodBusca1.concat(" - ".concat(prodBusca2.concat(" - ".concat(prodBusca3))));
				} else if(prodIguais1==1 && prodIguais2==1) {
					produtosVendidos = prodBusca1.concat(" - ".concat(prodBusca2));
				} else if(prodIguais1==1 && prodIguais3==1) {
					produtosVendidos = prodBusca1.concat(" - ".concat(prodBusca3));
				} else if(prodIguais2==1 && prodIguais3==1) {
					produtosVendidos = prodBusca2.concat(" - ".concat(prodBusca3));
				} else if(prodIguais1==1) {
					produtosVendidos = prodBusca1;
				} else if(prodIguais2==1) {
					produtosVendidos = prodBusca2;
				} else if(prodIguais3==1) {
					produtosVendidos = prodBusca3;
				}
				
			//Criacao de nova venda
				Venda venda = new Venda(cliente, func, produtosVendidos, valorTotal);
				TelaMenu.dados.getDadoVenda().addOneVenda(venda, TelaMenu.dados.getDadoVenda().getQtdVendas());
				TelaVenda.addDados();
				janela.dispose();
			}
		}
		
	}

}
