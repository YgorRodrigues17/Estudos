import java.util.ArrayList;
import java.util.ListIterator;
public class Banco2 {
	ArrayList<Cliente2> lista = new ArrayList<Cliente2>();
	
	public void abriConta(Cliente2 cliente) {
		lista.add(cliente);
	}
	public void cancelarConta(Cliente2 cliente) {
		lista.remove(cliente);
	}
	public void mostrar() {
		ListIterator<Cliente2> it = lista.listIterator();
		while(it.hasNext()) {
			it.next().visualizar();
		}
	}
	public void cancelarConta(String rg) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).getRg().equals(rg)) 
				lista.remove(i);
			}
	public Cliente2 consultar(String cpf) {
		for(Cliente2 c : lista)
			if(c.getCpf().equals(cpf))
				return c;
		return null;
	}
	}


