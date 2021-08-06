import java.util.Scanner;
public abstract class TesteUtility {

	public static void main(String[] args) {
		Scanner SC1 = new Scanner(System.in);
		System.out.println("Digite dois numeros");
		int x = SC1.nextInt();
		int y = SC1.nextInt();
		int soma = Utility.somar(x, y);
		int subtrair = Utility.subtrair(x, y);
		int multiplicar = Utility.multiplicar(x, y);
		int dividir = Utility.dividir(x, y);
		
		System.out.println("Soma = "+soma);
		System.out.println("Subtracao = "+subtrair);
	    System.out.println("Multiplicacao = "+multiplicar);
		System.out.println("Dividir = "+dividir);

	}

}
