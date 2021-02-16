use contados;

CREATE TABLE contatos (
  id             int NOT NULL AUTO_INCREMENT,
  nome           varchar(50) DEFAULT NULL,
  celular        varchar(20) DEFAULT NULL,
  bloqueado      tinyint(1) DEFAULT NULL,
  data           datetime  DEFAULT NULL,
  observacoes    text,
  PRIMARY KEY (id)
);