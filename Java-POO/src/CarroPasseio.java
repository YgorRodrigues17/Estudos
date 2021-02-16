
public class CarroPasseio extends Veiculo{
	private String cor;
	private String modelo;
	
	public CarroPasseio(String placa, String chassi, int ano, String marca, String cor) {
		super(placa, chassi, ano, marca);
		this.cor = cor;
	}
	public CarroPasseio(String placa, String chassi, int ano, String marca, String cor, String modelo) {
		super(placa, chassi, ano, marca);
		this.modelo = modelo;
	}
	public void exibir() {
		System.out.println("Cor : "+cor);
		System.out.println("Modelo : "+modelo);
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	     
	     
	     


}
	
	


