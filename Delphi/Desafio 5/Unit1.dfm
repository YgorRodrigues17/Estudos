object Form1: TForm1
  Left = 0
  Top = 0
  BorderIcons = [biSystemMenu]
  BorderStyle = bsSingle
  Caption = 'Cadastro alunos'
  ClientHeight = 307
  ClientWidth = 578
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  Position = poDesktopCenter
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 24
    Top = 45
    Width = 78
    Height = 13
    Caption = 'Codigo do Aluno'
  end
  object Label5: TLabel
    Left = 24
    Top = 91
    Width = 72
    Height = 13
    Caption = 'Nome do Aluno'
  end
  object DBEdit1: TDBEdit
    Left = 24
    Top = 64
    Width = 121
    Height = 21
    DataField = 'COD_ALUNO'
    DataSource = DataModule3.DataSource1
    TabOrder = 0
  end
  object DBEdit2: TDBEdit
    Left = 24
    Top = 112
    Width = 121
    Height = 21
    DataField = 'NOM_ALUNO'
    DataSource = DataModule3.DataSource1
    TabOrder = 1
  end
  object DBGrid1: TDBGrid
    Left = 240
    Top = 64
    Width = 320
    Height = 188
    DataSource = DataModule3.DataSource1
    TabOrder = 2
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'Tahoma'
    TitleFont.Style = []
  end
  object DBNavigator1: TDBNavigator
    Left = 8
    Top = 8
    Width = 240
    Height = 25
    DataSource = DataModule3.DataSource1
    TabOrder = 3
  end
  object MainMenu1: TMainMenu
    Left = 64
    Top = 184
    object CalculodeNotas1: TMenuItem
      Caption = 'Calculo de Notas'
      OnClick = CalculodeNotas1Click
    end
  end
end
