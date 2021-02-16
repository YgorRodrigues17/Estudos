
public class Estudante2 {
	int matricula;
	String nome;
	char sexo;

	double [] notas = new double[3];

	public Estudante2() {
		matricula = 0;
		nome = "";
		sexo = ' ';
	}

	public Estudante2(String novoNome, char novoSexo) {
		novoNome = "pedro";
		novoSexo = 'M';
	}
	public Estudante2(String novoNome, char novoSexo, int novoMatricula) {
		novoNome = "pablo";
		novoSexo = 'M';
		novoMatricula = 1919150;
	}

	public void exibir() {
		System.out.println("matricula : "+matricula);
		System.out.println("nome : "+nome);
		System.out.println("sexo : "+sexo);
	}
	public void atribuirNota(int numProva, double nota) {
		notas [numProva - 1] = nota;
	}
	public double lerNota(int numProva) {
		return notas [numProva - 1];
	}
	public void atribuirNota(int numProva) {
		notas [numProva - 1] = 0.0;
	}
	public void exibir(String titulo) {
		System.out.println("******titulo******");
		exibir();
	}
}
