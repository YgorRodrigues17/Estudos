
public class Caminhao extends Veiculo {
	private float toneladas;
	private float alturaMax;
	private float comprimento;
	
	public Caminhao(String placa, String chassi, int ano, String marca, float toneladas) {
		super(placa, chassi, ano, marca);
		this.toneladas = toneladas;
	}
	public Caminhao(String placa, String chassi, int ano, String marca, float toneladas, float alturaMax) {
		super(placa, chassi, ano, marca);
		this.alturaMax = alturaMax;
	}
	public Caminhao(String placa, String chassi, int ano, String marca, float toneladas, float alturaMax, float comprimento) {
		super(placa, chassi, ano, marca);
		this.comprimento = comprimento;
	}
	public void exibir() {
		System.out.println("Toneladas : "+toneladas);
		System.out.println("Altura Maxima : "+alturaMax);
		System.out.println("Comprimento : "+comprimento);
	}
	public float getToneladas() {
		return toneladas;
	}
	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}
	public float getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(float alturaMax) {
		this.alturaMax = alturaMax;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
	
	
	
	
	
	

}
