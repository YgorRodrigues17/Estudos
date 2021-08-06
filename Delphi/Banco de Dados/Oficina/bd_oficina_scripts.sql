use bd_oficina;

CREATE TABLE clientes (
cpf_cliente           varchar(11) NOT NULL,
nom_cliente           varchar(30) NOT NULL,
contato_cliente       varchar(30) DEFAULT NULL,
  PRIMARY KEY (cpf_cliente)
); 

CREATE TABLE funcionarios (
  cod_func             double NOT NULL,
  nom_func             varchar(30) NOT NULL,
  cpf_func             varchar(11) NOT NULL,
  dat_nasc             datetime DEFAULT NULL,
  contato              varchar(10) DEFAULT NULL,
  PRIMARY KEY (cod_func)
);

CREATE TABLE servicos (
  cod_servico       double NOT NULL,
  nom_servico       varchar(45) NOT NULL,
  preco             float NOT NULL,
  PRIMARY KEY (cod_servico)
);

CREATE TABLE veiculos (
  placa            varchar(9) NOT NULL,
  nom_veiculo      varchar(10) NOT NULL,
  modelo           varchar(10) DEFAULT NULL,
  servico          varchar(45) NOT NULL,
  PRIMARY KEY (placa)
);