import java.util.ArrayList;
import java.util.ListIterator;
public class Frota {
	ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		
	public void incluir(Veiculo veiculo) {
		lista.add(veiculo);
	}
	public void excluir(Veiculo veiculo) {
		lista.remove(veiculo);
	}
	public void listar() {
		ListIterator<Veiculo> it = lista.listIterator();
        while(it.hasNext())
        	it.next().visualizar();
     }
	public void excluir(String chassi) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).getChassi().equals(chassi))
				lista.remove(i);
	}
	public Veiculo consultar(String placa) {
		for(Veiculo v : lista)
			if(v.getPlaca().equals(placa))
				return v;
		return null;
	}
		
	}

