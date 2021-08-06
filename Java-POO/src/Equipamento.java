import java.util.ArrayList;
public class Equipamento implements Exibivel {
	
	private String nome;
	
	public Equipamento(String nome) {
		this.nome = nome;
	}
	
	private ArrayList<Peca> pecas = new ArrayList<Peca>();
	
	public void adicionar(Peca peca) {
		pecas.add(peca);
	}
	public void remover(Peca peca) {
		pecas.remove(peca);
	}
	public void exibir() {
		for(Peca p : pecas) {
			p.exibir();
		}
	}
	public void exibir(String texto) {
		System.out.println(texto);
		this.exibir();
	}

}
