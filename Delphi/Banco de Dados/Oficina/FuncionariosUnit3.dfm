object Form2: TForm2
  Left = 0
  Top = 0
  BorderIcons = [biSystemMenu]
  Caption = 'Cadastro de Funcionarios'
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
    Left = 40
    Top = 56
    Width = 106
    Height = 13
    Caption = 'Codigo do Funcionario'
  end
  object Label2: TLabel
    Left = 40
    Top = 96
    Width = 100
    Height = 13
    Caption = 'Nome do Funcionario'
  end
  object Label3: TLabel
    Left = 40
    Top = 136
    Width = 92
    Height = 13
    Caption = 'CPF do Funcionario'
  end
  object Label4: TLabel
    Left = 40
    Top = 176
    Width = 96
    Height = 13
    Caption = 'Data de Nascimento'
  end
  object Label5: TLabel
    Left = 40
    Top = 216
    Width = 39
    Height = 13
    Caption = 'Contato'
  end
  object DBGrid1: TDBGrid
    Left = 240
    Top = 56
    Width = 403
    Height = 217
    DataSource = DataModule6.DataSource2
    TabOrder = 0
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'Tahoma'
    TitleFont.Style = []
  end
  object DBNavigator1: TDBNavigator
    Left = 24
    Top = 8
    Width = 200
    Height = 25
    DataSource = DataModule6.DataSource2
    TabOrder = 1
  end
  object DBEdit1: TDBEdit
    Left = 40
    Top = 75
    Width = 121
    Height = 21
    DataField = 'cod_func'
    DataSource = DataModule6.DataSource2
    TabOrder = 2
  end
  object DBEdit2: TDBEdit
    Left = 40
    Top = 109
    Width = 121
    Height = 21
    DataField = 'nom_func'
    DataSource = DataModule6.DataSource2
    TabOrder = 3
  end
  object DBEdit3: TDBEdit
    Left = 40
    Top = 155
    Width = 121
    Height = 21
    DataField = 'cpf_func'
    DataSource = DataModule6.DataSource2
    TabOrder = 4
  end
  object DBEdit4: TDBEdit
    Left = 40
    Top = 189
    Width = 121
    Height = 21
    DataField = 'dat_nasc'
    DataSource = DataModule6.DataSource2
    TabOrder = 5
  end
  object DBEdit5: TDBEdit
    Left = 40
    Top = 235
    Width = 121
    Height = 21
    DataField = 'contato'
    DataSource = DataModule6.DataSource2
    TabOrder = 6
  end
  object Edit1: TEdit
    Left = 240
    Top = 29
    Width = 393
    Height = 21
    TabOrder = 7
    OnChange = Edit1Change
  end
end
