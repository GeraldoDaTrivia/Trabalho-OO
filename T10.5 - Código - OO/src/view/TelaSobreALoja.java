package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaSobreALoja implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JPanel painel;
	private JLabel titulo;
	
	private JLabel telefone;
	private JList<String> telLoja;
	private String[] numero = new String[2];
	
	private JLabel horario;
	private JList<String> horaLoja;
	private String[] hora = new String[2];
	
	private JLabel endereco;
	private JList<String> endLoja;
	private String[] end = new String[6];
	
	private JLabel aviso;
	private JButton refresh;
	
	public TelaSobreALoja() {
		
	//Definindo JLists
		numero[0] = TelaMenu.dados.getDadoLoja().getTelLoja().toStringDdd();
		numero[1] = TelaMenu.dados.getDadoLoja().getTelLoja().toStringNum();
		telLoja = new JList<String>(numero);
		
		hora[0] = TelaMenu.dados.getDadoLoja().getHorFunc().toString();
		hora[1] = TelaMenu.dados.getDadoLoja().getHorFunc().getDiasAbertos();
		horaLoja = new JList<String>(hora);
		
		end[0] = TelaMenu.dados.getDadoLoja().getEndLoja().toStringCep();
		end[1] = TelaMenu.dados.getDadoLoja().getEndLoja().getEstado();
		end[2] = TelaMenu.dados.getDadoLoja().getEndLoja().getCidade();
		end[3] = TelaMenu.dados.getDadoLoja().getEndLoja().getBairro();
		end[4] = TelaMenu.dados.getDadoLoja().getEndLoja().getRua();
		end[5] = TelaMenu.dados.getDadoLoja().getEndLoja().toStringNumCasa();
		endLoja = new JList<String>(end);
		
	//Criando elementos
		janela = new JFrame("Sobre a Loja");
		titulo = new JLabel("Detalhes da Loja");
		telefone = new JLabel("Telefone");
		horario = new JLabel("Horário de Funcionamento");
		endereco = new JLabel("Endereço");
		aviso = new JLabel("*clique no campo que quiser para editar");
		refresh = new JButton("Refresh");
		
	//Definindo titulo
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(110, 10, 200, 30);
		titulo.setHorizontalTextPosition(JLabel.CENTER);
		
	//Definindo telefone
		telefone.setBounds(13, 50, 100, 30);
		telefone.setFont(new Font("Subtitulo", Font.BOLD, 14));
		telLoja.setBounds(63, 75, 300, 40);
		telLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		telLoja.setLayoutOrientation(JList.VERTICAL);
		JLabel ddd = new JLabel("DDD");
		ddd.setBounds(13, 74, 50, 20);
		JLabel num = new JLabel("Numero");
		num.setBounds(13, 92, 50, 20);
		
	//Definindo horario
		horario.setBounds(13, 120, 200, 30);
		horario.setFont(new Font("Subtitulo", Font.BOLD, 14));
		horaLoja.setBounds(63, 145, 300, 40);
		horaLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		horaLoja.setLayoutOrientation(JList.VERTICAL);
		JLabel horaF = new JLabel("Horario");
		horaF.setBounds(13, 144, 50, 20);
		JLabel diasF = new JLabel("Dias");
		diasF.setBounds(13, 162, 50, 20);
		
	//Definindo endereco
		endereco.setBounds(13, 190, 100, 30);
		endereco.setFont(new Font("Subtitulo", Font.BOLD, 14));
		endLoja.setBounds(63, 215, 300, 110);
		endLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		endLoja.setLayoutOrientation(JList.VERTICAL);
		JLabel cep = new JLabel("CEP");
		cep.setBounds(13, 214, 50, 20);
		JLabel estado = new JLabel("Estado");
		estado.setBounds(13, 232, 50, 20);
		JLabel cidade = new JLabel("Cidade");
		cidade.setBounds(13, 250, 50, 20);
		JLabel bairro = new JLabel("Bairro");
		bairro.setBounds(13, 268, 50, 20);
		JLabel rua = new JLabel("Rua");
		rua.setBounds(13, 286, 50, 20);
		JLabel casa = new JLabel("Casa");
		casa.setBounds(13, 304, 50, 20);
		
	//Definindo aviso
		aviso.setFont(new Font("Aviso", Font.ITALIC, 11));
		aviso.setBounds(165, 340, 200, 15);
		
	//Definindo botao
		refresh.setBounds(263, 365, 100, 30);
		
	//Definindo painel
		painel = new JPanel();
		janela.add(painel);
		
	//Definindo Layout
		painel.setLayout(null);
		
	//Adicionando componentes
		painel.add(titulo);
		painel.add(telefone);
		painel.add(telLoja);
		painel.add(ddd);
		painel.add(num);
		painel.add(horario);
		painel.add(horaLoja);
		painel.add(horaF);
		painel.add(diasF);
		painel.add(endereco);
		painel.add(endLoja);
		painel.add(cep);
		painel.add(estado);
		painel.add(cidade);
		painel.add(bairro);
		painel.add(rua);
		painel.add(casa);
		painel.add(aviso);
		painel.add(refresh);
		
	//Definindo janela
		janela.setSize(390, 450);
		janela.setLocation(765, 400);
		janela.setResizable(false);
		janela.setVisible(true);
		
	//Adicionando ActionListener
		refresh.addActionListener(this);
		telLoja.addListSelectionListener(this);
		horaLoja.addListSelectionListener(this);
		endLoja.addListSelectionListener(this);
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == telLoja) {
			new TelaEditarLoja().editarLoja(1, TelaMenu.dados, this);
		} else if(e.getValueIsAdjusting() && src == horaLoja) {
			new TelaEditarLoja().editarLoja(2, TelaMenu.dados, this);
		} else if(e.getValueIsAdjusting() && src == endLoja) {
			new TelaEditarLoja().editarLoja(3, TelaMenu.dados, this);
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==refresh) {
			janela.dispose();
			new TelaSobreALoja();
		}
		
	}

}
