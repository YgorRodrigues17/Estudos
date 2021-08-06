
public class ContaBancaria {
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	public void exibir() {
		System.out.println("Saldo : "+saldo);
	}
	public void depositar(double valor)throws DepositoInvalidoException {
		if(valor < 0.0)
			throw new DepositoInvalidoException(valor);
	}
	public void sacar(double valor) throws SaqueInvalidoException{
		if(this.saldo < valor)
			throw new SaqueInvalidoException(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	


}