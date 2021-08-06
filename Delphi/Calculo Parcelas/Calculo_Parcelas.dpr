program Calculo_Parcelas;

uses
  Vcl.Forms,
  UnitParcelas in 'UnitParcelas.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
