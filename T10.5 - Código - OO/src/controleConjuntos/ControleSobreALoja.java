package controleConjuntos;

import modeloConjuntos.SobreALoja;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

public class ControleSobreALoja {

//Atributos
	private SobreALoja sobreLoja;
	
	
//Construtor
	public ControleSobreALoja(ControleDado dados) {
		sobreLoja = dados.getDadoLoja().getLoja();
		
		sobreLoja.setTelLoja(dados.getDadoLoja().getTelLoja());
		sobreLoja.setHorFunc(dados.getDadoLoja().getHorFunc());
		sobreLoja.setEndLoja(dados.getDadoLoja().getEndLoja());
	}
	
	
//Editar dados
	public void editarLoja(int pos) {
		switch(pos) {
		case 1:
			
			
			break;
		
		case 2:
			
			
			break;
			
		case 3:
			
			
			break;
			
		default:
			
		}
	}
	
	
//Get SobreLoja
	public SobreALoja getSobreLoja() {
		return sobreLoja;
	}
	
	
//Get Dados
	public Telefone getTel() {
		return sobreLoja.getTelLoja();
	}
	
	public HoraFuncionamento getHoraFunc() {
		return sobreLoja.getHorFunc();
	}
	
	public Endereco getEnd() {
		return sobreLoja.getEndLoja();
	}
	
}
