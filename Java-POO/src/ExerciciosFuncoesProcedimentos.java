
public class ExerciciosFuncoesProcedimentos {
	public static void main(String args[])
	{
		System.out.println("o resultado e:"+somar(10,30)); // no procedimento se usa isso
		Mult(5,5); // na funcao coloca apenas isso
		}
   public static int somar(int x, int y) //procedimento(usa o return)
   {
	   int c;
	   c=x+y;
	   return c;
   }
   public static void Mult(int a,int b) //funcao(pois usa void e nao usa return)
   {
	 int r=a*b; 
	 imprimir(r);
   }
   public static void imprimir(int a) //usar sempre que for funcao
   {
	   System.out.println("o resultado:"+ a);
   }
}

