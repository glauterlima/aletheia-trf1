CREATE SEQUENCE pessoa_seq;

CREATE TABLE pessoa (
	codigo BIGINT PRIMARY KEY DEFAULT NEXTVAL ('pessoa_seq'),
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30),
	ativo BOOLEAN NOT NULL,
	matricula VARCHAR(20) not null,
	cargo VARCHAR(20) not null,
	email VARCHAR(50) not null,
	telefone VARCHAR(20) not null
) ;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('João Silva', 'Rua do Abacaxi', '10', null, 'Brasil', '38.400-121', 'Uberlândia', 'MG', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Maria Rita', 'Rua do Sabiá', '110', 'Apto 101', 'Colina', '11.400-121', 'Ribeirão Preto', 'SP', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Pedro Santos', 'Rua da Bateria', '23', null, 'Morumbi', '54.212-121', 'Goiânia', 'GO', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Ricardo Pereira', 'Rua do Motorista', '123', 'Apto 302', 'Aparecida', '38.400-121', 'Salvador', 'BA', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Josué Mariano', 'Av Rio Branco', '321', null, 'Jardins', '56.400-121', 'Natal', 'RN', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Pedro Barbosa', 'Av Brasil', '100', null, 'Tubalina', '77.400-121', 'Porto Alegre', 'RS', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Henrique Medeiros', 'Rua do Sapo', '1120', 'Apto 201', 'Centro', '12.400-121', 'Rio de Janeiro', 'RJ', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Carlos Santana', 'Rua da Manga', '433', null, 'Centro', '31.400-121', 'Belo Horizonte', 'MG', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Leonardo Oliveira', 'Rua do Músico', '566', null, 'Segismundo Pereira', '38.400-001', 'Uberlândia', 'MG', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo, matricula, cargo, email, telefone) values ('Isabela Martins', 'Rua da Terra', '1233', 'Apto 10', 'Vigilato', '99.400-121', 'Manaus', 'AM', true, 'TR301001', 'Analista Judiciário', 'exemplo@trf1.jus.br', '6198988787');


