unit Calculadora;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TForm1 = class(TForm)
    Edit1: TEdit;
    Edit2: TEdit;
    Edit3: TEdit;
    Edit4: TEdit;
    Edit5: TEdit;
    Edit6: TEdit;
    Edit7: TEdit;
    Edit8: TEdit;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Button4: TButton;
    Label1: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);

var
   Somar : Double;


begin
   Somar := StrToFloat(Edit1.Text) + StrToFloat(Edit2.Text);

end;

procedure TForm1.Button2Click(Sender: TObject);

var
  Subtrair : Double;

begin
   Subtrair := StrToFloat(Edit3.Text) + StrToFloat(Edit4.Text);

end;

procedure TForm1.Button3Click(Sender: TObject);

var
   Multiplicar : Double;

begin
    Multiplicar := StrToFloat(Edit5.Text) + StrToFloat(Edit6.Text);

end;

procedure TForm1.Button4Click(Sender: TObject);

var
  Dividir : Double;

begin
    Dividir := StrToFloat(Edit7.Text) + StrToFloat(Edit8.Text);
end;

end.
