
public class Time {
	protected String nome;
	protected String estadio;
	protected int idade;
	protected  int numJogadores;
	
	public Time() {}
	
	public Time(String nome, String estadio) {
		this.nome = nome;
		this.estadio = estadio;
	}
	public Time(String nome, String estadio, int idade) {
		this(nome, estadio);
		this.idade = idade;
	}
	public Time(String nome, String estadio, int idade, int numJogadores) {
		this(nome, estadio, idade);
		this.numJogadores = numJogadores;
	}
	public void visualizar() {
		System.out.println("Nome : "+nome);
		System.out.println("Estadio : "+estadio);
		System.out.println("Idade : "+idade);
		System.out.println("Numero de Jogadores : "+numJogadores);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String Estadio) {
		this.estadio = Estadio;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumJogadores() {
		return numJogadores;
	}

	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}
	

}
