package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleConjuntos.ControleDado;
import modeloAbstratas.Produto;
import modeloProdutos.Acompanhamento;
import modeloProdutos.Bebida;
import modeloProdutos.Burger;
import modeloProdutos.Combo;
import modeloProdutos.Infantil;
import modeloProdutos.Personalizavel;
import modeloProdutos.Promocao;
import modeloProdutos.Sobremesa;

/**Classe para fornecer uma interface gráfica quando for realizar a edição do valor de um objeto 
 * do tipo {@link Acompanhamento}, {@link Bebida}, {@link Burger}, {@link Combo}, {@link Infantil}, 
 * {@link Personalizavel}, {@link Promocao} ou {@link Sobremesa}.
 * 
 * @see TelaAddProduto
 * @see TelaCardapio
 * @see TelaDetalheProduto
 * @see TelaProduto
 * @see TelaMenu
 * 
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Out 2021
 */
public class TelaEditarValor implements ActionListener {

	private JFrame janela;
	private JPanel painel;
	private JLabel titulo;
	private JTextField field;
	private JButton concluirAcomp;
	private JButton concluirBeb;
	private JButton concluirBurg;
	private JButton concluirCombo;
	private JButton concluirInf;
	private JButton concluirPers;
	private JButton concluirPromo;
	private JButton concluirSobre;
	
	private int index;
	
	/**Método para editar os dados selecionados do objeto do tipo {@link Produto}
	 * 
	 * @param opcao - Dado selecionado para edição
	 * @param dados - Dados dos objetos do programa
	 * @param telaDetalheProduto - Dados recebido pela {@link TelaDetalheProduto}
	 * @param selectedIndex - Posição da pessoa escolhida na JList
	 */
	public void editarValor(int opcao, ControleDado dados, TelaDetalheProduto telaDetalheProduto, int selectedIndex) {
		
		index = selectedIndex;
		
		switch(opcao) {
		
	//Editar valor acompanhamento
		case 1:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Acompanhamento");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirAcomp = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirAcomp.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirAcomp);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirAcomp.addActionListener(this);
			
			break;
			
	//Editar valor bebida
		case 2:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Bebida");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirBeb = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirBeb.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirBeb);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirBeb.addActionListener(this);
			
			break;
			
	//Editar valor burger
		case 3:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Burger");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirBurg = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirBurg.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirBurg);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirBurg.addActionListener(this);
			
			break;
			
	//Editar valor combo
		case 4:
		
		//Adicionando Componentes
			janela = new JFrame("Editar Combo");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirCombo = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirCombo.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirCombo);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirCombo.addActionListener(this);
			
			break;
			
	//Editar valor infantil
		case 5:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Infantil");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirInf = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirInf.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirInf);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirInf.addActionListener(this);
			
			break;
			
	//Editar valor personalizavel
		case 6:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Personalizavel");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirPers = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirPers.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirPers);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirPers.addActionListener(this);
			
			break;
			
	//Editar valor promocao
		case 7:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Promocao");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirPromo = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirPromo.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirPromo);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirPromo.addActionListener(this);
			
			break;
			
	//Editar valor sobremesa
		case 8:
			
		//Adicionando Componentes
			janela = new JFrame("Editar Sobremesa");
			titulo = new JLabel("Editar Valor");
			field = new JTextField(30);
			concluirSobre = new JButton("Concluir");
			
		//Definindo JPanel
			painel = new JPanel();
			janela.add(painel);
			painel.setLayout(null);
			
		//Definindo JLabel
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(130, 15, 190, 30);
			
		//Definindo JTextField
			field.setBounds(43, 70, 290, 30);
			field.setHorizontalAlignment(JTextField.CENTER);
			
		//Definindo JButton
			concluirSobre.setBounds(140, 120, 100, 30);
			
		//Adicionando componentes
			painel.add(titulo);
			painel.add(field);
			painel.add(concluirSobre);
			
		//Definindo janela
			janela.setSize(390, 200);
			janela.setLocation(765, 400);
			janela.setResizable(false);
			janela.setVisible(true);
			
		//Adicionando ActionListener
			concluirSobre.addActionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}

	/**Método para capturar eventos, validação dos dados inseridos 
	 * e realizar a edição dos dados do programa.
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Acompanhamento
		if(src==concluirAcomp) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneAcompanhamento(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Bebida
		} else if(src==concluirBeb) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneBebida(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
		
	//Burger
		} else if(src==concluirBurg) {
			String valorString = field.getText();	
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneBurger(index).setValor(valor);
				
				janela.dispose();
				
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Combo
		} else if(src==concluirCombo) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneCombo(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Infantil
		} else if(src==concluirInf) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneInfantil(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Personalizavel
		} else if(src==concluirPers) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOnePers(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Promocao
		} else if(src==concluirPromo) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOnePromo(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
	//Sobremesa
		} else if(src==concluirSobre) {
			String valorString = field.getText();
			
			if(valorString.matches("(\\d+\\.\\d+)")) {
				Double valor = Double.parseDouble(valorString);
				
				TelaMenu.dados.getDadoProduto().getOneSobre(index).setValor(valor);
				
				janela.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "O valor tem formato 'XX.XX', com 'X' sendo números.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
	}

}
