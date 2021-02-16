
public class TesteBanco2 {

	public static void main(String[] args) {
		ContaPoupanca2 cp1 = new ContaPoupanca2("004.469.003-70","Ygor Jose Oliveira Rodrigues","2009075946-8",19,"0001","8492846012");
		ContaCorrente2 cc1 = new ContaCorrente2("004.469.003-70","Ygor Jose Oliveira Rodrigues","2009075946-8",19,"0001","8492846012");
		ContaCorrente2 cc2 = new ContaCorrente2("1616.961.713-72"," Jose Antonio de Oliveira","9364746243-5",59,"9647","3927304946");
		ContaPoupanca2 cp2 = new ContaPoupanca2("1616.961.713-72"," Jose Antonio de Oliveira","9364746243-5",59,"9647","3927304946");
		ContaCorrente2 cc3 = new ContaCorrente2("1616.961.713-72","Ana Maria Oliveira Rodrigues","9264856108-1",55,"9154","9263819264");
		ContaPoupanca2 cp3 = new ContaPoupanca2("263.814.193-32","Ana Maria Oliveira Rodrigues","8649244860-4",55,"9154","9263819264");
		
		
		
		Banco2 b = new Banco2();
		b.abriConta(cc1);
		b.abriConta(cc2);
		b.abriConta(cc3);
		b.mostrar();
		
		System.out.println("*****Consultando conta*****");
		Cliente2 c = b.consultar("004.469.003-70");
		c.visualizar();
		
		System.out.println("*****Cancelando conta*****");
		b.cancelarConta("8649244860-4");
		b.mostrar();
		

	}

}
