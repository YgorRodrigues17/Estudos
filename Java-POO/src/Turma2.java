
public class Turma2 {
	private String nome;
	private int numEstudantes;
	Estudante estudantes[] = new Estudante[10];
	
	public Turma2(String nom, int ne) {
		nome = nom;
		numEstudantes = ne;
	}
	public void matricular(Estudante e) {
		estudantes[numEstudantes] = e;
		numEstudantes++;
	}
	public void listar() {
		for(int i = 0; i < estudantes.length; i++) {
			if(estudantes[i] != null);
		}
	}
	public Estudante Pesquisar(int matricula) {
		for(int i = 0; i < estudantes.length; i++) {
			if((estudantes[i] != null) && (estudantes[i].getMatricula() == matricula)) {
				return estudantes[i];
			}
		}
		System.out.println("Matricula inexistente"+matricula);
		return null;
	}
	public void trancar(int matricula) {
		boolean achou = true;
		for(int i = 0; i < estudantes.length; i++) {
			if((estudantes[i] != null) && (estudantes[i].getMatricula() == matricula)) {
				estudantes[i] = null;
				achou = true;
			}
		}
	}
	public void trancar(Estudante e) {
		boolean achou = true;
		for(int i = 0; i <estudantes.length; i++) {
			if(estudantes[i] != e) {
				estudantes[i] = null;
				achou = true;
			}
		}
	}
	
}
	

	    
	

	

