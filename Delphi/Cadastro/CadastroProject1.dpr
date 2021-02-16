program CadastroProject1;

uses
  Vcl.Forms,
  CadastroUnit1 in 'CadastroUnit1.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
