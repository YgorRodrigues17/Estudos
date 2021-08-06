using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[] args)
        {
            int num1,num2;
            num1=10;
            num2=3;

            double div=num1/num2;
            int resto=num1%num2;

            console.writeline("a divisao de num1 por num2 e igual a:"+div);
            console.writeline("a divisao de num1 por num2 tem resto igual a:"+resto);
            
            console.writeline("o modulo entre 3 e 2:"+(3%2));
            console.writeline("o modulo entre 4 e 2:"+(4%2));   
            console.writeline("o modulo entre 5 e 2:"+(5%2));   
            console.writeline("o modulo entre 6 e 2:"+(6%2));   
            console.writeline("o modulo entre 7 e 3.1:"+(7%3.1));          
        }
    }
}