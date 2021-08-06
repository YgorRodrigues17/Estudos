using system;

namespace consoleapplication
{
    class program
    {
        static void main(string[] args)
        {
            double n1,n2,n3,n4=0;
            string frase="digite a {0} no{1}ta:";
            console.writeline(frase,"xyz",);

            console.writeline(frase,1);
            n1= convert.todouble(console.readline());

            console.writeline(frase,2);
            n2=converte.todouble(console.readline());

              console.writeline(frase,3);
            n3=converte.todouble(console.readline());

             console.writeline(frase,4);
            n4=converte.todouble(console.readline());

            double total,media=0;
            total=n1+n2+n3+n4;
            media=total/4;

            console.writeline("a media foi: "+media);

            //menor do que 4-reprovado
            //menor do que 7-exame
            // aprovado

            if(media<4)
            {
                console.writeline("aluno esta reprovado");
            }

            else
            {
                if(media<7)
                {
                    console.writeline("aluno esta exame");
                }
            else
            {
                console.writeline(" o aluno foi aprovado");
            }

            }

        }
    }
}