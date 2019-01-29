CREATE SEQUENCE usuario_seq;

CREATE TABLE usuario (
	codigo BIGINT PRIMARY KEY DEFAULT NEXTVAL ('usuario_seq'),
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(150) NOT NULL
) ;

CREATE SEQUENCE permissao_seq;

CREATE TABLE permissao (
	codigo BIGINT PRIMARY KEY DEFAULT NEXTVAL ('permissao_seq'),
	descricao VARCHAR(50) NOT NULL
) ;

CREATE TABLE usuario_permissao (
	codigo_usuario BIGINT NOT NULL,
	codigo_permissao BIGINT NOT NULL,
	PRIMARY KEY (codigo_usuario, codigo_permissao),
	FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo),
	FOREIGN KEY (codigo_permissao) REFERENCES permissao(codigo)
) ;

INSERT INTO usuario (codigo, nome, email, senha) values (1, 'Administrador', 'admin@algamoney.com', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');
INSERT INTO usuario (codigo, nome, email, senha) values (2, 'Glauter Santos', 'glauter.santos@trf1.jus.br', '$2a$10$Zc3w6HyuPOPXamaMhh.PQOXvDnEsadztbfi6/RyZWJDzimE8WQjaq');

INSERT INTO permissao (codigo, descricao) values (1, 'ROLE_CADASTRAR_CATEGORIA');
INSERT INTO permissao (codigo, descricao) values (2, 'ROLE_PESQUISAR_CATEGORIA');

INSERT INTO permissao (codigo, descricao) values (3, 'ROLE_CADASTRAR_PESSOA');
INSERT INTO permissao (codigo, descricao) values (4, 'ROLE_REMOVER_PESSOA');
INSERT INTO permissao (codigo, descricao) values (5, 'ROLE_PESQUISAR_PESSOA');

INSERT INTO permissao (codigo, descricao) values (6, 'ROLE_CADASTRAR_LANCAMENTO');
INSERT INTO permissao (codigo, descricao) values (7, 'ROLE_REMOVER_LANCAMENTO');
INSERT INTO permissao (codigo, descricao) values (8, 'ROLE_PESQUISAR_LANCAMENTO');


INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 1);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 2);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 3);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 4);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 5);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 6);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 7);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 8);

INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 2);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 5);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 8);
INSERT INTO usuario (codigo, nome, email, senha) values (3, 'Administrador', 'admin@trf1.jus.br', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');

INSERT INTO permissao (codigo, descricao) values (9, 'ROLE_CADASTRAR_DEMANDA');
INSERT INTO permissao (codigo, descricao) values (10, 'ROLE_REMOVER_DEMANDA');
INSERT INTO permissao (codigo, descricao) values (11, 'ROLE_PESQUISAR_DEMANDA');

INSERT INTO permissao (codigo, descricao) values (12, 'ROLE_CADASTRAR_SISTEMA');
INSERT INTO permissao (codigo, descricao) values (13, 'ROLE_REMOVER_SISTEMA');
INSERT INTO permissao (codigo, descricao) values (14, 'ROLE_PESQUISAR_SISTEMA');

INSERT INTO permissao (codigo, descricao) values (15, 'ROLE_CADASTRAR_LOTE');
INSERT INTO permissao (codigo, descricao) values (16, 'ROLE_REMOVER_LOTE');
INSERT INTO permissao (codigo, descricao) values (17, 'ROLE_PESQUISAR_LOTE');

INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3, 3);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3, 4);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3, 5);

INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3, 9);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3, 10);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,11);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,12);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,13);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,14);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,15);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,16);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (3,17);