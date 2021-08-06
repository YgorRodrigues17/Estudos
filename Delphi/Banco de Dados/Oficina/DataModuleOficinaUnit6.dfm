object DataModule6: TDataModule6
  OldCreateOrder = False
  Height = 419
  Width = 639
  object FDConnection1: TFDConnection
    Params.Strings = (
      'Database=bd_oficina'
      'User_Name=root'
      'Password=password'
      'DriverID=MySQL')
    Connected = True
    Left = 48
    Top = 40
  end
  object FDTable1: TFDTable
    Active = True
    IndexFieldNames = 'cpf_cliente'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'clientes'
    CatalogName = 'bd_oficina'
    TableName = 'clientes'
    Left = 168
    Top = 40
    object FDTable1cpf_cliente: TStringField
      FieldName = 'cpf_cliente'
      Origin = 'cpf_cliente'
      ProviderFlags = [pfInUpdate, pfInWhere, pfInKey]
      Required = True
      Size = 11
    end
    object FDTable1nom_cliente: TStringField
      FieldName = 'nom_cliente'
      Origin = 'nom_cliente'
      Required = True
      Size = 30
    end
    object FDTable1contato_cliente: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'contato_cliente'
      Origin = 'contato_cliente'
      Size = 30
    end
  end
  object FDTable2: TFDTable
    Active = True
    CachedUpdates = True
    IndexFieldNames = 'cod_func'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'funcionarios'
    CatalogName = 'bd_oficina'
    TableName = 'funcionarios'
    Left = 168
    Top = 112
    object FDTable2cod_func: TFloatField
      FieldName = 'cod_func'
      Origin = 'cod_func'
      ProviderFlags = [pfInUpdate, pfInWhere, pfInKey]
      Required = True
    end
    object FDTable2nom_func: TStringField
      FieldName = 'nom_func'
      Origin = 'nom_func'
      Required = True
      Size = 30
    end
    object FDTable2cpf_func: TStringField
      FieldName = 'cpf_func'
      Origin = 'cpf_func'
      Required = True
      Size = 11
    end
    object FDTable2dat_nasc: TDateTimeField
      AutoGenerateValue = arDefault
      FieldName = 'dat_nasc'
      Origin = 'dat_nasc'
    end
    object FDTable2contato: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'contato'
      Origin = 'contato'
      Size = 10
    end
  end
  object FDTable3: TFDTable
    Active = True
    IndexFieldNames = 'cod_servico'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'servicos'
    CatalogName = 'bd_oficina'
    TableName = 'servicos'
    Left = 168
    Top = 184
    object FDTable3cod_servico: TFloatField
      FieldName = 'cod_servico'
      Origin = 'cod_servico'
      ProviderFlags = [pfInUpdate, pfInWhere, pfInKey]
      Required = True
    end
    object FDTable3nom_servico: TStringField
      FieldName = 'nom_servico'
      Origin = 'nom_servico'
      Required = True
      Size = 45
    end
    object FDTable3preco: TSingleField
      FieldName = 'preco'
      Origin = 'preco'
      Required = True
    end
  end
  object FDTable4: TFDTable
    Active = True
    IndexFieldNames = 'placa'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'veiculos'
    CatalogName = 'bd_oficina'
    TableName = 'veiculos'
    Left = 168
    Top = 248
    object FDTable4placa: TStringField
      FieldName = 'placa'
      Origin = 'placa'
      ProviderFlags = [pfInUpdate, pfInWhere, pfInKey]
      Required = True
      Size = 9
    end
    object FDTable4nom_veiculo: TStringField
      FieldName = 'nom_veiculo'
      Origin = 'nom_veiculo'
      Required = True
      Size = 10
    end
    object FDTable4modelo: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'modelo'
      Origin = 'modelo'
      Size = 10
    end
    object FDTable4servico: TStringField
      FieldName = 'servico'
      Origin = 'servico'
      Required = True
      Size = 45
    end
  end
  object DataSource1: TDataSource
    DataSet = FDTable1
    Left = 272
    Top = 40
  end
  object DataSource2: TDataSource
    DataSet = FDTable2
    Left = 272
    Top = 112
  end
  object DataSource3: TDataSource
    DataSet = FDTable3
    Left = 272
    Top = 184
  end
  object DataSource4: TDataSource
    DataSet = FDTable4
    Left = 272
    Top = 248
  end
end
