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
    Left = 8
    Top = 32
    Width = 64
    Height = 13
    Caption = 'Urna eleitoral'
  end
  object Memo1: TMemo
    Left = 8
    Top = 67
    Width = 289
    Height = 201
    Lines.Strings = (
      'Memo1')
    TabOrder = 0
  end
  object Confirmar: TButton
    Left = 344
    Top = 266
    Width = 75
    Height = 25
    Caption = 'Confirmar'
    TabOrder = 1
    OnClick = ConfirmarClick
  end
  object Branco: TButton
    Left = 496
    Top = 266
    Width = 75
    Height = 25
    Caption = 'Branco'
    TabOrder = 2
    OnClick = BrancoClick
  end
  object Edit1: TEdit
    Left = 352
    Top = 64
    Width = 121
    Height = 21
    TabOrder = 3
  end
end
