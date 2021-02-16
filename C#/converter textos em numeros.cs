using system;

namespace consoleapplication

{
    class program
    {
        static void main(string[] args)
        {
           // convertendo texto em numero

           string s="10";
           int i;

           i=int.parse(s); // comverte texto em numero

           int x=i+10; 
           console.writeline(x);
           //10+10
        }
    }
}