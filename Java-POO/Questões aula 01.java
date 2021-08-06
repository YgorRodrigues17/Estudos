//1°Questão:
public class NomeCurso
{
    public static void main(String args[])
    {
        System.out.println("Sistemas de Informação");
    }
}

//2°Questão:
public class DadosPessoais
{
    public static void main(String args[])
    {
       System.out.println("Ygor Jose Oliveira Rodrigues");
       System.out.println("R-Visconde de Barbacena 390");
       System.out.println("27/07/2001");
       System.out.println("Jose Antonio de Oliveira e Ana Maria Oliveira Rodrigues");
    }
}

//3°Questão:
import java.util.Scanner;
public class Operacoes
{
    public static void main(String args [])
    {   
        Scanner SC1 = new Scanner(System.in);
        System.out.println("digite um numero");
        Scanner SC2 = new Scanner(System.in);
        System.out.println("digite outro numero");
        int numero1 = SC1.nextInt();
        int numero2 = SC2.nextInt();
        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1*numero2);
        System.out.println(numero1/numero2);
    }
}

        
        
        

   