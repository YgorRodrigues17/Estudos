program Urna_Eletronica1;

uses
  Vcl.Forms,
  Urna_Eletronica in 'Urna_Eletronica.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
