program Palindromo;

{$APPTYPE CONSOLE}

{$R *.res}


uses
  System.SysUtils;
  Palindromo in 'Palindromo.pas';
var
      Palavra: string;

begin
     Writeln('Informe uma palavra ou frase:');
  Readln(Palavra);
  Writeln(�Palindromo(Palavra));
  ReadLn;
  end;
end.
