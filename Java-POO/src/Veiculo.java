

public abstract class Veiculo {
	protected String placa;
	protected String chassi;
	protected int ano;
	protected String marca;
	
	public Veiculo() {}
	
	public Veiculo(String placa, String chassi) {
		this.placa = placa;
		this.chassi = chassi;
	}
	public Veiculo(String placa, String chassi, int ano) {
		this(placa, chassi);
		this.ano = ano;
	}
	public Veiculo(String placa, String chassi, int ano, String marca) {
		this(placa, chassi, ano);
		this.marca = marca;
	}
	public void visualizar() {
		System.out.println("Placa : "+placa);
		System.out.println("Chassi : "+chassi);
		System.out.println("Ano : "+ano);
		System.out.println("Marca : "+marca);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void imprimirDocumento() {
		
		
	}
	
	
	
	
	

}
