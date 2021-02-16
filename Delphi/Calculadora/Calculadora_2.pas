unit Calculadora_2;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TForm1 = class(TForm)
    Label1: TLabel;
    Edit1: TEdit;
    Edit2: TEdit;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Button4: TButton;
    Memo1: TMemo;
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
  memo1.Lines.Add(FloatToStr(Somar));

end;

procedure TForm1.Button2Click(Sender: TObject);

var
  Subtrair : Double;

begin
   Subtrair := StrToFloat(Edit1.Text) - StrToFloat(Edit2.Text);
  memo1.Lines.Add(FloatToStr(Subtrair));

end;

procedure TForm1.Button3Click(Sender: TObject);

var
  Multiplicar : Double;

begin
   Multiplicar := StrToFloat(Edit1.Text) * StrToFloat(Edit2.Text);
  memo1.Lines.Add(FloatToStr(Multiplicar));

end;

procedure TForm1.Button4Click(Sender: TObject);

var
  Dividir : Double;

begin
   Dividir := StrToFloat(Edit1.Text) / StrToFloat(Edit2.Text);
  memo1.Lines.Add(FloatToStr(Dividir));

end;

end.
