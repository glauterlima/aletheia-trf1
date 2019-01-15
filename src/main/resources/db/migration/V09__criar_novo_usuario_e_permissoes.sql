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