package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.Funcionario;
import modeloPessoaELoja.Telefone;

public class TelaDetalhePessoa implements ActionListener {
	
	private JFrame janela;
	private JPanel painel;
	
	private JLabel titulo;
	private JLabel nome;
	private JLabel numId;
	private JLabel cpf;
	private JLabel rg;
	private JLabel numTel;
	private JLabel ddd;
	private JLabel numero;
	private JLabel endereco;
	private JLabel cep;
	private JLabel estado;
	private JLabel cidade;
	private JLabel bairro;
	private JLabel rua;
	private JLabel numCasa;
	private JLabel aviso;
	
	private JTextField nomeField;
	private JTextField idField;
	private JTextField cpfField;
	private JTextField rgField;
	private JTextField dddField;
	private JTextField numField;
	private JTextField cepField;
	private JTextField estadoField;
	private JTextField cidadeField;
	private JTextField bairroField;
	private JTextField ruaField;
	private JTextField casaField;
	
	private JList<String> nomeList;
	private JList<String> idList;
	private JList<String> cpfList;
	private JList<String> rgList;
	private JList<String> numTelList;
	private JList<String> endList;
	
	private JButton addCliente;
	private JButton addFunc;
	private JButton refresh;

	public void inserirEditar(int opcao, ControleDado dados, TelaPessoa telaPessoa, int pos) {
		
		switch(opcao) {
		case 1:
			
		//Criando elementos
			janela = new JFrame("Cadastrar Cliente");
			titulo = new JLabel("Novo Cliente");
			nome = new JLabel("Nome");
			cpf = new JLabel("CPF");
			numTel = new JLabel("Telefone");
			ddd = new JLabel("DDD");
			numero = new JLabel("Numero");
			nomeField = new JTextField(30);
			cpfField = new JTextField(30);
			dddField = new JTextField(30);
			numField = new JTextField(30);
			addCliente = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
			nome.setBounds(13, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cpf.setBounds(13, 120, 50, 30);
			cpf.setHorizontalTextPosition(JLabel.LEFT);
			cpf.setHorizontalAlignment(JLabel.LEFT);
			cpf.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			numTel.setBounds(13, 190, 70, 30);
			numTel.setHorizontalTextPosition(JLabel.LEFT);
			numTel.setHorizontalAlignment(JLabel.LEFT);
			numTel.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ddd.setBounds(13, 220, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			ddd.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numero.setBounds(13, 250, 50, 30);
			numero.setHorizontalTextPosition(JLabel.CENTER);
			numero.setHorizontalAlignment(JLabel.CENTER);
			numero.setFont(new Font("Formato", Font.ITALIC, 12));
			
		//Deifinindo JTextFields
			nomeField.setBounds(73, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			cpfField.setBounds(73, 150, 250, 30);
			cpfField.setHorizontalAlignment(JTextField.CENTER);
			
			dddField.setBounds(73, 220, 250, 30);
			dddField.setHorizontalAlignment(JTextField.CENTER);
			
			numField.setBounds(73, 250, 250, 30);
			numField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addCliente.setBounds(140, 300, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeField);
			painel.add(cpf);
			painel.add(cpfField);
			painel.add(numTel);
			painel.add(ddd);
			painel.add(dddField);
			painel.add(numero);
			painel.add(numField);
			painel.add(addCliente);
			
		//Definindo janela
			janela.setSize(390, 400);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
		
		//Adicionando ActionListener
			addCliente.addActionListener(this);
			
			break;
			
		case 2:
			
		//Criando elementos
			janela = new JFrame("Cadastrar Funcionario");
			titulo = new JLabel("Novo Funcionário");
			nome = new JLabel("Nome");
			cpf = new JLabel("CPF");
			rg = new JLabel("RG");
			numTel = new JLabel("Telefone");
			ddd = new JLabel("DDD");
			numero = new JLabel("Numero");
			endereco = new JLabel("Endereço");
			cep = new JLabel("CEP");
			estado = new JLabel("Estado");
			cidade = new JLabel("Cidade");
			bairro = new JLabel("Bairro");
			rua = new JLabel("Rua");
			numCasa = new JLabel("Casa");
			
			nomeField = new JTextField(30);
			cpfField = new JTextField(30);
			rgField = new JTextField(30);
			dddField = new JTextField(30);
			numField = new JTextField(30);
			cepField = new JTextField(30);
			estadoField = new JTextField(30);
			cidadeField = new JTextField(30);
			bairroField = new JTextField(30);
			ruaField = new JTextField(30);
			casaField = new JTextField(30);
			
			addFunc = new JButton("Adicionar");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 15, 190, 30);
			
			nome.setBounds(13, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.LEFT);
			nome.setHorizontalAlignment(JLabel.LEFT);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cpf.setBounds(13, 120, 50, 30);
			cpf.setHorizontalTextPosition(JLabel.LEFT);
			cpf.setHorizontalAlignment(JLabel.LEFT);
			cpf.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			rg.setBounds(13, 190, 50, 30);
			rg.setHorizontalTextPosition(JLabel.LEFT);
			rg.setHorizontalAlignment(JLabel.LEFT);
			rg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			numTel.setBounds(13, 260, 70, 30);
			numTel.setHorizontalTextPosition(JLabel.LEFT);
			numTel.setHorizontalAlignment(JLabel.LEFT);
			numTel.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ddd.setBounds(13, 290, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			ddd.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numero.setBounds(13, 320, 50, 30);
			numero.setHorizontalTextPosition(JLabel.CENTER);
			numero.setHorizontalAlignment(JLabel.CENTER);
			numero.setFont(new Font("Formato", Font.ITALIC, 12));
			
			endereco.setBounds(13, 360, 70, 30);
			endereco.setHorizontalTextPosition(JLabel.LEFT);
			endereco.setHorizontalAlignment(JLabel.LEFT);
			endereco.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cep.setBounds(13, 390, 50, 30);
			cep.setHorizontalTextPosition(JLabel.CENTER);
			cep.setHorizontalAlignment(JLabel.CENTER);
			cep.setFont(new Font("Formato", Font.ITALIC, 12));
			
			estado.setBounds(13, 420, 50, 30);
			estado.setHorizontalTextPosition(JLabel.CENTER);
			estado.setHorizontalAlignment(JLabel.CENTER);
			estado.setFont(new Font("Formato", Font.ITALIC, 12));
			
			cidade.setBounds(13, 450, 50, 30);
			cidade.setHorizontalTextPosition(JLabel.CENTER);
			cidade.setHorizontalAlignment(JLabel.CENTER);
			cidade.setFont(new Font("Formato", Font.ITALIC, 12));
			
			bairro.setBounds(13, 480, 50, 30);
			bairro.setHorizontalTextPosition(JLabel.CENTER);
			bairro.setHorizontalAlignment(JLabel.CENTER);
			bairro.setFont(new Font("Formato", Font.ITALIC, 12));
			
			rua.setBounds(13, 510, 50, 30);
			rua.setHorizontalTextPosition(JLabel.CENTER);
			rua.setHorizontalAlignment(JLabel.CENTER);
			rua.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numCasa.setBounds(13, 540, 50, 30);
			numCasa.setHorizontalTextPosition(JLabel.CENTER);
			numCasa.setHorizontalAlignment(JLabel.CENTER);
			numCasa.setFont(new Font("Formato", Font.ITALIC, 12));
			
		//Deifinindo JTextFields
			nomeField.setBounds(73, 80, 250, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
			cpfField.setBounds(73, 150, 250, 30);
			cpfField.setHorizontalAlignment(JTextField.CENTER);
			
			rgField.setBounds(73, 220, 250, 30);
			rgField.setHorizontalAlignment(JTextField.CENTER);
			
			dddField.setBounds(73, 290, 250, 30);
			dddField.setHorizontalAlignment(JTextField.CENTER);
			
			numField.setBounds(73, 320, 250, 30);
			numField.setHorizontalAlignment(JTextField.CENTER);
			
			cepField.setBounds(73, 390, 250, 30);
			cepField.setHorizontalAlignment(JTextField.CENTER);
			
			estadoField.setBounds(73, 420, 250, 30);
			estadoField.setHorizontalAlignment(JTextField.CENTER);
			
			cidadeField.setBounds(73, 450, 250, 30);
			cidadeField.setHorizontalAlignment(JTextField.CENTER);
			
			bairroField.setBounds(73, 480, 250, 30);
			bairroField.setHorizontalAlignment(JTextField.CENTER);
			
			ruaField.setBounds(73, 510, 250, 30);
			ruaField.setHorizontalAlignment(JTextField.CENTER);
			
			casaField.setBounds(73, 540, 250, 30);
			casaField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			addFunc.setBounds(140, 590, 100, 30);
			
		//Adicionando JLabels
			painel.add(titulo);
			painel.add(nome);
			painel.add(cpf);
			painel.add(rg);
			painel.add(numTel);
			painel.add(ddd);
			painel.add(numero);
			painel.add(endereco);
			painel.add(cep);
			painel.add(estado);
			painel.add(cidade);
			painel.add(bairro);
			painel.add(rua);
			painel.add(numCasa);
			painel.add(casaField);
			
		//Adicionando JTextFields
			painel.add(nomeField);
			painel.add(cpfField);
			painel.add(rgField);
			painel.add(dddField);
			painel.add(numField);
			painel.add(cepField);
			painel.add(estadoField);
			painel.add(cidadeField);
			painel.add(bairroField);
			painel.add(ruaField);
			painel.add(casaField);
			
		//Adicionando JButton
			painel.add(addFunc);
			
		//Definindo janela
			janela.setSize(390, 690);
			janela.setLocation(765, 200);
			janela.setResizable(false);
			janela.setVisible(true);
		
		//Adicionando ActionListener
			addFunc.addActionListener(this);
			
			break;
			
		case 3:
			
			
			break;
			
		case 4:
			
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Novo cliente
		if(src==addCliente) {
			
			int campoLimpo = 0;
			
			Cliente cliente;
			Telefone telCliente;
			
			String nome = nomeField.getText();
			String cpf = cpfField.getText();
			String dddString = dddField.getText();
			String numString = numField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(cpfField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar CPF.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(dddField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar DDD.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(numField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar número de telefone.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Cliente
			} else {
				int telDdd = Integer.parseInt(dddString);
				int telNum = Integer.parseInt(numString);
				int id;
				
				id = 1001;
				id = id + TelaMenu.dados.getDadoPessoa().getQtdClientes();
				
				telCliente = new Telefone(telDdd, telNum);
				cliente = new Cliente(nome, id, cpf, telCliente);
				TelaMenu.dados.getDadoPessoa().inserirEditarCliente(cliente, TelaMenu.dados.getDadoPessoa().getQtdClientes());
				
				janela.dispose();
			}
			
	//Novo Funcionario
		} else if(src==addFunc) {
			
			Funcionario funcionario;
			Telefone telFunc;
			Endereco endFunc;
			
			String nome = nomeField.getText();
			String cpf = cpfField.getText();
			String rgString = rgField.getText();
			String dddString = dddField.getText();
			String numString = numField.getText();
			String cepString = cepField.getText();
			String estado = estadoField.getText();
			String cidade = cidadeField.getText();
			String bairro = bairroField.getText();
			String rua = ruaField.getText();
			String casaString = casaField.getText();
			
		//Verificacao de campos nulos
			if(nomeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(cpfField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar CPF.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(rgField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar RG.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(dddField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar DDD.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(numField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar número de telefone.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(cepField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar CEP.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(estadoField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar estado.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(cidadeField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar cidade.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(bairroField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar bairro.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(ruaField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar rua.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			} else if(casaField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não houve tentativa de adicionar número da casa.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			
		//Criacao de novo Funcionario
			} else {
				int numRg = Integer.parseInt(rgString);
				int telDdd = Integer.parseInt(dddString);
				int telNum = Integer.parseInt(numString);
				int cep = Integer.parseInt(cepString);
				int casa = Integer.parseInt(casaString);
				int id;
				
				id = 5001 + TelaMenu.dados.getDadoPessoa().getQtdFuncionarios();
				
				telFunc = new Telefone(telDdd, telNum);
				endFunc = new Endereco(cep, estado, cidade, bairro, rua, casa);
				funcionario = new Funcionario(nome, id, cpf, numRg, telFunc, endFunc);
				TelaMenu.dados.getDadoPessoa().inserirEditarFuncionario(funcionario, TelaMenu.dados.getDadoPessoa().getQtdFuncionarios());
				
				janela.dispose();
			}
			
		}
		
	}

}
