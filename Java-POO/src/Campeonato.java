import java.util.ArrayList;
import java.util.ListIterator;
public class Campeonato {
	ArrayList<Time> lista = new ArrayList<Time>();
	
	public void classificar(Time time) {
		lista.add(time);
	}
	public void eliminar(Time time) {
		lista.remove(time);
	}
	public void listar() {
		ListIterator<Time> it = lista.listIterator();
		while(it.hasNext()) {
			it.next().visualizar();
		}
	}
	public void eliminar(String nome) {
		for(int i = 0; i <lista.size(); i++)
			if(lista.get(i).getNome().equals(nome))
				lista.remove(i);
	}
	public Time consultar(String nome) {
		for(Time t : lista)
			if(t.getNome().equals(nome))
				return t;
		return null;
	}

}
