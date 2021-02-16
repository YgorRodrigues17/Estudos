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
    Left = 48
    Top = 8
    Width = 56
    Height = 13
    Caption = 'Calculadora'
  end
  object Edit1: TEdit
    Left = 24
    Top = 40
    Width = 121
    Height = 21
    TabOrder = 0
  end
  object Edit2: TEdit
    Left = 232
    Top = 40
    Width = 121
    Height = 21
    TabOrder = 1
  end
  object Edit3: TEdit
    Left = 24
    Top = 88
    Width = 121
    Height = 21
    TabOrder = 2
  end
  object Edit4: TEdit
    Left = 232
    Top = 88
    Width = 121
    Height = 21
    TabOrder = 3
  end
  object Edit5: TEdit
    Left = 24
    Top = 132
    Width = 121
    Height = 21
    TabOrder = 4
  end
  object Edit6: TEdit
    Left = 232
    Top = 132
    Width = 121
    Height = 21
    TabOrder = 5
  end
  object Edit7: TEdit
    Left = 24
    Top = 184
    Width = 121
    Height = 21
    TabOrder = 6
  end
  object Edit8: TEdit
    Left = 232
    Top = 184
    Width = 121
    Height = 21
    TabOrder = 7
  end
  object Button1: TButton
    Left = 424
    Top = 38
    Width = 75
    Height = 25
    Caption = 'Somar'
    TabOrder = 8
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 424
    Top = 80
    Width = 75
    Height = 25
    Caption = 'Subtrair'
    TabOrder = 9
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 424
    Top = 130
    Width = 75
    Height = 25
    Caption = 'Multiplicar'
    TabOrder = 10
    OnClick = Button3Click
  end
  object Button4: TButton
    Left = 424
    Top = 182
    Width = 75
    Height = 25
    Caption = 'Dividir'
    TabOrder = 11
    OnClick = Button4Click
  end
end
