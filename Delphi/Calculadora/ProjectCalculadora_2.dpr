program Project1;

uses
  Vcl.Forms,
  Calculadora_2 in 'Calculadora_2.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
