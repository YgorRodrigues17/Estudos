object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Form1'
  ClientHeight = 299
  ClientWidth = 635
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 40
    Top = 24
    Width = 72
    Height = 13
    Caption = 'Valor da venda'
  end
  object Label2: TLabel
    Left = 223
    Top = 24
    Width = 40
    Height = 13
    Caption = 'Parcelas'
  end
  object Edit1: TEdit
    Left = 16
    Top = 56
    Width = 121
    Height = 21
    TabOrder = 0
  end
  object Edit2: TEdit
    Left = 176
    Top = 56
    Width = 121
    Height = 21
    TabOrder = 1
  end
  object Button1: TButton
    Left = 352
    Top = 54
    Width = 75
    Height = 25
    Caption = 'Calcular'
    TabOrder = 2
    OnClick = Button1Click
  end
  object Memo1: TMemo
    Left = 8
    Top = 96
    Width = 255
    Height = 185
    Lines.Strings = (
      'Memo1')
    TabOrder = 3
  end
end
