
public class TesteContas {

	public static void main(String[] args) {
		Contas c = new Contas();
		ContaCorrente  cc = new ContaCorrente();
		ContaPoupanca  cp = new ContaPoupanca();
		
		c.deposita(200);
		cc.deposita(200);
		cp.deposita(200);
		
		c.saca(1000);
		cc.saca(1000);
		cp.saca(500);
	

	}

}
