import java.util.ArrayList;
import java.util.ListIterator;
public class Malote extends Correspondencia {
	private String dataDeRemessa;
	private String Destino;
	private double PesoTotal;
	ArrayList<Correspondencia> lista = new ArrayList<Correspondencia>();
	
	public Malote(String Destino, String dataDeRemessa) {}
	
	public Malote(double peso, double preco, String dataEnvio, String Destino) {
		super(peso, preco, dataEnvio);
		this.Destino = Destino;
	}
	public Malote(double peso, double preco, String dataEnvio, String Destino, String dataDeRemessa) {
		super(peso, preco, dataEnvio);
		this.dataDeRemessa = dataDeRemessa;
	}
	public void adicionar(Correspondencia correspondencia) {
		lista.add(correspondencia);
	}
	public void remover(Correspondencia correspondencia) {
		lista.remove(correspondencia);
	}
	public void remover(double preco) {
		for(int i = 0; i < lista.size(); i++)
			//if(lista.get(i).getPreco())
				lista.remove(i);
	}
	public void remeter() {
		ListIterator<Correspondencia> it = lista.listIterator();
		while(it.hasNext()) {
			it.next().enviar();
		}
	}
	public Correspondencia conferirPrecos(double preco) {
	for(Correspondencia c : lista)
		if(c.conferirPreco(getPreco()))
	       return c;
	return null;
	
	}
}
