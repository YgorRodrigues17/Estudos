program Parametro;

{$APPTYPE CONSOLE}

{$R *.res}

uses
  System.SysUtils;

var
  I: Integer;

begin
  for I := 0 to ParamCount do
    Writeln('Param: '+ ParamStr(I));
  ReadLn;

end.
