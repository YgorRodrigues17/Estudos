
/*import java.util.*;
 ESSE CAMINHO ESTÁ NO MEU CLASSPATH
 C:/Program Files/Java/Jre1.8.0_151/lib
 Java/Util/ArrayList.class
 Java/Util/ListIterator.class
 Java/Util/Vector.class
 */
import java.util.ListIterator;
public class TurmaArrayList {
	private String nome;
	private int numEstudantes;
	java.util.ArrayList<Estudante> estudantes = new java.util.ArrayList<Estudante>();
	
	public TurmaArrayList(String nom, int ne) {
		nome = nom;
		numEstudantes = ne;
	}
	public void matricular(Estudante e) {
		estudantes.add(e);
	}
	public void listar() {
	    java.util.ListIterator<Estudante> it = estudantes.listIterator();
	    while(it.hasNext()) {
	    	it.next().exibir();
	    }
	}
	public Estudante Pesquisar(int matricula) {
		for(int i = 0; i < estudantes.size(); i++) {
			if(estudantes.get(i).getMatricula() == matricula) {
				return estudantes.get(i);
			}
		}
		System.out.println("Matricula inexistente"+matricula);
		return null;
	}
	public void trancar(int matricula) {
		boolean achou = true;
		for(int i = 0; i < estudantes.size(); i++) {
			if(estudantes.get(i).getMatricula() == matricula) {
				estudantes.remove(i);
				achou = true;
			}
		}
	}
	public void trancar(Estudante e,int matricula) {
		boolean achou = true;
		for(Estudante e1 : estudantes) {
			if(e.getMatricula() == matricula ) {
				achou = true;
			}
		}
		if(! achou) {
			System.out.println("Matricula inexistente");
		}
	}
	
	 }
	


