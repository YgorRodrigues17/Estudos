unit AgendamentoUnit3;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Data.DB, Vcl.StdCtrls, Vcl.Grids,
  Vcl.DBGrids, Vcl.Mask, Vcl.DBCtrls, Vcl.ExtCtrls;

type
  TForm3 = class(TForm)
    DBGrid1: TDBGrid;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Label4: TLabel;
    Label5: TLabel;
    Label6: TLabel;
    DBEdit1: TDBEdit;
    DBEdit2: TDBEdit;
    DBEdit5: TDBEdit;
    DBEdit6: TDBEdit;
    DBNavigator1: TDBNavigator;
    Edit1: TEdit;
    Label7: TLabel;
    DBEdit3: TDBEdit;
    DBEdit4: TDBEdit;
    procedure Edit1Change(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form3: TForm3;

implementation

{$R *.dfm}

uses ClinicaUnit1, ClinicaUnit4;

procedure TForm3.Edit1Change(Sender: TObject);
begin
DataModule1.FDTable2.Locate('id_agendamento',Edit1.Text,[LoPartialKey]);
end;

end.
