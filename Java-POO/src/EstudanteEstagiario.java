
public class EstudanteEstagiario extends Estudante{
	
	public EstudanteEstagiario() {
		super();
		this.salario = 0.0;
		this.empresa = "";
	}
	
	public EstudanteEstagiario(int matricula, String nome, char sexo, double salario, String empresa) {
		super(nome,sexo,matricula);
	    this.salario = salario;
	    this.empresa = empresa;
		
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	private double salario;
	private String empresa;
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
	public void exibir() {
		super.exibir();
		System.out.println("Empresa : "+empresa);
		System.out.println("Salario : "+salario);
	}

}
