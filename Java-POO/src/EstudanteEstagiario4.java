
public class EstudanteEstagiario4 extends Estudante4 {
	private String empresa;
	private float salario;
	
	public EstudanteEstagiario4(String matricula, String nome, String cpf, int idade, String empresa) {
		super(matricula, nome, cpf, idade);
		this.empresa = empresa;
	}
	public EstudanteEstagiario4(String matricula, String nome, String cpf, int idade, String empresa, float salario) {
		super(matricula, nome, cpf, idade);
		this.salario = salario;
	}
	public void exibir() {
		System.out.println("Empresa : "+empresa);
		System.out.println("Salario : "+salario);
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	

}
