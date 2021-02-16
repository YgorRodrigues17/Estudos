program AgendaContatosProject1;

uses
  Vcl.Forms,
  AgendaUnit1 in 'AgendaUnit1.pas' {Form1},
  DataModuleUnit1 in 'DataModuleUnit1.pas' {DataModule1: TDataModule};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TDataModule1, DataModule1);
  Application.Run;
end.
