package view;

import controleConjuntos.ControleDado;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaEditarLoja implements ActionListener {

	private JFrame janela;
	private JPanel painel;
	private JLabel titulo;
	
	private JLabel ddd;
	private JLabel numTel;
	
	private JLabel horaAbrir;
	private JLabel horaFechar;
	private JLabel diasAbertos;
	
	private JLabel cep;
	private JLabel estado;
	private JLabel cidade;
	private JLabel bairro;
	private JLabel rua;
	private JLabel numCasa;
	
	private JTextField dddField;
	private JTextField numField;
	
	private JTextField abrirField;
	private JTextField fecharField;
	private JTextField diasField;
	
	private JTextField cepField;
	private JTextField estadoField;
	private JTextField cidadeField;
	private JTextField bairroField;
	private JTextField ruaField;
	private JTextField casaField;
	
	private JLabel aviso;
	private JButton concluirTelefone;
	private JButton concluirHorario;
	private JButton concluirEndereco;
	

	public void editarLoja(int opcao, ControleDado dados, TelaSobreALoja telaSobreALoja) {
		
		switch(opcao) {
	//Editar telefone da loja
		case 1:
		
		//Criando elementos
			janela = new JFrame("Editar Loja");
			titulo = new JLabel("Editar Telefone");
			ddd = new JLabel("DDD");
			numTel = new JLabel("Número");
			dddField = new JTextField(30);
			numField = new JTextField(30);
			aviso = new JLabel("*digite '0' no campo que não quiser editar");
			concluirTelefone = new JButton("Concluir Edição");
			
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
			concluirTelefone.setBounds(210, 165, 150, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(ddd);
			painel.add(dddField);
			painel.add(numTel);
			painel.add(numField);
			painel.add(aviso);
			painel.add(concluirTelefone);
			
		//Definindo janela
			janela.setSize(390, 250);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirTelefone.addActionListener(this);
			
			break;
			
	//Editar horario de funcionamento da loja
		case 2:

		//Criando elementos
			janela = new JFrame("Editar Loja");
			titulo = new JLabel("Editar Funcionamento");
			horaAbrir = new JLabel("Hora de Abrir");
			horaFechar = new JLabel("Hora de Fechar");
			diasAbertos = new JLabel("Dias Abertos");
			abrirField = new JTextField(30);
			fecharField = new JTextField(30);
			diasField = new JTextField(30);
			aviso = new JLabel("*digite '0' quando não quiser editar um campo");
			concluirHorario = new JButton("Concluir Edição");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(95, 15, 250, 30);
			horaAbrir.setBounds(13, 50, 100, 30);
			horaAbrir.setHorizontalTextPosition(JLabel.CENTER);
			horaAbrir.setHorizontalAlignment(JLabel.CENTER);
			horaFechar.setBounds(13, 100, 100, 30);
			horaFechar.setHorizontalTextPosition(JLabel.CENTER);
			horaFechar.setHorizontalAlignment(JLabel.CENTER);
			diasAbertos.setBounds(13, 150, 100, 30);
			diasAbertos.setHorizontalTextPosition(JLabel.CENTER);
			diasAbertos.setHorizontalAlignment(JLabel.CENTER);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			aviso.setBounds(135, 190, 270, 15);
			
		//Definindo JTextFields
			abrirField.setBounds(113, 50, 250, 30);
			abrirField.setHorizontalAlignment(JTextField.CENTER);
			fecharField.setBounds(113, 100, 250, 30);
			fecharField.setHorizontalAlignment(JTextField.CENTER);
			diasField.setBounds(113, 150, 250, 30);
			diasField.setHorizontalAlignment(JTextField.CENTER);
			
		//Informando formatos
			JLabel formatoHora = new JLabel("Formato: (00:00 - 24:00)");
			formatoHora.setBounds(220, 80, 150, 20);
			formatoHora.setFont(new Font("Formato", Font.ITALIC, 13));
			
		//Definindo botao
			concluirHorario.setBounds(210, 215, 150, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(horaAbrir);
			painel.add(abrirField);
			painel.add(formatoHora);
			painel.add(horaFechar);
			painel.add(fecharField);
			painel.add(diasAbertos);
			painel.add(diasField);
			painel.add(aviso);
			painel.add(concluirHorario);
			
		//Definindo janela
			janela.setSize(390, 300);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirHorario.addActionListener(this);
				
			break;
			
	//Editar endereco da loja
		case 3:

		//Criando elementos
			janela = new JFrame("Editar Loja");
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
			concluirEndereco = new JButton("Concluir Edição");
			
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
			concluirEndereco.setBounds(210, 365, 150, 30);
			
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
			painel.add(concluirEndereco);
			
		//Definindo janela
			janela.setSize(390, 450);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirEndereco.addActionListener(this);
				
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
		
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Criar novo telefone
		if(src==concluirTelefone) {
			
			Telefone telLoja;
			int ddd;
			int num;
			String novoDdd = dddField.getText();
			String novoNum = numField.getText();
			
			if(novoDdd.equals("0")) {
				novoDdd = TelaMenu.dados.getDadoLoja().getTelLoja().toStringDdd();
			}
			if(novoNum.equals("0")) {
				novoNum = TelaMenu.dados.getDadoLoja().getTelLoja().toStringNum();
			}
			
			if(novoDdd.matches("[0-9]+") && novoNum.matches("[0-9]+")) {
				
				ddd = Integer.parseInt(novoDdd);
				num = Integer.parseInt(novoNum);
				
				telLoja = new Telefone(ddd, num);
				TelaMenu.dados.getDadoLoja().setTelLoja(telLoja);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O telefone só pode ser composto por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Criar novo horario
		} else if(src==concluirHorario) {
			
			HoraFuncionamento horaLoja;
			String abrir = abrirField.getText();
			String fechar = fecharField.getText();
			String dias = diasField.getText();
			
			if(abrir.equals("0")) {
				abrir = TelaMenu.dados.getDadoLoja().getHorFunc().getHorAbrir();
			}
			if(fechar.equals("0")) {
				fechar = TelaMenu.dados.getDadoLoja().getHorFunc().getHorFechar();
			}
			if(dias.equals("0")) {
				dias = TelaMenu.dados.getDadoLoja().getHorFunc().getDiasAbertos();
			}
			
			horaLoja = new HoraFuncionamento(abrir, fechar, dias);
			TelaMenu.dados.getDadoLoja().setHorFunc(horaLoja);
			
			janela.dispose();
			
	//Criar novo endereco
		} else if(src==concluirEndereco) {
			
			Endereco endLoja;
			String cepString = cepField.getText();
			String estado = estadoField.getText();
			String cidade = cidadeField.getText();
			String bairro = bairroField.getText();
			String rua = ruaField.getText();
			String casaString = casaField.getText();
			int cep;
			int casa;
			
			if(cepString.equals("0")) {
				cepString = TelaMenu.dados.getDadoLoja().getEndLoja().toStringCep();
			}
			if(estado.equals("0")) {
				estado = TelaMenu.dados.getDadoLoja().getEndLoja().getEstado();
			}
			if(cidade.equals("0")) {
				cidade = TelaMenu.dados.getDadoLoja().getEndLoja().getCidade();
			}
			if(bairro.equals("0")) {
				bairro = TelaMenu.dados.getDadoLoja().getEndLoja().getBairro();
			}
			if(rua.equals("0")) {
				rua = TelaMenu.dados.getDadoLoja().getEndLoja().getRua();
			}
			if(casaString.equals("0")) {
				casaString = TelaMenu.dados.getDadoLoja().getEndLoja().toStringNumCasa();
			}
			
			if(cepString.matches("[0-9]+") && casaString.matches("[0-9]+")) {
				
				cep = Integer.parseInt(cepString);
				casa = Integer.parseInt(casaString);
				
				endLoja = new Endereco(cep, estado, cidade, bairro, rua, casa);
				TelaMenu.dados.getDadoLoja().setEndLoja(endLoja);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O CEP e a Casa só podem ser compostos por números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
	}

}
