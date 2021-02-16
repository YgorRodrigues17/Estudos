use clinica;

CREATE TABLE pacientes (
  id                 int NOT NULL AUTO_INCREMENT,
  cpf                varchar(20) NOT NULL,
  nome               varchar(50) NOT NULL,
  celular            varchar(20) NOT NULL,
  data_cadastro      date NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE agendamento (
  id_agendamento            int NOT NULL AUTO_INCREMENT,
  id_paciente               int NOT NULL,
  data                      date NOT NULL,
  hora varchar(10)          NOT NULL,
  especialidade             varchar(30) NOT NULL,
  medico                    varchar(30) NOT NULL,
  PRIMARY KEY (id_agendamento)
); 

