
public class CorrespondenciaAR extends Correspondencia {
	
	private boolean avisoDeRecebimento;
	
	
	public CorrespondenciaAR(double peso, double preco, String dataEnvio) {
		super(peso , preco, dataEnvio);
	}
public CorrespondenciaAR(double peso, double preco, String dataEnvio, boolean avisoDeRecebimento) {
		super(peso, preco, dataEnvio);
		this.avisoDeRecebimento = avisoDeRecebimento;
	}
public void conferirPreco() {}
	
public boolean getAvisoDeRecebimento() {
	return avisoDeRecebimento;
}
public void setAvisoDeRecebimento(boolean avisoDeRecebimento) {
	this.avisoDeRecebimento = avisoDeRecebimento;
}

}
