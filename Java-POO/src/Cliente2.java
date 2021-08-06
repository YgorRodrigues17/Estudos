
public class Cliente2 {
	protected String cpf;
	protected String nome;
	protected String rg;
	protected int idade;
	
	public Cliente2() {}
	
	public Cliente2(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	public Cliente2(String cpf, String nome, String rg) {
		this(cpf, nome);
		this.rg = rg;
	}
	public Cliente2(String cpf, String nome,String rg, int idade) {
		this(cpf, nome, rg);
		this.idade = idade;
	}
	public void visualizar() {
		System.out.println("CPF : "+cpf);
		System.out.println("Nome : "+nome);
		System.out.println("RG : "+rg);
		System.out.println("Idade : "+idade);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
