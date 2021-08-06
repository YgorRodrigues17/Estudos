object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Cadastro de Clientes'
  ClientHeight = 472
  ClientWidth = 797
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Panel1: TPanel
    Left = 0
    Top = 0
    Width = 797
    Height = 81
    Align = alTop
    TabOrder = 0
    ExplicitTop = -6
    ExplicitWidth = 635
    object Label1: TLabel
      Left = 0
      Top = 15
      Width = 327
      Height = 39
      Caption = 'Cadastro de Clientes'
      Font.Charset = DEFAULT_CHARSET
      Font.Color = clWindowText
      Font.Height = -32
      Font.Name = 'Tahoma'
      Font.Style = [fsBold]
      ParentFont = False
    end
    object Button1: TButton
      Left = 368
      Top = 29
      Width = 75
      Height = 25
      Caption = 'Novo'
      TabOrder = 0
    end
    object Button2: TButton
      Left = 449
      Top = 29
      Width = 75
      Height = 25
      Caption = 'Salvar'
      TabOrder = 1
    end
    object Button3: TButton
      Left = 530
      Top = 29
      Width = 75
      Height = 25
      Caption = 'Cancelar'
      TabOrder = 2
    end
  end
  object PageControl1: TPageControl
    Left = 0
    Top = 81
    Width = 797
    Height = 391
    ActivePage = TabSheet1
    Align = alClient
    TabOrder = 1
    ExplicitTop = 87
    object TabSheet1: TTabSheet
      Caption = 'Dados Pessoais'
      ExplicitLeft = 8
      object Label3: TLabel
        Left = 0
        Top = 3
        Width = 84
        Height = 13
        Caption = 'C'#243'digo do Cliente'
      end
      object Label4: TLabel
        Left = 0
        Top = 53
        Width = 78
        Height = 13
        Caption = 'Nome do Cliente'
      end
      object Label5: TLabel
        Left = 160
        Top = 3
        Width = 71
        Height = 13
        Caption = 'Tipo do Cliente'
      end
      object Label6: TLabel
        Left = 344
        Top = 3
        Width = 14
        Height = 13
        Caption = 'RG'
      end
      object Label7: TLabel
        Left = 503
        Top = 3
        Width = 90
        Height = 13
        Caption = 'Data de Expedi'#231#227'o'
      end
      object Label8: TLabel
        Left = 0
        Top = 112
        Width = 45
        Height = 13
        Caption = 'Endere'#231'o'
      end
      object Label9: TLabel
        Left = 0
        Top = 168
        Width = 28
        Height = 13
        Caption = 'Bairro'
      end
      object Label10: TLabel
        Left = 0
        Top = 232
        Width = 13
        Height = 13
        Caption = 'UF'
      end
      object Label11: TLabel
        Left = 176
        Top = 168
        Width = 33
        Height = 13
        Caption = 'Cidade'
      end
      object Label12: TLabel
        Left = 176
        Top = 232
        Width = 19
        Height = 13
        Caption = 'CEP'
      end
      object Label13: TLabel
        Left = 344
        Top = 53
        Width = 42
        Height = 13
        Caption = 'Telefone'
      end
      object Label14: TLabel
        Left = 503
        Top = 53
        Width = 33
        Height = 13
        Caption = 'Celular'
      end
      object Label15: TLabel
        Left = 344
        Top = 112
        Width = 24
        Height = 13
        Caption = 'Email'
      end
      object Edit1: TEdit
        Left = 0
        Top = 22
        Width = 121
        Height = 21
        TabOrder = 0
      end
      object Edit2: TEdit
        Left = 0
        Top = 72
        Width = 305
        Height = 21
        TabOrder = 1
      end
      object Edit3: TEdit
        Left = 344
        Top = 22
        Width = 121
        Height = 21
        TabOrder = 2
      end
      object Edit4: TEdit
        Left = 503
        Top = 22
        Width = 121
        Height = 21
        TabOrder = 3
      end
      object Edit5: TEdit
        Left = 0
        Top = 131
        Width = 305
        Height = 21
        TabOrder = 4
      end
      object Edit6: TEdit
        Left = 0
        Top = 187
        Width = 121
        Height = 21
        TabOrder = 5
      end
      object Edit7: TEdit
        Left = 3
        Top = 251
        Width = 121
        Height = 21
        TabOrder = 6
      end
      object Edit8: TEdit
        Left = 176
        Top = 187
        Width = 121
        Height = 21
        TabOrder = 7
      end
      object Edit9: TEdit
        Left = 176
        Top = 251
        Width = 121
        Height = 21
        TabOrder = 8
      end
      object Edit10: TEdit
        Left = 344
        Top = 72
        Width = 121
        Height = 21
        TabOrder = 9
      end
      object Edit11: TEdit
        Left = 503
        Top = 72
        Width = 121
        Height = 21
        TabOrder = 10
      end
      object Edit12: TEdit
        Left = 344
        Top = 131
        Width = 280
        Height = 21
        TabOrder = 11
      end
      object CheckBox1: TCheckBox
        Left = 344
        Top = 189
        Width = 113
        Height = 17
        Caption = 'Cliente Negativado'
        TabOrder = 12
      end
      object ComboBox1: TComboBox
        Left = 160
        Top = 22
        Width = 145
        Height = 21
        Style = csDropDownList
        TabOrder = 13
        Items.Strings = (
          'Pessoa F'#237'sica'
          'Pessoa Jur'#237'dica')
      end
    end
    object TabSheet2: TTabSheet
      Caption = 'Dados do Conjuge'
      ImageIndex = 1
      ExplicitLeft = 8
      object Label16: TLabel
        Left = 0
        Top = 10
        Width = 85
        Height = 13
        Caption = 'Nome do Conjuge'
      end
      object Label17: TLabel
        Left = 308
        Top = 10
        Width = 19
        Height = 13
        Caption = 'CPF'
      end
      object Label19: TLabel
        Left = 3
        Top = 79
        Width = 96
        Height = 13
        Caption = 'Data de Nascimento'
      end
      object Edit13: TEdit
        Left = 308
        Top = 29
        Width = 121
        Height = 21
        TabOrder = 0
      end
      object Edit14: TEdit
        Left = 0
        Top = 29
        Width = 269
        Height = 21
        TabOrder = 1
      end
      object GroupBox1: TGroupBox
        Left = 308
        Top = 88
        Width = 377
        Height = 221
        Caption = 'Contatos do Conjuge'
        TabOrder = 2
        object Label20: TLabel
          Left = 0
          Top = 23
          Width = 33
          Height = 13
          Caption = 'Celular'
        end
        object Label2: TLabel
          Left = 0
          Top = 71
          Width = 24
          Height = 13
          Caption = 'Email'
        end
        object Edit16: TEdit
          Left = 0
          Top = 42
          Width = 121
          Height = 21
          TabOrder = 0
        end
        object Edit17: TEdit
          Left = 0
          Top = 90
          Width = 241
          Height = 21
          TabOrder = 1
        end
        object ComboBox2: TComboBox
          Left = 176
          Top = 42
          Width = 145
          Height = 21
          Style = csDropDownList
          TabOrder = 2
          Items.Strings = (
            'Oi'
            'TIM'
            'Claro'
            'Vivo')
        end
      end
      object Edit15: TEdit
        Left = 3
        Top = 98
        Width = 161
        Height = 21
        TabOrder = 3
      end
    end
    object TabSheet3: TTabSheet
      Caption = 'Dados do Trabalho'
      ImageIndex = 2
      ExplicitLeft = 8
      object Label18: TLabel
        Left = 0
        Top = 16
        Width = 44
        Height = 13
        Caption = 'Profiss'#227'o'
      end
      object Label21: TLabel
        Left = 0
        Top = 80
        Width = 41
        Height = 13
        Caption = 'Empresa'
      end
      object Label22: TLabel
        Left = 0
        Top = 136
        Width = 89
        Height = 13
        Caption = 'Endere'#231'o Empresa'
      end
      object Label23: TLabel
        Left = 288
        Top = 136
        Width = 86
        Height = 13
        Caption = 'Telefone Empresa'
      end
      object Edit18: TEdit
        Left = 0
        Top = 35
        Width = 209
        Height = 21
        TabOrder = 0
      end
      object Edit19: TEdit
        Left = 0
        Top = 99
        Width = 209
        Height = 21
        TabOrder = 1
      end
      object Edit20: TEdit
        Left = 0
        Top = 155
        Width = 209
        Height = 21
        TabOrder = 2
      end
      object Edit21: TEdit
        Left = 288
        Top = 155
        Width = 151
        Height = 21
        TabOrder = 3
      end
    end
    object TabSheet4: TTabSheet
      Caption = 'Analise Cr'#233'dito'
      ImageIndex = 3
      ExplicitLeft = 8
      object Label24: TLabel
        Left = 0
        Top = 16
        Width = 83
        Height = 13
        Caption = 'Sal'#225'rio do Cliente'
      end
      object Label25: TLabel
        Left = 0
        Top = 76
        Width = 90
        Height = 13
        Caption = 'Sal'#225'rio do Conjuge'
      end
      object Label26: TLabel
        Left = 0
        Top = 140
        Width = 80
        Height = 13
        Caption = 'Limite de Cr'#233'dito'
      end
      object Label27: TLabel
        Left = 0
        Top = 192
        Width = 70
        Height = 13
        Caption = 'Limite Utilizado'
      end
      object Label28: TLabel
        Left = 0
        Top = 252
        Width = 74
        Height = 13
        Caption = 'Limite Restante'
      end
      object Label29: TLabel
        Left = 272
        Top = 20
        Width = 63
        Height = 13
        Caption = 'Observa'#231#245'es'
      end
      object Edit22: TEdit
        Left = 0
        Top = 39
        Width = 121
        Height = 21
        TabOrder = 0
      end
      object Edit23: TEdit
        Left = 0
        Top = 95
        Width = 121
        Height = 21
        TabOrder = 1
      end
      object Edit24: TEdit
        Left = 0
        Top = 159
        Width = 121
        Height = 21
        TabOrder = 2
      end
      object Edit25: TEdit
        Left = 0
        Top = 211
        Width = 121
        Height = 21
        TabOrder = 3
      end
      object Edit26: TEdit
        Left = 0
        Top = 271
        Width = 121
        Height = 21
        TabOrder = 4
      end
      object Memo1: TMemo
        Left = 272
        Top = 39
        Width = 185
        Height = 89
        Lines.Strings = (
          '')
        TabOrder = 5
      end
    end
  end
end
