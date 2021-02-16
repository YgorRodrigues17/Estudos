object DataModule2: TDataModule2
  OldCreateOrder = False
  Height = 200
  Width = 287
  object FDConnection1: TFDConnection
    Params.Strings = (
      'User_Name=root'
      'Password=password'
      'DriverID=MySQL')
    Connected = True
    Left = 40
    Top = 40
  end
  object FDTable1: TFDTable
    Active = True
    IndexFieldNames = 'cpf'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'empregado'
    CatalogName = 'bd_empresa_basico'
    TableName = 'empregado'
    Left = 136
    Top = 40
    object FDTable1cpf: TIntegerField
      FieldName = 'cpf'
      Origin = 'cpf'
      ProviderFlags = [pfInUpdate, pfInWhere, pfInKey]
      Required = True
    end
    object FDTable1nome: TStringField
      FieldName = 'nome'
      Origin = 'nome'
      Required = True
      Size = 50
    end
    object FDTable1endereco: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'endereco'
      Origin = 'endereco'
      Size = 50
    end
    object FDTable1sexo: TStringField
      FieldName = 'sexo'
      Origin = 'sexo'
      Required = True
      FixedChar = True
      Size = 1
    end
    object FDTable1data_nascimento: TDateTimeField
      AutoGenerateValue = arDefault
      FieldName = 'data_nascimento'
      Origin = 'data_nascimento'
    end
    object FDTable1sal_emp: TIntegerField
      AutoGenerateValue = arDefault
      FieldName = 'sal_emp'
      Origin = 'sal_emp'
    end
    object FDTable1lotacao: TIntegerField
      AutoGenerateValue = arDefault
      FieldName = 'lotacao'
      Origin = 'lotacao'
    end
  end
  object DataSource1: TDataSource
    DataSet = FDTable1
    Left = 40
    Top = 120
  end
end
