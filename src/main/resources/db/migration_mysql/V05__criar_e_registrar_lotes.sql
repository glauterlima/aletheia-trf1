CREATE TABLE lote (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO lote (nome) values ('JANEIRO2018');
INSERT INTO lote (nome) values ('OUTUBRO2017');
INSERT INTO lote (nome) values ('NOVEMBRO2017');