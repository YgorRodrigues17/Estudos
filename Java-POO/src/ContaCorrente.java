
public class ContaCorrente extends Contas {
	public double getSaldo() {
		return this.saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor = 0;
	}
	public void saca(double valor) {
		double novoSaldo = this.saldo = valor;
		this.saldo = novoSaldo;
	}
	

}
