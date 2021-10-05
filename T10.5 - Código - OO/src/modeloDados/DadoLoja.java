package modeloDados;

import modeloConjuntos.SobreALoja;
import modeloPessoaELoja.Endereco;
import modeloPessoaELoja.HoraFuncionamento;
import modeloPessoaELoja.Telefone;

public class DadoLoja {

//Atributos
	private SobreALoja loja;
	private Telefone telLoja;
	private Endereco endLoja;
	private HoraFuncionamento horFunc;
	
	
//Entrada de Dados Aleatorios
	public void fillWithSomeData() {
		telLoja = new Telefone(061, 998765432);
		endLoja = new Endereco(73005000, "Estado Branco", "Cidade Azul", "Bairro Cinza", "Rua Verde", 18);
		horFunc = new HoraFuncionamento("08:00", "20:00", "Segunda a Sabado");
		loja = new SobreALoja(telLoja, horFunc, endLoja);
	}
	
	
//Gets e sets
	public SobreALoja getLoja() {
		return loja;
	}

	public void setLoja(SobreALoja loja) {
		this.loja = loja;
	}

	public Telefone getTelLoja() {
		return telLoja;
	}

	public void setTelLoja(Telefone telLoja) {
		this.telLoja = telLoja;
	}

	public Endereco getEndLoja() {
		return endLoja;
	}

	public void setEndLoja(Endereco endLoja) {
		this.endLoja = endLoja;
	}

	public HoraFuncionamento getHorFunc() {
		return horFunc;
	}

	public void setHorFunc(HoraFuncionamento horFunc) {
		this.horFunc = horFunc;
	}
	
}
