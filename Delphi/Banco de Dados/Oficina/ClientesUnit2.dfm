object Form5: TForm5
  Left = 0
  Top = 0
  BorderIcons = [biSystemMenu]
  Caption = 'Cadastro de Clientes'
  ClientHeight = 299
  ClientWidth = 635
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  Position = poDesktopCenter
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 34
    Top = 94
    Width = 70
    Height = 13
    Caption = 'CPF do Cliente'
  end
  object Label2: TLabel
    Left = 34
    Top = 140
    Width = 30
    Height = 13
    Caption = 'Nome '
  end
  object Label3: TLabel
    Left = 34
    Top = 186
    Width = 39
    Height = 13
    Caption = 'Contato'
  end
  object DBEdit1: TDBEdit
    Left = 34
    Top = 113
    Width = 121
    Height = 21
    DataField = 'cpf_cliente'
    DataSource = DataModule6.DataSource1
    TabOrder = 0
  end
  object DBEdit2: TDBEdit
    Left = 34
    Top = 159
    Width = 121
    Height = 21
    DataField = 'nom_cliente'
    DataSource = DataModule6.DataSource1
    TabOrder = 1
  end
  object DBEdit3: TDBEdit
    Left = 34
    Top = 205
    Width = 121
    Height = 21
    DataField = 'contato_cliente'
    DataSource = DataModule6.DataSource1
    TabOrder = 2
  end
  object DBGrid1: TDBGrid
    Left = 216
    Top = 53
    Width = 419
    Height = 230
    DataSource = DataModule6.DataSource1
    TabOrder = 3
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'Tahoma'
    TitleFont.Style = []
  end
  object DBNavigator1: TDBNavigator
    Left = 8
    Top = 8
    Width = 200
    Height = 25
    DataSource = DataModule6.DataSource1
    TabOrder = 4
  end
  object Edit1: TEdit
    Left = 214
    Top = 26
    Width = 421
    Height = 21
    TabOrder = 5
    OnChange = Edit1Change
  end
end
