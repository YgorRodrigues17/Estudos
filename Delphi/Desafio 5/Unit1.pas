unit Unit1;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Data.DB, Vcl.Grids, Vcl.DBGrids,
  Vcl.ExtCtrls, Vcl.DBCtrls, Vcl.StdCtrls, Vcl.Mask, Vcl.Menus;

type
  TForm1 = class(TForm)
    DBEdit1: TDBEdit;
    DBEdit2: TDBEdit;
    Label1: TLabel;
    Label5: TLabel;
    DBGrid1: TDBGrid;
    MainMenu1: TMainMenu;
    CalculodeNotas1: TMenuItem;
    DBNavigator1: TDBNavigator;
    procedure CalculodeNotas1Click(Sender: TObject);


  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

uses Unit2, Unit3;

procedure TForm1.CalculodeNotas1Click(Sender: TObject);
begin
Form2.ShowModal;
end;

end.
