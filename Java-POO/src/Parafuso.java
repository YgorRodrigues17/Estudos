
public class Parafuso extends Peca {
	private int tamanho;
	private double bitola;
	
	public Parafuso() {
		super();
	}
	public Parafuso(int codigo, String descricao, String marca, int tamanho, double bitola) {
		super(codigo, descricao, marca);
		this.tamanho =  tamanho;
		this.bitola = bitola;
	}
	
	public void exibir() {
		super.exibir();
		System.out.println("Tamanho : " +tamanho);
		System.out.println("Bitola : " +bitola);
		
	}
	public void exibir(String texto) {
		super.exibir(texto);
		System.out.println("Tamanho : " +tamanho);
		System.out.println("Bitola : " +bitola);
	}

}
