package trabalho;

public class HoraFuncionamento {

//Atributos
	private String horAbrir;
	private String horFechar;
	private String diasAbertos;
	
	
//Construtores
	public HoraFuncionamento(String abrir, String fechar, String dias) {
		horAbrir = abrir;
		horFechar = fechar;
		diasAbertos = dias;
	}
	
	@Override
	public String toString() {
		return "Hora de Abrir: " + horAbrir + 
				", Hora de Fechar: " + horFechar + 
				", Dias Abertos: " + diasAbertos + 
				".";
	}
	
	
//Gets e sets
	public String getHorAbrir() {
		return horAbrir;
	}

	public void setHorAbrir(String horAbrir) {
		this.horAbrir = horAbrir;
	}

	public String getHorFechar() {
		return horFechar;
	}

	public void setHorFechar(String horFechar) {
		this.horFechar = horFechar;
	}

	public String getDiasAbertos() {
		return diasAbertos;
	}

	public void setDiasAbertos(String diasAbertos) {
		this.diasAbertos = diasAbertos;
	}

}
