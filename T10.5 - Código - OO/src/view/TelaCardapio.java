package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**Classe para fornecer uma interface gráfica quando for selecionar os tipos de produtos.
 * 
 * @see TelaAddProduto
 * @see TelaDetalheProduto
 * @see TelaEditarValor
 * @see TelaProduto
 * @see TelaMenu
 * 
 * @author João Matheus de O. Schmitz
 * @version 2.0
 * @since Out 2021
 */
public class TelaCardapio implements ActionListener {

	private JFrame janela = new JFrame("Cardapio");
	private JPanel painel = new JPanel();
	private JLabel titulo = new JLabel("Cardápio");
	private JButton buscar = new JButton("Buscar");
	private JTextField produtoBusca = new JTextField(30);
	private JButton acomp = new JButton("Acompanhamentos");
	private JButton bebida = new JButton("Bebidas");
	private JButton burger = new JButton("Burgers");
	private JButton combo = new JButton("Combos");
	private JButton infantil = new JButton("Infantis");
	private JButton pers = new JButton("Personalizáveis");
	private JButton promo = new JButton("Promoções");
	private JButton sobre = new JButton("Sobremesas");
	
	public TelaCardapio() {
		titulo.setFont(new Font("Arial", Font.BOLD, 25));
		titulo.setBounds(115, 15, 190, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		produtoBusca.setBounds(135, 260, 150, 20);
		produtoBusca.setHorizontalAlignment(JTextField.CENTER);
		buscar.setBounds(170, 280, 80, 20);
		acomp.setBounds(40, 65, 150, 30);
		bebida.setBounds(40, 110, 150, 30);
		burger.setBounds(40, 155, 150, 30);
		combo.setBounds(40, 200, 150, 30);
		infantil.setBounds(230, 65, 150, 30);
		pers.setBounds(230, 110, 150, 30);
		promo.setBounds(230, 155, 150, 30);
		sobre.setBounds(230, 200, 150, 30);
		
		janela.add(painel);
		painel.setLayout(null);
		
		painel.add(titulo);
		painel.add(produtoBusca);
		painel.add(buscar);
		painel.add(acomp);
		painel.add(bebida);
		painel.add(burger);
		painel.add(combo);
		painel.add(infantil);
		painel.add(pers);
		painel.add(promo);
		painel.add(sobre);
		
		janela.setSize(430, 350);
		janela.setLocation(745, 400);
		janela.setResizable(false);
		janela.setVisible(true);
		
		acomp.addActionListener(this);
		bebida.addActionListener(this);
		burger.addActionListener(this);
		combo.addActionListener(this);
		infantil.addActionListener(this);
		pers.addActionListener(this);
		promo.addActionListener(this);
		sobre.addActionListener(this);
		buscar.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	//Mostrar acompanhamentos
		if(src==acomp) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 1);
			
	//Mostrar bebidas
		} else if(src==bebida) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 2);
			
	//Mostrar burgers
		} else if(src==burger) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 3);
			
	//Mostrar combos
		} else if(src==combo) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 4);
			
	//Mostrar infantis
		} else if(src==infantil) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 5);
			
	//Mostrar personalizaveis
		} else if(src==pers) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 6);
			
	//Mostrar promocoes
		} else if(src==promo) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 7);
			
	//Mostrar sobremesas
		} else if(src==sobre) {
			new TelaProduto().mostrarDados(TelaMenu.dados, 8);
		
	//Buscar produto por nome
		} else if(src==buscar) {
		//Declaracoes
			String nomeBusca = produtoBusca.getText();
			int nomesIguais = 0;
			
		//Comparar Acompanhamentos
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdAcomps(); i++) {
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneAcompanhamento(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(1, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Bebidas
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBebida(); i++) {
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneBebida(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(2, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Burgers
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdBurger(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneBurger(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(3, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Combos
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdCombos(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneCombo(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(4, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Infantis
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdInfantis(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneInfantil(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(5, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
		
		//Comparar Personalizaveis
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdPers(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOnePers(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(6, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Promocoes
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdPromo(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOnePromo(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(7, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Comparar Sobremesas
			for(int i = 0; i < TelaMenu.dados.getDadoProduto().getQtdSobremesa(); i++){
				if(nomeBusca.equals(TelaMenu.dados.getDadoProduto().getOneSobre(i).getNome())) {
					new TelaDetalheProduto().mostrarDados(8, TelaMenu.dados, null, i);
					nomesIguais++;
					
				}
			}
			
		//Mensagem de falha na busca
			if(nomesIguais==0) {
				JOptionPane.showMessageDialog(null, "Não foi possível encontrar um produto com este nome.\n"
						+ "Por favor, tente novamente.", null, JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}

}
