
public class Rosca extends Peca {
	private double espessura;
	private int diametro;
	
	public Rosca() {
		super();
	}
	public Rosca(int codigo, String descricao, String marca, double espessura, int diametro) {
		super(codigo, descricao, marca);
		this.espessura = espessura;
		this.diametro = diametro;
	}
	
	public void exibir() {
		super.exibir();
		System.out.println("Espessura : " +espessura);
		System.out.println("Diametro : " +diametro);
	}
	public void exibir(String texto) {
		super.exibir(texto);
		System.out.println("Espessura : " +espessura);
		System.out.println("Diametro : " +diametro);
	}
	

}
