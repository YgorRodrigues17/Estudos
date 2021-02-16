using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[] args)
        {
            // lendo o primeiro numero
            int x,y=0;
            console.writeline("sigite um numero:");
            string str=console.readline();
            x=convert.toint32(str);
            
            //lendo o segundo numero
            console.writeline("digite outro numero:");
            str=console.readline();
            y=convert.toint32(str);

            bool r;
            //operador relacional igual
            r=(x==y);
            console.writeline("x==y="+r);

            //operador relaional diferente
             r=(x!=y);
            console.writeline("x!=y="+r);
            
            // operador relacional maior
               r=(x>y);
            console.writeline("x>y="+r);
            
            //operaod relacional menor
              r=(x<y);
            console.writeline("x<y="+r);

            //operador relacional maior igual
             // operador relacional maior
               r=(x>=y);
            console.writeline("x>=y="+r);

            //operador relacional menor igual
             // operador relacional maior
               r=(x<=y);
            console.writeline("x<=y="+r);
        }
    }
}