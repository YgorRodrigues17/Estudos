
public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria(15000);
		
		try {
			cb.depositar(-150);
			cb.sacar(20000);
		}
		catch(DepositoInvalidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Deposito que deu erro : "+e.getDepositoInvalido());
		}
		catch(SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Saque que deu erro : "+e.getSaqueInvalido());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Sempre vai passar por aqui");
		}
		cb.exibir();
		
}
}
