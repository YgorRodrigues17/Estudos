program EmpresaProject1;

uses
  Vcl.Forms,
  EmpresaUnit1 in 'EmpresaUnit1.pas' {Form1},
  EmpresaUnit2 in 'EmpresaUnit2.pas' {DataModule2: TDataModule};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TDataModule2, DataModule2);
  Application.Run;
end.
