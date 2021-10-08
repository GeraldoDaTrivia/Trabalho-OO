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
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.Telefone;

public class TelaEditarPessoa implements ActionListener {

	private JFrame janela;
	private JPanel painel;
	
	private JLabel titulo;
	private JLabel ddd;
	private JLabel numTel;
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
	
	private JButton concluirCliNome;
	private JButton concluirCliId;
	private JButton concluirCliCpf;
	private JButton concluirCliTel;
	private JButton concluirFuncNome;
	private JButton concluirFuncId;
	private JButton concluirFuncCpf;
	private JButton concluirFuncRg;
	private JButton concluirFuncTel;
	private JButton concluirFuncEnd;
	
	private int index;
	
	public void editarDados(int opcao, ControleDado dados, int selectedIndex) {
		
		index = selectedIndex;
		
		switch(opcao) {
	
//Editar Cliente
		
	//Editar nome cliente
		case 1:
		
		//Adicionando Componentes
			janela = new JFrame("Editar Cliente");
			titulo = new JLabel("Editar Nome");
			nomeField = new JTextField(30);
			concluirCliNome = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			nomeField.setBounds(43, 70, 290, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirCliNome.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nomeField);
			painel.add(concluirCliNome);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirCliNome.addActionListener(this);
			
			break;
			
	//Editar ID cliente
		case 2:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Cliente");
			titulo = new JLabel("Editar ID");
			idField = new JTextField(30);
			concluirCliId = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(145, 15, 190, 30);
			
		//Definindo JTextField
			idField.setBounds(43, 70, 290, 30);
			idField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirCliId.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(idField);
			painel.add(concluirCliId);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirCliId.addActionListener(this);
			
			break;
			
	//Editar CPF cliente
		case 3:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Cliente");
			titulo = new JLabel("Editar CPF");
			cpfField = new JTextField(30);
			concluirCliCpf = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 15, 190, 30);
			
		//Definindo JTextField
			cpfField.setBounds(43, 70, 290, 30);
			cpfField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirCliCpf.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(cpfField);
			painel.add(concluirCliCpf);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirCliCpf.addActionListener(this);
			
			break;
			
	//Editar telefone cliente
		case 4:
			
		//Criando elementos
			janela = new JFrame("Editar Cliente");
			titulo = new JLabel("Editar Telefone");
			ddd = new JLabel("DDD");
			numTel = new JLabel("Número");
			dddField = new JTextField(30);
			numField = new JTextField(30);
			aviso = new JLabel("*digite '0' no campo que não quiser editar");
			concluirCliTel = new JButton("Concluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 15, 190, 30);
			ddd.setBounds(13, 50, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			numTel.setBounds(13, 100, 50, 30);
			numTel.setHorizontalTextPosition(JLabel.CENTER);
			numTel.setHorizontalAlignment(JLabel.CENTER);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			aviso.setBounds(155, 140, 270, 15);
			
		//Definindo JTextFields
			dddField.setBounds(73, 50, 290, 30);
			dddField.setHorizontalAlignment(JTextField.CENTER);
			numField.setBounds(73, 100, 290, 30);
			numField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			concluirCliTel.setBounds(210, 165, 150, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(ddd);
			painel.add(dddField);
			painel.add(numTel);
			painel.add(numField);
			painel.add(aviso);
			painel.add(concluirCliTel);
			
		//Definindo janela
			janela.setSize(390, 250);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirCliTel.addActionListener(this);
			
			break;
			
	//Editar nome funcionario
		case 5:

		//Adicionando Componentes
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar Nome");
			nomeField = new JTextField(30);
			concluirFuncNome = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			nomeField.setBounds(43, 70, 290, 30);
			nomeField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirFuncNome.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nomeField);
			painel.add(concluirFuncNome);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncNome.addActionListener(this);

			break;
			
	//Editar ID funcionario
		case 6:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar ID");
			idField = new JTextField(30);
			concluirFuncId = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(145, 15, 190, 30);
			
		//Definindo JTextField
			idField.setBounds(43, 70, 290, 30);
			idField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirFuncId.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(idField);
			painel.add(concluirFuncId);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncId.addActionListener(this);
			
			break;
			
	//Editar CPF funcionario
		case 7:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar CPF");
			cpfField = new JTextField(30);
			concluirFuncCpf = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 15, 190, 30);
			
		//Definindo JTextField
			cpfField.setBounds(43, 70, 290, 30);
			cpfField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirFuncCpf.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(cpfField);
			painel.add(concluirFuncCpf);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncCpf.addActionListener(this);
			
			break;
			
	//Editar RG funcionario
		case 8:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar RG");
			rgField = new JTextField(30);
			concluirFuncRg = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 15, 190, 30);
			
		//Definindo JTextField
			rgField.setBounds(43, 70, 290, 30);
			rgField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirFuncRg.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(rgField);
			painel.add(concluirFuncRg);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncRg.addActionListener(this);
			
			break;
			
	//Editar telefone funcionario
		case 9:
			
			//Criando elementos
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar Telefone");
			ddd = new JLabel("DDD");
			numTel = new JLabel("Número");
			dddField = new JTextField(30);
			numField = new JTextField(30);
			aviso = new JLabel("*digite '0' no campo que não quiser editar");
			concluirFuncTel = new JButton("Concluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 15, 190, 30);
			ddd.setBounds(13, 50, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			numTel.setBounds(13, 100, 50, 30);
			numTel.setHorizontalTextPosition(JLabel.CENTER);
			numTel.setHorizontalAlignment(JLabel.CENTER);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			aviso.setBounds(155, 140, 270, 15);
			
		//Definindo JTextFields
			dddField.setBounds(73, 50, 290, 30);
			dddField.setHorizontalAlignment(JTextField.CENTER);
			numField.setBounds(73, 100, 290, 30);
			numField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			concluirFuncTel.setBounds(210, 165, 150, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(ddd);
			painel.add(dddField);
			painel.add(numTel);
			painel.add(numField);
			painel.add(aviso);
			painel.add(concluirFuncTel);
			
		//Definindo janela
			janela.setSize(390, 250);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncTel.addActionListener(this);
			
			break;
			
	//Editar endereco funcionario
		case 10:
			
		//Criando elementos
			janela = new JFrame("Editar Funcionario");
			titulo = new JLabel("Editar Endereço");
			cep = new JLabel("CEP");
			estado = new JLabel("Estado");
			cidade = new JLabel("Cidade");
			bairro = new JLabel("Bairro");
			rua = new JLabel("Rua");
			numCasa = new JLabel("Casa");
			cepField = new JTextField(30);
			estadoField = new JTextField(30);
			cidadeField = new JTextField(30);
			bairroField = new JTextField(30);
			ruaField = new JTextField(30);
			casaField = new JTextField(30);
			aviso = new JLabel("*digite '0' quando não quiser editar um campo");
			concluirFuncEnd = new JButton("Concluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 25));
			titulo.setBounds(100, 15, 200, 30);
			cep.setBounds(13, 50, 100, 30);
			cep.setHorizontalTextPosition(JLabel.CENTER);
			estado.setBounds(13, 100, 50, 30);
			estado.setHorizontalTextPosition(JLabel.CENTER);
			cidade.setBounds(13, 150, 50, 30);
			cidade.setHorizontalTextPosition(JLabel.CENTER);
			bairro.setBounds(13, 200, 50, 30);
			bairro.setHorizontalTextPosition(JLabel.CENTER);
			rua.setBounds(13, 250, 50, 30);
			rua.setHorizontalTextPosition(JLabel.CENTER);
			numCasa.setBounds(13, 300, 50, 30);
			numCasa.setHorizontalTextPosition(JLabel.CENTER);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			aviso.setBounds(135, 340, 270, 15);
			
		//Definindo JTextFields
			cepField.setBounds(73, 50, 290, 30);
			cepField.setHorizontalAlignment(JTextField.CENTER);
			estadoField.setBounds(73, 100, 290, 30);
			estadoField.setHorizontalAlignment(JTextField.CENTER);
			cidadeField.setBounds(73, 150, 290, 30);
			cidadeField.setHorizontalAlignment(JTextField.CENTER);
			bairroField.setBounds(73, 200, 290, 30);
			bairroField.setHorizontalAlignment(JTextField.CENTER);
			ruaField.setBounds(73, 250, 290, 30);
			ruaField.setHorizontalAlignment(JTextField.CENTER);
			casaField.setBounds(73, 300, 290, 30);
			casaField.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo botao
			concluirFuncEnd.setBounds(210, 365, 150, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(cep);
			painel.add(cepField);
			painel.add(estado);
			painel.add(estadoField);
			painel.add(cidade);
			painel.add(cidadeField);
			painel.add(bairro);
			painel.add(bairroField);
			painel.add(rua);
			painel.add(ruaField);
			painel.add(numCasa);
			painel.add(casaField);
			painel.add(aviso);
			painel.add(concluirFuncEnd);
			
		//Definindo janela
			janela.setSize(390, 450);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirFuncEnd.addActionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
//Editar pessoa selecionada
		
		
//Editar cliente
		
	//Editar nome
		if(src==concluirCliNome) {
				
			String nome = nomeField.getText();
			
			TelaMenu.dados.getDadoPessoa().getOneCliente(index).setNome(nome);
			
			janela.dispose();
			
	//Editar ID
		} else if(src==concluirCliId) {
			
			String idString = idField.getText();
			int id;
			
			if(idString.matches("[0-9]+")) {
				
				id = Integer.parseInt(idString);
				TelaMenu.dados.getDadoPessoa().getOneCliente(index).setNumId(id);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O ID só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Editar CPF
		} else if(src==concluirCliCpf) {
			
			String cpf = cpfField.getText();
			
			TelaMenu.dados.getDadoPessoa().getOneCliente(index).setCpf(cpf);
			
			janela.dispose();
			
	//Editar telefone
		} else if(src==concluirCliTel) {
			
			Telefone telCliente;
			int ddd;
			int num;
			String novoDdd = dddField.getText();
			String novoNum = numField.getText();
			
			if(novoDdd.equals("0")) {
				novoDdd = TelaMenu.dados.getDadoPessoa().getOneCliente(index).getNumTel().toStringDdd();
			}
			if(novoNum.equals("0")) {
				novoNum = TelaMenu.dados.getDadoPessoa().getOneCliente(index).getNumTel().toStringNum();
			}
			
			if(novoDdd.matches("[0-9]+") && novoNum.matches("[0-9]+")) {
				
				ddd = Integer.parseInt(novoDdd);
				num = Integer.parseInt(novoNum);
				
				telCliente = new Telefone(ddd, num);
				TelaMenu.dados.getDadoPessoa().getOneCliente(index).setNumTel(telCliente);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O telefone só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}

//Editar funcionario
		
	//Editar nome
		if(src==concluirFuncNome) {
				
			String nome = nomeField.getText();
			
			TelaMenu.dados.getDadoPessoa().getOneFunc(index).setNome(nome);
			
			janela.dispose();	
			
	//Editar ID
		} else if(src==concluirFuncId) {
			
			String idString = idField.getText();
			int id;
			
			if(idString.matches("[0-9]+")) {
				
				id = Integer.parseInt(idString);
				TelaMenu.dados.getDadoPessoa().getOneFunc(index).setNumId(id);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O ID só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Editar CPF
		} else if(src==concluirFuncCpf) {
			
			String cpf = cpfField.getText();
			
			TelaMenu.dados.getDadoPessoa().getOneFunc(index).setCpf(cpf);
			
			janela.dispose();
			
	//Editar RG
		} else if(src==concluirFuncRg) {
			
			String rgString = rgField.getText();
			int rg;
			
			if(rgString.matches("[0-9]+")) {
				
				rg = Integer.parseInt(rgString);
				TelaMenu.dados.getDadoPessoa().getOneFunc(index).setRg(rg);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O ID só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Editar telefone
		} else if(src==concluirFuncTel) {
			
			Telefone telFunc;
			int ddd;
			int num;
			String novoDdd = dddField.getText();
			String novoNum = numField.getText();
			
			if(novoDdd.equals("0")) {
				novoDdd = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getNumTel().toStringDdd();
			}
			if(novoNum.equals("0")) {
				novoNum = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getNumTel().toStringNum();
			}
			
			if(novoDdd.matches("[0-9]+") && novoNum.matches("[0-9]+")) {
				
				ddd = Integer.parseInt(novoDdd);
				num = Integer.parseInt(novoNum);
				
				telFunc = new Telefone(ddd, num);
				TelaMenu.dados.getDadoPessoa().getOneFunc(index).setNumTel(telFunc);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O telefone só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Editar endereco
		} else if(src==concluirFuncEnd) {
			
			Endereco endFunc;
			String cepString = cepField.getText();
			String estado = estadoField.getText();
			String cidade = cidadeField.getText();
			String bairro = bairroField.getText();
			String rua = ruaField.getText();
			String casaString = casaField.getText();
			int cep;
			int casa;
			
			if(cepString.equals("0")) {
				cepString = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().toStringCep();
			}
			if(estado.equals("0")) {
				estado = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().getEstado();
			}
			if(cidade.equals("0")) {
				cidade = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().getCidade();
			}
			if(bairro.equals("0")) {
				bairro = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().getBairro();
			}
			if(rua.equals("0")) {
				rua = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().getRua();
			}
			if(casaString.equals("0")) {
				casaString = TelaMenu.dados.getDadoPessoa().getOneFunc(index).getEndFunc().toStringNumCasa();
			}
			
			if(cepString.matches("[0-9]+") && casaString.matches("[0-9]+")) {
				
				cep = Integer.parseInt(cepString);
				casa = Integer.parseInt(casaString);
				
				endFunc = new Endereco(cep, estado, cidade, bairro, rua, casa);
				TelaMenu.dados.getDadoPessoa().getOneFunc(index).setEndFunc(endFunc);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O CEP e a Casa só podem ser compostos por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
	}
	
}
