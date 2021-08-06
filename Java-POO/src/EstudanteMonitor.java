
public class EstudanteMonitor extends Estudante3 {
	
	public EstudanteMonitor() {
		super();
		this.bolsa = 0.0;
		this.disciplina = "";
	}
	
	public EstudanteMonitor(int matricula, String nome, char sexo, double bolsa, String disciplina) {
		super(nome,sexo,matricula);
		this.bolsa = bolsa;
		this.disciplina = disciplina;
	}	
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	private double bolsa;
	private String disciplina;
	
	public void tirarDuvidas() {
		System.out.println("Tirando duvidas");
	}
	public void auxiliarProfessor() {
		System.out.println("Auxiliando professor");
	}
	public void atribuirNota(int prova, double nota) {
		super.atribuirNota(prova, nota);
				if(nota >= 7.0)
				System.out.println("Monitor desligado");
			}
	public void exibir() {
		super.exibir();
		System.out.println("");
		System.out.println("");
	}

}
