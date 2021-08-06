program OficinaProject1;

uses
  Vcl.Forms,
  OficinaUnit1 in 'OficinaUnit1.pas' {Form1},
  FuncionariosUnit3 in 'FuncionariosUnit3.pas' {Form2},
  ServicosUnit4 in 'ServicosUnit4.pas' {Form3},
  VeiculosUnit5 in 'VeiculosUnit5.pas' {Form4},
  DataModuleOficinaUnit6 in 'DataModuleOficinaUnit6.pas' {DataModule6: TDataModule},
  ClientesUnit2 in 'ClientesUnit2.pas' {Form5};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TForm2, Form2);
  Application.CreateForm(TForm3, Form3);
  Application.CreateForm(TForm4, Form4);
  Application.CreateForm(TDataModule6, DataModule6);
  Application.CreateForm(TForm5, Form5);
  Application.Run;
end.
