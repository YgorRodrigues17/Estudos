object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Form1'
  ClientHeight = 481
  ClientWidth = 738
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
    Top = 8
    Width = 239
    Height = 29
    Caption = 'Agenda de Contatos'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -24
    Font.Name = 'Tahoma'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Label2: TLabel
    Left = 8
    Top = 151
    Width = 84
    Height = 13
    Caption = 'Nome do Contato'
  end
  object Label3: TLabel
    Left = 8
    Top = 197
    Width = 33
    Height = 13
    Caption = 'Celular'
  end
  object Label4: TLabel
    Left = 8
    Top = 295
    Width = 63
    Height = 13
    Caption = 'Observa'#231#245'es'
  end
  object Label5: TLabel
    Left = 0
    Top = 423
    Width = 120
    Height = 13
    Caption = 'Data e Hora do Cadastro'
  end
  object DBText1: TDBText
    Left = 0
    Top = 456
    Width = 201
    Height = 17
    DataField = 'data'
    DataSource = DataModule1.DataSource1
  end
  object Label6: TLabel
    Left = 408
    Top = 53
    Width = 90
    Height = 13
    Caption = 'Busca de Contatos'
  end
  object DBEdit1: TDBEdit
    Left = 8
    Top = 170
    Width = 313
    Height = 21
    DataField = 'nome'
    DataSource = DataModule1.DataSource1
    TabOrder = 0
  end
  object DBEdit2: TDBEdit
    Left = 8
    Top = 216
    Width = 313
    Height = 21
    DataField = 'celular'
    DataSource = DataModule1.DataSource1
    TabOrder = 1
  end
  object DBCheckBox1: TDBCheckBox
    Left = 8
    Top = 257
    Width = 97
    Height = 17
    Caption = 'Bloqueado'
    DataField = 'bloqueado'
    DataSource = DataModule1.DataSource1
    TabOrder = 2
  end
  object DBMemo1: TDBMemo
    Left = 8
    Top = 314
    Width = 185
    Height = 89
    DataField = 'observacoes'
    DataSource = DataModule1.DataSource1
    TabOrder = 3
  end
  object DBNavigator1: TDBNavigator
    Left = 8
    Top = 71
    Width = 240
    Height = 25
    DataSource = DataModule1.DataSource1
    TabOrder = 4
  end
  object DBGrid1: TDBGrid
    Left = 408
    Top = 103
    Width = 305
    Height = 346
    DataSource = DataModule1.DataSource1
    TabOrder = 5
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'Tahoma'
    TitleFont.Style = []
    Columns = <
      item
        Expanded = False
        FieldName = 'nome'
        Title.Caption = 'Contatos Cadastrados'
        Visible = True
      end>
  end
  object Edit1: TEdit
    Left = 408
    Top = 76
    Width = 305
    Height = 21
    TabOrder = 6
    OnChange = Edit1Change
  end
end
