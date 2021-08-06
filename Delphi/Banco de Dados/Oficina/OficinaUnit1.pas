unit OficinaUnit1;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.Buttons,
  Vcl.Imaging.jpeg, Vcl.ExtCtrls, Vcl.Menus;

type
  TForm1 = class(TForm)
    MainMenu1: TMainMenu;
    Clientes1: TMenuItem;
    Funcionrios1: TMenuItem;
    Servios1: TMenuItem;
    Veiculos1: TMenuItem;
    Panel1: TPanel;
    Image1: TImage;
    BitBtn1: TBitBtn;
    BitBtn2: TBitBtn;
    BitBtn3: TBitBtn;
    BitBtn4: TBitBtn;
    procedure BitBtn4Click(Sender: TObject);
    procedure BitBtn3Click(Sender: TObject);
    procedure BitBtn2Click(Sender: TObject);
    procedure BitBtn1Click(Sender: TObject);
    procedure Clientes1Click(Sender: TObject);
    procedure Funcionrios1Click(Sender: TObject);
    procedure Servios1Click(Sender: TObject);
    procedure Veiculos1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

uses ClientesUnit2, FuncionariosUnit3, VeiculosUnit5, ServicosUnit4;



procedure TForm1.BitBtn1Click(Sender: TObject);
begin
Form4.ShowModal
end;

procedure TForm1.BitBtn2Click(Sender: TObject);
begin
Form3.ShowModal
end;

procedure TForm1.BitBtn3Click(Sender: TObject);
begin
Form2.ShowModal
end;

procedure TForm1.BitBtn4Click(Sender: TObject);
begin
               Form5.ShowModal
end;

procedure TForm1.Clientes1Click(Sender: TObject);
begin
       Form5.ShowModal
end;

procedure TForm1.Funcionrios1Click(Sender: TObject);
begin
       Form2.ShowModal
end;

procedure TForm1.Servios1Click(Sender: TObject);
begin
           Form3.ShowModal
end;

procedure TForm1.Veiculos1Click(Sender: TObject);
begin
            Form4.ShowModal
end;

end.
