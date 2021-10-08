package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controleConjuntos.ControleDado;
import controlePessoas.ControleCliente;
import controlePessoas.ControleFuncionario;

public class TelaDetalhePessoa implements ActionListener, ListSelectionListener {

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
	
	private String[] listaNomes = new String[50];
	private String[] listaId = new String[50];
	private String[] listaCpf = new String[50];
	private String[] listaRg = new String[50];
	private String[] listaNumTel = new String[50];
	private String[] listaEnd = new String[50];
	
	private JList<String> nomeListCli;
	private JList<String> idListCli;
	private JList<String> cpfListCli;
	private JList<String> numTelListCli;
	private JList<String> nomeListFunc;
	private JList<String> idListFunc;
	private JList<String> cpfListFunc;
	private JList<String> rgListFunc;
	private JList<String> numTelListFunc;
	private JList<String> endListFunc;
	
	private JButton refreshCli;
	private JButton refreshFunc;
	private JButton excluirCli;
	private JButton excluirFunc;
	
	private TelaPessoa pessoa;
	private int index;

	public void mostrarDados(int opcao, ControleDado dados, TelaPessoa telaPessoa, int selectedIndex) {
		
		pessoa = telaPessoa;
		index = selectedIndex;
		
		switch(opcao) {
		
	//Detalhes cliente
		case 1:
			
		//Criando elementos
			janela = new JFrame("Detalhes Cliente");
			
			titulo = new JLabel("Dados do Cliente");
			nome = new JLabel("Nome");
			numId = new JLabel("ID");
			cpf = new JLabel("CPF");
			numTel = new JLabel("Telefone");
			ddd = new JLabel("DDD");
			numero = new JLabel("Número");
			aviso = new JLabel("*clique no campo que quiser editar");
			
			listaNomes[0]= new ControleCliente(TelaMenu.dados).getNome(selectedIndex);
			listaId[0] = new ControleCliente(TelaMenu.dados).getOneStringId(selectedIndex);
			listaCpf[0] = new ControleCliente(TelaMenu.dados).getCpf(selectedIndex);
			listaNumTel[0] = new ControleCliente(TelaMenu.dados).getNumTel(selectedIndex).toStringDdd();
			listaNumTel[1] = new ControleCliente(TelaMenu.dados).getNumTel(selectedIndex).toStringNum();
			
			nomeListCli = new JList<String>(listaNomes);
			idListCli = new JList<String>(listaId);
			cpfListCli = new JList<String>(listaCpf);
			numTelListCli = new JList<String>(listaNumTel);
			
			refreshCli = new JButton("Refresh");
			excluirCli = new JButton("Excluir");
			
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
			
			numId.setBounds(163, 110, 50, 30);
			numId.setHorizontalTextPosition(JLabel.CENTER);
			numId.setHorizontalAlignment(JLabel.CENTER);
			numId.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cpf.setBounds(163, 170, 50, 30);
			cpf.setHorizontalTextPosition(JLabel.CENTER);
			cpf.setHorizontalAlignment(JLabel.CENTER);
			cpf.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			numTel.setBounds(153, 230, 70, 30);
			numTel.setHorizontalTextPosition(JLabel.CENTER);
			numTel.setHorizontalAlignment(JLabel.CENTER);
			numTel.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ddd.setBounds(3, 254, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			ddd.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numero.setBounds(3, 272, 50, 30);
			numero.setHorizontalTextPosition(JLabel.CENTER);
			numero.setHorizontalAlignment(JLabel.CENTER);
			numero.setFont(new Font("Formato", Font.ITALIC, 12));
			
			aviso.setBounds(150, 305, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
		//Definindo JLists
			nomeListCli.setBounds(63, 80, 260, 20);
			nomeListCli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeListCli.setLayoutOrientation(JList.VERTICAL);
			
			idListCli.setBounds(63, 140, 260, 20);
			idListCli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			idListCli.setLayoutOrientation(JList.VERTICAL);
			
			cpfListCli.setBounds(63, 200, 260, 20);
			cpfListCli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			cpfListCli.setLayoutOrientation(JList.VERTICAL);
			
			numTelListCli.setBounds(63, 260, 260, 40);
			numTelListCli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			numTelListCli.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirCli.setBounds(63, 350, 100, 30);
			refreshCli.setBounds(223, 350, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeListCli);
			painel.add(numId);
			painel.add(idListCli);
			painel.add(cpf);
			painel.add(cpfListCli);
			painel.add(numTel);
			painel.add(ddd);
			painel.add(numero);
			painel.add(numTelListCli);
			painel.add(aviso);
			painel.add(refreshCli);
			painel.add(excluirCli);
			
		//Definindo janela
			janela.setSize(390, 450);
			janela.setLocation(765, 350);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			nomeListCli.addListSelectionListener(this);
			idListCli.addListSelectionListener(this);
			cpfListCli.addListSelectionListener(this);
			numTelListCli.addListSelectionListener(this);
			refreshCli.addActionListener(this);
			excluirCli.addActionListener(this);
			
			break;
			
	//Detalhes funcionario
		case 2:
			
		//Criando elementos
			janela = new JFrame("Detalhes Funcionario");
			
			titulo = new JLabel("Dados do Funcionário");
			nome = new JLabel("Nome");
			numId = new JLabel("ID");
			cpf = new JLabel("CPF");
			rg = new JLabel("RG");
			numTel = new JLabel("Telefone");
			ddd = new JLabel("DDD");
			numero = new JLabel("Número");
			endereco = new JLabel("Endereço");
			cep = new JLabel("CEP");
			estado = new JLabel("Estado");
			cidade = new JLabel("Cidade");
			bairro = new JLabel("Bairro");
			rua = new JLabel("Rua");
			numCasa = new JLabel("Casa");
			aviso = new JLabel("*clique no campo que quiser editar");
			
			listaNomes[0]= new ControleFuncionario(TelaMenu.dados).getNome(selectedIndex);
			listaId[0] = new ControleFuncionario(TelaMenu.dados).getOneStringId(selectedIndex);
			listaCpf[0] = new ControleFuncionario(TelaMenu.dados).getCpf(selectedIndex);
			listaRg[0] = new ControleFuncionario(TelaMenu.dados).getOneStringRg(selectedIndex);
			listaNumTel[0] = new ControleFuncionario(TelaMenu.dados).getNumTel(selectedIndex).toStringDdd();
			listaNumTel[1] = new ControleFuncionario(TelaMenu.dados).getNumTel(selectedIndex).toStringNum();
			listaEnd[0] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).toStringCep();
			listaEnd[1] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).getEstado();
			listaEnd[2] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).getCidade();
			listaEnd[3] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).getBairro();
			listaEnd[4] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).getRua();
			listaEnd[5] = new ControleFuncionario(TelaMenu.dados).getEndereco(selectedIndex).toStringNumCasa();
			
			nomeListFunc = new JList<String>(listaNomes);
			idListFunc = new JList<String>(listaId);
			cpfListFunc = new JList<String>(listaCpf);
			rgListFunc = new JList<String>(listaRg);
			numTelListFunc = new JList<String>(listaNumTel);
			endListFunc = new JList<String>(listaEnd);
			
			refreshFunc = new JButton("Refresh");
			excluirFunc = new JButton("Excluir");
			
		//Definindo painel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabels
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(85, 15, 220, 30);
			
			nome.setBounds(163, 50, 50, 30);
			nome.setHorizontalTextPosition(JLabel.CENTER);
			nome.setHorizontalAlignment(JLabel.CENTER);
			nome.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			numId.setBounds(163, 110, 50, 30);
			numId.setHorizontalTextPosition(JLabel.CENTER);
			numId.setHorizontalAlignment(JLabel.CENTER);
			numId.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cpf.setBounds(163, 170, 50, 30);
			cpf.setHorizontalTextPosition(JLabel.CENTER);
			cpf.setHorizontalAlignment(JLabel.CENTER);
			cpf.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			rg.setBounds(163, 230, 50, 30);
			rg.setHorizontalTextPosition(JLabel.CENTER);
			rg.setHorizontalAlignment(JLabel.CENTER);
			rg.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			numTel.setBounds(153, 290, 70, 30);
			numTel.setHorizontalTextPosition(JLabel.CENTER);
			numTel.setHorizontalAlignment(JLabel.CENTER);
			numTel.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			ddd.setBounds(3, 314, 50, 30);
			ddd.setHorizontalTextPosition(JLabel.CENTER);
			ddd.setHorizontalAlignment(JLabel.CENTER);
			ddd.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numero.setBounds(3, 332, 50, 30);
			numero.setHorizontalTextPosition(JLabel.CENTER);
			numero.setHorizontalAlignment(JLabel.CENTER);
			numero.setFont(new Font("Formato", Font.ITALIC, 12));
			
			endereco.setBounds(153, 370, 70, 30);
			endereco.setHorizontalTextPosition(JLabel.CENTER);
			endereco.setHorizontalAlignment(JLabel.CENTER);
			endereco.setFont(new Font("Subtitulo", Font.BOLD, 15));
			
			cep.setBounds(3, 394, 50, 30);
			cep.setHorizontalTextPosition(JLabel.CENTER);
			cep.setHorizontalAlignment(JLabel.CENTER);
			cep.setFont(new Font("Formato", Font.ITALIC, 12));
			
			estado.setBounds(3, 412, 50, 30);
			estado.setHorizontalTextPosition(JLabel.CENTER);
			estado.setHorizontalAlignment(JLabel.CENTER);
			estado.setFont(new Font("Formato", Font.ITALIC, 12));
			
			cidade.setBounds(3, 430, 50, 30);
			cidade.setHorizontalTextPosition(JLabel.CENTER);
			cidade.setHorizontalAlignment(JLabel.CENTER);
			cidade.setFont(new Font("Formato", Font.ITALIC, 12));
			
			bairro.setBounds(3, 448, 50, 30);
			bairro.setHorizontalTextPosition(JLabel.CENTER);
			bairro.setHorizontalAlignment(JLabel.CENTER);
			bairro.setFont(new Font("Formato", Font.ITALIC, 12));
			
			rua.setBounds(3, 466, 50, 30);
			rua.setHorizontalTextPosition(JLabel.CENTER);
			rua.setHorizontalAlignment(JLabel.CENTER);
			rua.setFont(new Font("Formato", Font.ITALIC, 12));
			
			numCasa.setBounds(3, 484, 50, 30);
			numCasa.setHorizontalTextPosition(JLabel.CENTER);
			numCasa.setHorizontalAlignment(JLabel.CENTER);
			numCasa.setFont(new Font("Formato", Font.ITALIC, 12));
			
			aviso.setBounds(150, 512, 200, 15);
			aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
			
		//Definindo JLists
			nomeListFunc.setBounds(63, 80, 260, 20);
			nomeListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			nomeListFunc.setLayoutOrientation(JList.VERTICAL);
			
			idListFunc.setBounds(63, 140, 260, 20);
			idListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			idListFunc.setLayoutOrientation(JList.VERTICAL);
			
			cpfListFunc.setBounds(63, 200, 260, 20);
			cpfListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			cpfListFunc.setLayoutOrientation(JList.VERTICAL);
			
			rgListFunc.setBounds(63, 260, 260, 20);
			rgListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			rgListFunc.setLayoutOrientation(JList.VERTICAL);
			
			numTelListFunc.setBounds(63, 320, 260, 40);
			numTelListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			numTelListFunc.setLayoutOrientation(JList.VERTICAL);
			
			endListFunc.setBounds(63, 400, 260, 108);
			endListFunc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			endListFunc.setLayoutOrientation(JList.VERTICAL);
			
		//Definindo JButtons
			excluirFunc.setBounds(63, 562, 100, 30);
			refreshFunc.setBounds(223, 562, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(nome);
			painel.add(nomeListFunc);
			painel.add(numId);
			painel.add(idListFunc);
			painel.add(cpf);
			painel.add(cpfListFunc);
			painel.add(rg);
			painel.add(rgListFunc);
			painel.add(numTel);
			painel.add(ddd);
			painel.add(numero);
			painel.add(numTelListFunc);
			painel.add(endereco);
			painel.add(cep);
			painel.add(estado);
			painel.add(cidade);
			painel.add(bairro);
			painel.add(rua);
			painel.add(numCasa);
			painel.add(endListFunc);
			painel.add(aviso);
			painel.add(refreshFunc);
			painel.add(excluirFunc);
			
		//Definindo janela
			janela.setSize(390, 662);
			janela.setLocation(765, 300);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando Listeners
			nomeListFunc.addListSelectionListener(this);
			idListFunc.addListSelectionListener(this);
			cpfListFunc.addListSelectionListener(this);
			rgListFunc.addListSelectionListener(this);
			numTelListFunc.addListSelectionListener(this);
			endListFunc.addListSelectionListener(this);
			refreshFunc.addActionListener(this);
			excluirFunc.addActionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

//Refresh tela ou Excluir pessoa selecionada
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Refresh tela
		if(src==refreshCli) {
			janela.dispose();
			new TelaDetalhePessoa().mostrarDados(1, TelaMenu.dados, pessoa, index);
		} else if(src==refreshFunc) {
			janela.dispose();
			new TelaDetalhePessoa().mostrarDados(2, TelaMenu.dados, pessoa, index);
		
		}
		
	//Excluir pessoa selecionada
		
		//Excluir cliente
		if(src==excluirCli) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "cliente ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoPessoa().excluirCliente(TelaMenu.dados.getDadoPessoa().getOneCliente(index), index);
				janela.dispose();
			}
			
		//Excluir funcionario
		} else if(src==excluirFunc) {
			int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este\n"
					+ "funcionário ?", "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);
			if(confirmar==JOptionPane.YES_OPTION) {
				TelaMenu.dados.getDadoPessoa().excluirFuncionario(TelaMenu.dados.getDadoPessoa().getOneFunc(index), index);
				janela.dispose();
			}
		}
		
	}

//Editar Pessoa Selecionada
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
	//Editar Cliente
		if(e.getValueIsAdjusting() && src == nomeListCli) {
			new TelaEditarPessoa().editarDados(1, TelaMenu.dados, index);
			
		} else if(e.getValueIsAdjusting() && src == idListCli) {
			new TelaEditarPessoa().editarDados(2, TelaMenu.dados, index);
			
		} else if(e.getValueIsAdjusting() && src == cpfListCli) {
			new TelaEditarPessoa().editarDados(3, TelaMenu.dados, index);
			
		} else if(e.getValueIsAdjusting() && src == numTelListCli) {
			new TelaEditarPessoa().editarDados(4, TelaMenu.dados, index);
			
		}
		
	//Editar Funcionario
		if(e.getValueIsAdjusting() && src == nomeListFunc) {
			new TelaEditarPessoa().editarDados(5, TelaMenu.dados, index);
				
		} else if(e.getValueIsAdjusting() && src == idListFunc) {
			new TelaEditarPessoa().editarDados(6, TelaMenu.dados, index);	
			
		} else if(e.getValueIsAdjusting() && src == cpfListFunc) {
			new TelaEditarPessoa().editarDados(7, TelaMenu.dados, index);	
			
		} else if(e.getValueIsAdjusting() && src == rgListFunc) {
			new TelaEditarPessoa().editarDados(8, TelaMenu.dados, index);
			
		} else if(e.getValueIsAdjusting() && src == numTelListFunc) {
			new TelaEditarPessoa().editarDados(9, TelaMenu.dados, index);	
			
		} else if(e.getValueIsAdjusting() && src == endListFunc) {
			new TelaEditarPessoa().editarDados(10, TelaMenu.dados, index);
			
		}
		
	}

}
