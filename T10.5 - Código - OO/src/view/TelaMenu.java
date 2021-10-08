package view;

import controleConjuntos.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**Classe principal. Inicializa a interface gráfica do programa.
 * 
 * @see TelaAddPessoa
 * @see TelaAddProduto
 * @see TelaAddVenda
 * @see TelaCardapio
 * @see TelaDetalhePessoa
 * @see TelaDetalheProduto
 * @see TelaEditarLoja
 * @see TelaEditarPessoa
 * @see TelaEditarValor
 * @see TelaPessoa
 * @see TelaProduto
 * @see TelaSobreALoja
 * @see TelaVenda
 * 
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Out 2021
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Restaurante");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cardapio = new JButton("Cardapio");
	private static JButton vendas = new JButton("Vendas");
	private static JButton clientes = new JButton("Clientes");
	private static JButton funcionarios = new JButton("Funcionarios");
	private static JButton loja = new JButton("Sobre a Loja");
	
	/**Variável principal que guarda todos os dados do programa.
	 * 
	 */
	public static ControleDado dados = new ControleDado();
	
	
	/**
	 * Construtor da interface de menu
	 */
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 25));
		titulo.setBounds(95, 15, 190, 30);
		cardapio.setBounds(135, 70, 110, 30);
		vendas.setBounds(135, 115, 110, 30);
		clientes.setBounds(135, 160, 110, 30);
		funcionarios.setBounds(135, 205, 110, 30);
		loja.setBounds(135, 250, 110, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cardapio);
		janela.add(vendas);
		janela.add(clientes);
		janela.add(funcionarios);
		janela.add(loja);
		
		janela.setSize(390, 350);
		janela.setLocation(765, 400);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	/**Inicializa a interface gráfica principal do programa.
	 * 
	 * @param args - argumentos
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cardapio.addActionListener(menu);
		vendas.addActionListener(menu);
		clientes.addActionListener(menu);
		funcionarios.addActionListener(menu);
		loja.addActionListener(menu);
	}
	
	/**Método para capturar eventos e gerar as interfaces gráficas de acordo.
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==cardapio) {
			new TelaCardapio();
			
		} else if(src==vendas) {
			new TelaVenda();
			
		} else if(src==clientes) {
			new TelaPessoa().mostrarDados(dados, 1);
			
		} else if(src==funcionarios) {
			new TelaPessoa().mostrarDados(dados, 2);
			
		} else if(src==loja) {
			new TelaSobreALoja();
			
		}
	}
	
}
