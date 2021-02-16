using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[]args)
        {
           // lendo o teclado
           
           string texto; // declarando a variavel que recebera a string digitada

           console.writeline("digite um texo"); //imprimir em tela
           texto=console.readline(); //ler oque usuario digita
           console.writeline("o valor digitado foi:"+texto); 
           console.writeline(texto);
        }
    }
}