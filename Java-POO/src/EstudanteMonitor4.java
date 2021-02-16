
public class EstudanteMonitor4 extends Estudante4{
	private String disciplina;
	private float bolsa;
	
	public EstudanteMonitor4(String matricula, String nome, String cpf, int idade, String disciplina) {
		super(matricula, nome, cpf, idade);
		this.disciplina = disciplina;
	}
	public EstudanteMonitor4(String matricula, String nome, String cpf, int idade, String disciplina, float bolsa) {
		super(matricula, nome, cpf, idade);
		this.bolsa = bolsa;
	}
	public void exibir() {
		System.out.println("Disciplina : "+disciplina);
		System.out.println("Bolsa : "+bolsa);
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	

}
