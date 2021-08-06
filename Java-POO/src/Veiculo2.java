
public abstract class Veiculo2 {
	protected String placa;
	protected long chassi;
	protected int ano;
	protected String marca;
	
	public Veiculo2() {}
	
	public Veiculo2(String placa, long chassi) {
		this.placa = placa;
		this.chassi = chassi;
	}
	public Veiculo2(String placa, long chassi, int ano) {
		this(placa, chassi);
		this.ano = ano;
	}
	public Veiculo2(String placa, long chassi, int ano, String marca) {
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

	public long getChassi() {
		return chassi;
	}

	public void setChassi(long chassi) {
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
	
}



