object DataModule1: TDataModule1
  OldCreateOrder = False
  Height = 307
  Width = 442
  object FDConnection1: TFDConnection
    Params.Strings = (
      'Database=Agenda'
      'User_Name=root'
      'Password=password'
      'DriverID=MySQL')
    Connected = True
    Left = 56
    Top = 40
  end
  object FDTable1: TFDTable
    Active = True
    AfterInsert = FDTable1AfterInsert
    IndexFieldNames = 'id'
    Connection = FDConnection1
    UpdateOptions.UpdateTableName = 'Agenda.contatos'
    TableName = 'Agenda.contatos'
    Left = 160
    Top = 40
    object FDTable1id: TFDAutoIncField
      FieldName = 'id'
      Origin = 'id'
    end
    object FDTable1nome: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'nome'
      Origin = 'nome'
      Size = 50
    end
    object FDTable1celular: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'celular'
      Origin = 'celular'
    end
    object FDTable1bloqueado: TBooleanField
      AutoGenerateValue = arDefault
      FieldName = 'bloqueado'
      Origin = 'bloqueado'
    end
    object FDTable1data: TDateTimeField
      AutoGenerateValue = arDefault
      FieldName = 'data'
      Origin = '`data`'
    end
    object FDTable1observacoes: TMemoField
      AutoGenerateValue = arDefault
      FieldName = 'observacoes'
      Origin = 'observacoes'
      BlobType = ftMemo
    end
  end
  object DataSource1: TDataSource
    DataSet = FDTable1
    Left = 56
    Top = 120
  end
end
