
public class Estudante4 {
	protected String matricula;
	protected String nome;
	protected String cpf;
	protected int idade;
	
	public Estudante4() {}
	
	public Estudante4(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public Estudante4(String matricula, String nome, String cpf) {
		this(matricula, nome);
		this.cpf = cpf;
	}
	public Estudante4(String matricula, String nome, String cpf, int idade) {
		this(matricula, nome, cpf);
		this.idade = idade;
	}
	public void visualizar() {
		System.out.println("Matricula : "+matricula);
		System.out.println("Nome : "+nome);
		System.out.println("CPF : "+cpf);
		System.out.println("Idade : "+idade);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
