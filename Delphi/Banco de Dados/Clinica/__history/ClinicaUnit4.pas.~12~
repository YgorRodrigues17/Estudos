unit ClinicaUnit4;

interface

uses
  System.SysUtils, System.Classes, FireDAC.Stan.Intf, FireDAC.Stan.Option,
  FireDAC.Stan.Error, FireDAC.UI.Intf, FireDAC.Phys.Intf, FireDAC.Stan.Def,
  FireDAC.Stan.Pool, FireDAC.Stan.Async, FireDAC.Phys, FireDAC.Phys.MySQL,
  FireDAC.Phys.MySQLDef, FireDAC.VCLUI.Wait, FireDAC.Stan.Param, FireDAC.DatS,
  FireDAC.DApt.Intf, FireDAC.DApt, Data.DB, FireDAC.Comp.DataSet,
  FireDAC.Comp.Client;

type
  TDataModule1 = class(TDataModule)
    FDConnection1: TFDConnection;
    DataSource1: TDataSource;
    FDTable1: TFDTable;
    DataSource2: TDataSource;
    FDTable2: TFDTable;
    FDTransaction1: TFDTransaction;
    FDTable1id: TFDAutoIncField;
    FDTable1cpf: TStringField;
    FDTable1nome: TStringField;
    FDTable1celular: TStringField;
    FDTable1data_cadastro: TDateField;
    FDTable2id_agendamento: TFDAutoIncField;
    FDTable2id_paciente: TIntegerField;
    FDTable2data: TDateField;
    FDTable2hora: TStringField;
    FDTable2especialidade: TStringField;
    FDTable2medico: TStringField;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  DataModule1: TDataModule1;

implementation

{%CLASSGROUP 'Vcl.Controls.TControl'}

{$R *.dfm}

end.
