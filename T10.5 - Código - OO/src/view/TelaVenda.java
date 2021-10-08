package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modeloConjuntos.Venda;
import modeloPessoaELoja.Cliente;
import modeloPessoaELoja.Funcionario;

/**Classe para fornecer uma interface gráfica quando for mostrar os dados dos objetos 
 * de tipo {@link Venda}.
 * 
 * @see TelaAddVenda
 * @see TelaMenu
 * 
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Out 2021
 */
public class TelaVenda implements ActionListener{

	private JFrame janela;
	private JPanel painel1;
	private JPanel painel2;
	private JTable tabela;
	private String[] colunas = {"Numero", "Cliente", "Funcionario", "Produtos Vendidos", "Valor Total"};
	private JButton addVenda;
	private JButton refresh;
	private static Object[][] dados = new Object[50][5];
	
	private Cliente[] clienteVenda = TelaMenu.dados.getDadoVenda().getClienteVenda();
	private Funcionario[] funcVenda = TelaMenu.dados.getDadoVenda().getFuncVenda();
	private String[] prodVendido = TelaMenu.dados.getDadoVenda().getProdutosVenda();
	private double[] valorTotal = TelaMenu.dados.getDadoVenda().getValorVenda();
	
	private JScrollPane scroll;
	
	public TelaVenda() {
	
	//Definindo dados
		dados[0][0] = 1; dados[0][1] = clienteVenda[0].getNome(); dados[0][2] = funcVenda[0].getNome();
		dados[0][3] = prodVendido[0]; dados[0][4] = valorTotal[0];
		dados[1][0] = 2; dados[1][1] = clienteVenda[1].getNome(); dados[1][2] = funcVenda[1].getNome();
		dados[1][3] = prodVendido[1]; dados[1][4] = valorTotal[1];
		dados[2][0] = 3; dados[2][1] = clienteVenda[2].getNome(); dados[2][2] = funcVenda[2].getNome();
		dados[2][3] = prodVendido[2]; dados[2][4] = valorTotal[2];
		dados[3][0] = 4; dados[3][1] = clienteVenda[3].getNome(); dados[3][2] = funcVenda[3].getNome();
		dados[3][3] = prodVendido[3]; dados[3][4] = valorTotal[3];
		dados[4][0] = 5; dados[4][1] = clienteVenda[4].getNome(); dados[4][2] = funcVenda[4].getNome();
		dados[4][3] = prodVendido[4]; dados[4][4] = valorTotal[4];
		
	//Definindo tabela
		tabela = new JTable(dados, colunas);
		scroll = new JScrollPane(tabela);
		
	//Criando elementos
		janela = new JFrame("Vendas");
		addVenda = new JButton("Adicionar");
		refresh = new JButton("Refresh");
		
	//Definindo painel 1
		painel1 = new JPanel();
		painel1.setLayout(new GridLayout(1, 1));
		painel1.setSize(800, 350);
		janela.add(painel1);
		
	//Definindo painel 2
		painel2 = new JPanel();
		painel2.setLayout(null);
		painel2.setSize(800, 100);
		janela.add(painel2);
		
	//Definindo botoes
		addVenda.setBounds(660, 365, 100, 30);
		refresh.setBounds(540, 365, 100, 30);
		
	//Adicionando componentes
		painel1.add(scroll);
		painel2.add(addVenda);
		painel2.add(refresh);
		
	//Definindo janela
		janela.setSize(800, 450);
		janela.setLocation(565, 400);
		janela.setResizable(false);
		janela.setVisible(true);
		
	//Adicionando ActionListener
		addVenda.addActionListener(this);
		refresh.addActionListener(this);
	}

	/**Método para capturar eventos e realizar as ações necessárias
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==addVenda) {
			new TelaAddVenda();
		} else if(src==refresh) {
			janela.dispose();
			new TelaVenda();
		}
		
	}
	
	/**Adicionar os dados recebidos pela criação de uma nova {@link Venda}.
	 * 
	 */
	public static void addDados() {
			
		dados[(TelaMenu.dados.getDadoVenda().getQtdVendas()-1)][0] = 
				TelaMenu.dados.getDadoVenda().getQtdVendas();
		dados[(TelaMenu.dados.getDadoVenda().getQtdVendas()-1)][1] = 
				TelaMenu.dados.getDadoVenda().getOneVenda((TelaMenu.dados.getDadoVenda().getQtdVendas()-1)).getClienteVenda().getNome();
		dados[(TelaMenu.dados.getDadoVenda().getQtdVendas()-1)][2] = 
				TelaMenu.dados.getDadoVenda().getOneVenda((TelaMenu.dados.getDadoVenda().getQtdVendas()-1)).getFuncVenda().getNome();
		dados[(TelaMenu.dados.getDadoVenda().getQtdVendas()-1)][3] = 
				TelaMenu.dados.getDadoVenda().getOneVenda((TelaMenu.dados.getDadoVenda().getQtdVendas()-1)).getProdVendidos();
		dados[(TelaMenu.dados.getDadoVenda().getQtdVendas()-1)][4] = 
				TelaMenu.dados.getDadoVenda().getOneVenda((TelaMenu.dados.getDadoVenda().getQtdVendas()-1)).getValorTotal();
			
	}
	
}
