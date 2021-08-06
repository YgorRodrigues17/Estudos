
public class metodo {
	public static void main(String args[])
	{
		System.out.println("antes de chamar o metodo imprimir");
		somar(10,30);
		imprimir(5);
		System.out.println("depois de chamar o metodo imprimir");
		int b=5;
		int c=15;
		int a=10;
		somar(b,c);
		imprimir(a);
		System.out.println("depois de chamar o metodo imprimir pela 2 vez");
		int soma =novoSomar(10,30);
		System.out.println(soma=novoSomar(a,b));
	}
	public static void somar(int x,int y)
	{
		int s=x+y;
		imprimir(s);
	}
	public static int novoSomar(int x,int y)
	{
		int s=x+y;
		return s;
	}
	public static void imprimir(int x)
	{
		System.out.println("parametro recebido:x=" + x);
	}
}
	