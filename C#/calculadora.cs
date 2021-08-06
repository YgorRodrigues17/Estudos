using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[] args)
        {
           // simples calculadora

/**
           double d,d2,d3,d4;
           d=12+3;  //soma
           d2=12-3; //subtração
           d3=12*3; //multiplicação
           d4=12/3; //divisão


           console.writeline(d);
        */

           double num1,num2;
           string tmp;
           console.writeline("digite um numero:");
           tmp=console.readline();
           num1=int.parse(tmp);

           console.writeline("digite mais um numero:");
           tmp=console.readline();
           num2=int.parse(tmp);

           console.writeline("soma:"+num1+num2);

           double resultado;
           resultado=num1+num2;
           console.writeline("resultado e"+resultado);

           resultado=num1-num2;
           console.writeline("subtracao"+resultado);

           resultado=num1*num2;
           console.writeline("multiplicacao e"+resultado);

           resultado=num1/num2;
           console.writeline("divisao e"+resultado);


        }
    }
}