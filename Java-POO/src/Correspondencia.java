
public class Correspondencia {
	protected double peso;
	protected double preco;
	protected String dataEnvio;
	protected String dataDoRecebimento;
	protected String estado;
	
	
	public Correspondencia() {}
	
	public Correspondencia(double peso, double preco) {
		this.peso =  peso;
		this.preco = preco;
	}
	public Correspondencia(double peso, double preco, String dataEnvio) {
		this(peso, preco);
		this.dataEnvio = dataEnvio;
	}
	public void enviar() {
		dataEnvio = "01/01/2000";
	}
	public void enviar(String dataEnvio) {
		dataEnvio = "27/10/2020";
	
	}
	public boolean conferirPreco(double preco) {
		if((this.peso <= 200 && this.preco == 1.4)) {
			return true;
		}
		else if((this.peso <= 600 && this.preco == 2.8)) {
			return true;
		}
		else if((this.peso > 600 && this.preco == 4)) {
			return true;
		}
		else {
			return false;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getDataDoRecebimento() {
		return dataDoRecebimento;
	}

	public void setDataDoRecebimento(String dataDoRecebimento) {
		this.dataDoRecebimento = dataDoRecebimento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
