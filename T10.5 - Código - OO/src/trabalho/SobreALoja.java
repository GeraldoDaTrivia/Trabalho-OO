package trabalho;

public class SobreALoja {
	
//Atributos
	private HoraFuncionamento horFunc;
	private Endereco endLoja;
	private Telefone telLoja;
	
	
//Construtores
	public SobreALoja(HoraFuncionamento hora, Endereco end, Telefone tel) {
		horFunc = hora;
		endLoja = end;
		telLoja = tel;
	}
	
	@Override
	public String toString() {
		return "----==== Informacoes Sobre a Loja ====----\n"
				+ telLoja + "\n" + horFunc + "\n" + endLoja + "\n";
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
