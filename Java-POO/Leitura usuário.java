import java.util.Scanner;
public class leiturausuario
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner (System.in);
        System.out.println ("digite seu nome:");
        String nome = SC.next();
        System.out.println("ola" +nome);
        
    }
}