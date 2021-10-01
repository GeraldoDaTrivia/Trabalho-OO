package modeloConjuntos;

import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

public class SobreALoja {
	
//Atributos
	private HoraFuncionamento horFunc;
	private Endereco endLoja;
	private Telefone telLoja;
	
	
//Construtores
	public SobreALoja(Telefone tel, HoraFuncionamento hora, Endereco end) {
		telLoja = tel;
		horFunc = hora;
		endLoja = end;
	}
	
	@Override
	public String toString() {
		return "\n----==== Informacoes Sobre a Loja ====----\n" + 
				"\n# Telefone #\n"+ telLoja + 
				"\n# Horario de Funcionamento #\n" + horFunc + 
				"\n# Endereco #\n" + endLoja + 
				"\n\n---------=========######=========---------\n";
	}
	
	
//Gets e sets
	public HoraFuncionamento getHorFunc() {
		return horFunc;
	}

	public void setHorFunc(HoraFuncionamento horFunc) {
		this.horFunc = horFunc;
	}

	public Endereco getEndLoja() {
		return endLoja;
	}

	public void setEndLoja(Endereco endLoja) {
		this.endLoja = endLoja;
	}

	public Telefone getTelLoja() {
		return telLoja;
	}

	public void setTelLoja(Telefone telLoja) {
		this.telLoja = telLoja;
	}

}
