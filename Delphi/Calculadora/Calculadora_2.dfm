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
    Left = 24
    Top = 16
    Width = 65
    Height = 13
    Caption = 'Calculadora 2'
  end
  object Edit1: TEdit
    Left = 24
    Top = 64
    Width = 73
    Height = 21
    TabOrder = 0
  end
  object Edit2: TEdit
    Left = 152
    Top = 64
    Width = 73
    Height = 21
    TabOrder = 1
  end
  object Button1: TButton
    Left = 240
    Top = 8
    Width = 41
    Height = 25
    Caption = '+'
    TabOrder = 2
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 304
    Top = 8
    Width = 33
    Height = 25
    Caption = '-'
    TabOrder = 3
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 360
    Top = 8
    Width = 41
    Height = 25
    Caption = '*'
    TabOrder = 4
    OnClick = Button3Click
  end
  object Button4: TButton
    Left = 424
    Top = 8
    Width = 41
    Height = 25
    Caption = '/'
    TabOrder = 5
    OnClick = Button4Click
  end
  object Memo1: TMemo
    Left = 24
    Top = 104
    Width = 209
    Height = 161
    Lines.Strings = (
      'Memo1')
    TabOrder = 6
  end
end
