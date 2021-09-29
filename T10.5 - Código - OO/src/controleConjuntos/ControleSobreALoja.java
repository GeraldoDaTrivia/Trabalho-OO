package controleConjuntos;

import modeloConjuntos.SobreALoja;
import modeloDados.Endereco;
import modeloDados.HoraFuncionamento;
import modeloDados.Telefone;

public class ControleSobreALoja {

//Atributos
	private SobreALoja sobreLoja;
	
	
//Construtor
	public ControleSobreALoja(SobreALoja dados) {
		dados.fillWithSomeData();
		sobreLoja.setTelLoja(dados.getTelLoja());
		sobreLoja.setHorFunc(dados.getHorFunc());
		sobreLoja.setEndLoja(dados.getEndLoja());
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
