CREATE SEQUENCE lote_seq;

CREATE TABLE lote (
	codigo BIGINT PRIMARY KEY DEFAULT NEXTVAL ('lote_seq'),
	nome VARCHAR(50) NOT NULL
) ;

INSERT INTO lote (nome) values ('OUTUBRO2017');
INSERT INTO lote (nome) values ('NOVEMBRO2017');
INSERT INTO lote (nome) values ('DEZEMBRO2017');
INSERT INTO lote (nome) values ('JANEIRO2018');
INSERT INTO lote (nome) values ('FEVEREIRO2018');
INSERT INTO lote (nome) values ('MARCO2018');
INSERT INTO lote (nome) values ('ABRIL2018');
INSERT INTO lote (nome) values ('MAIO2018');
INSERT INTO lote (nome) values ('JUNHO2018');
INSERT INTO lote (nome) values ('JULHO2018');
INSERT INTO lote (nome) values ('AGOSTO2018');
INSERT INTO lote (nome) values ('SETEMBRO2018');
INSERT INTO lote (nome) values ('OUTUBRO2018');
INSERT INTO lote (nome) values ('NOVEMBRO2018');
INSERT INTO lote (nome) values ('DEZEMBRO2018');
INSERT INTO lote (nome) values ('JANEIRO2019');
INSERT INTO lote (nome) values ('FEVEREIRO2019');
INSERT INTO lote (nome) values ('MARCO2019');
INSERT INTO lote (nome) values ('ABRIL2019');
INSERT INTO lote (nome) values ('MAIO2019');
INSERT INTO lote (nome) values ('JUNHO2019');
INSERT INTO lote (nome) values ('JULHO2019');
INSERT INTO lote (nome) values ('AGOSTO2019');
INSERT INTO lote (nome) values ('SETEMBRO2019');
INSERT INTO lote (nome) values ('OUTUBRO2019');
INSERT INTO lote (nome) values ('NOVEMBRO2019');
INSERT INTO lote (nome) values ('DEZEMBRO2019');