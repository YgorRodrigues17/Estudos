public class Estudante {
	private int matricula;
	private String nome;
	private char sexo;
    private double [] notas = new double[4];
    private static int numEstudantes = 0;
    public static String descricao = "Essa classe apresenta estudantes";
    Curso meuCurso;
	
	public Estudante() {
		numEstudantes++;
		matricula = 0;
        nome = "";
		sexo = ' ';
		this.nome = null;
	}
	public Estudante(String nome) {
		numEstudantes++;
		System.out.println("Dentro do 1º construtor");
		this.nome = nome;
	}
	public Estudante(String nome, char sexo) {
		this(nome);
		System.out.println("Dentro do 2º construtor");
		this.sexo = sexo;
	}
	public Estudante(String nome, char sexo, int matricula) {
		this(nome,sexo);
		System.out.println("Dentro do 3º construtor");
		this.matricula = matricula;
	}
	public static int getNumEstudantes() {
		return numEstudantes;
	}
	public Estudante(String novoNome, char novoSexo, int novaMatricula, Curso curso) {
		matricula = novaMatricula;
		nome = novoNome;
		sexo = novoSexo;
		meuCurso = curso;
	}
	
	public void exibir() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		for(int i = 0; i < notas.length; i++) {
			System.out.println("notas["+i+"] = " + notas[i]);
				
		}
		if(meuCurso != null)
			meuCurso.exibir();
	}
	public void atribuirNota(int prova, double nota) throws NotaInvalidaException, ProvaInvalidaException{
		if(nota < 0.0 || nota > 10.0)
			throw new NotaInvalidaException(nota);
		else if(prova < 1 || prova > notas.length)
			throw new ProvaInvalidaException();
		else
			notas[prova - 1] = nota;
	}
	public void atribuirNota(int prova) throws NotaInvalidaException,ProvaInvalidaException{
		atribuirNota(prova, 0.0);
	}
	public void exibir(String texto) {
		System.out.println("**" + texto + "***");
		exibir();
	}
	public void setNota(int numProva, double nota) {
		notas [numProva - 1] = nota;
	}
	public void setNota(int numProva) {
		notas [numProva - 1] = 0.0;
	}
	public double getNota (int numProva) {
		return notas[numProva - 1];
	}
	public void setMatricula(int m) {
		matricula = m;
		
	}
	public void setNome(String n) {
		if(nome != null)
		this.nome = n;
		
	}
	public void setSexo(char s) {
		sexo = s;
		
	}
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}

	public char getSexo() {
		return sexo;
	}
	public void setMeuCurso(Curso curso) {
		meuCurso = curso;
	}
	public Curso getMeuCurso() {
		return meuCurso;
	}
}
