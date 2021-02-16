import java.util.ArrayList;
import java.util.ListIterator;
public class Turma4 {
	ArrayList<Estudante4> lista = new ArrayList<Estudante4>();
	
	public void incluir(Estudante4 estudante) {
		lista.add(estudante);
	}
	public void excluir(Estudante4 estudante) {
		lista.remove(estudante);
	}
	public void listar() {
		ListIterator<Estudante4> it = lista.listIterator();
        while(it.hasNext()) {
        	it.next().visualizar();
        }
 }
	public void excluir(String cpf) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).getCpf().equals(cpf))
				lista.remove(i);
	}
	public Estudante4 consultar(String matricula) {
		for(Estudante4 e : lista)
			if(e.getMatricula().equals(matricula))
				return e;
		return null;
	}
}
