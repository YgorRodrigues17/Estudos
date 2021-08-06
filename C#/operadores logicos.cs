using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[] args)
        {

            // && adição/e/and
            // || disjunção/ou/or
            int num=0;
            console.writeline("informe um numero no intervalo de 20 a 30");
            num=convert.toint32(console.readline());

            if(num>10 && num<30)
            {
                console.writeline("o numero esta no intervalo");
            }
            else
            {
                console.writeline("numero incorreto");
            }
            
            int n1,n2;
            media=(n1+n2)/2;
            total=n1+n2;
            console.writeline("digite sua nota 1");
            n1=convert.toint32(console.readline());
            console.writeline("digite sua nota 2");
            n2=convert.toint32(console.readline());
            if(media>=7.0 || total>= 50)
            {
                console.writeline("aluno esta aprovado");
            }
            else
            {
                console.writeline("akuno esta reprovado");
            }

        }
    }
}