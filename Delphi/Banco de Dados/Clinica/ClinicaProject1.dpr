program ClinicaProject1;

uses
  Vcl.Forms,
  ClinicaUnit1 in 'ClinicaUnit1.pas' {Form1},
  CadastroUnit2 in 'CadastroUnit2.pas' {Form2},
  AgendamentoUnit3 in 'AgendamentoUnit3.pas' {Form3},
  ClinicaUnit4 in 'ClinicaUnit4.pas' {DataModule1: TDataModule};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TForm2, Form2);
  Application.CreateForm(TForm3, Form3);
  Application.CreateForm(TDataModule1, DataModule1);
  Application.Run;
end.
