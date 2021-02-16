
public class Contas {
	int saque;
	int deposito;
	double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	public void deposita(double valor){
		this.saldo += valor;
		}
	public void saca(double valor) {
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
	}
	

}
