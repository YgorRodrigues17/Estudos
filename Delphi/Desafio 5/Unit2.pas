unit Unit2;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.Mask, Vcl.DBCtrls, Vcl.StdCtrls,
  Vcl.Menus;

type
  TForm2 = class(TForm)
    Memo1: TMemo;
    Button1: TButton;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    DBEdit1: TDBEdit;
    Label4: TLabel;
    DBEdit2: TDBEdit;
    DBEdit3: TDBEdit;
    DBEdit4: TDBEdit;
    procedure Button1Click(Sender: TObject);

  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form2: TForm2;

implementation

{$R *.dfm}

uses Unit1, Unit3;

procedure TForm2.Button1Click(Sender: TObject);

var
mn : double;
ma : double;

begin
   mn := StrToFloat(DBEdit1.Text) + StrToFloat(DBEdit2.Text )*(2) + StrToFloat(DBEdit3.Text)*(3) / 3;
   memo1.Lines.Add(FloatToStr(mn));
   memo1.Lines.Add(DBEdit4.Text);

   ma := (mn) + StrToFloat(DBEdit4.Text);

   if(ma >= 9.0) then
   begin
     memo1.Lines.Add('A');
   end
   else if(ma < 9.0) and (ma >=7.5) then
   begin
     memo1.Lines.Add('B');
   end
   else if(ma < 7.5) and (ma >= 6.0) then
   begin
     memo1.Lines.Add('C');
   end
   else if(ma < 6.0 ) and (ma >= 4.0) then
   begin
     memo1.Lines.Add('D');
   end
   else if(ma < 4.0) then
   begin
     memo1.Lines.Add('E');
   end;

end;



end.
