
public class Estudante3 {


	// variaveis de instancia > estrutura de dados dos nossos objetos estudantes
	private int matricula;
	private String nome;
	private char sexo;
	double [] notas = new double[4];
	
	public void setMatricula(int m) {
		if (m > 0 && m <= 31) 
			matricula = m;
	}
	public void setNome(String n) { 
			nome = n;
	}
	public void setSexo(char s) {
		if (s >= 0)
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

	public Estudante3() {
		matricula = 1919099;
		nome = "";
		sexo = ' ';
		for(int i=0; i < notas.length; i++)
			notas[i] = 0.0;
	}
	public Estudante3 (String novoNome, char novoSexo) {
		nome = novoNome;
		sexo = novoSexo;
	}
	public Estudante3 (String novoNome, char novoSexo, int novaMatricula) {
		matricula = novaMatricula;
		nome = novoNome;
		sexo = novoSexo;
	}

	public void exibir() {
		int minhaMatricula = getMatricula();
		System.out.println("minha matricula : "+minhaMatricula);
    
        String meuNome = getNome();
		System.out.println("o meu nome e : "+meuNome);
       
        char meuSexo = getSexo();
		System.out.println("o sexo e : "+meuSexo);
	
		for(int i=0; i < notas.length; i++)
			System.out.println("notas["+i+"]="+notas[i]);
	}

	public void exibir(String texto) {
		System.out.println("*******"+ texto + "*******");
		exibir();
	}
	public void atribuirNota(int numProva, double nota) {
		notas [numProva - 1] = nota;
	}
	public void atribuirNota(int numProva) {
		notas [numProva - 1] = 0.0;
	}
	
	public double lerNota(int numProva) {
		return notas [numProva - 1];
	}
}






