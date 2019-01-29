CREATE TABLE demanda (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	codigo_sistema BIGINT(20) NOT NULL,
	codigo_pessoa BIGINT(20) NOT NULL,
	codigo_lote BIGINT(20) NOT NULL,
	plataforma VARCHAR(30) NOT NULL,
	tipo VARCHAR(20) NOT NULL,
	total_pf_bruto DECIMAL(10,2) NOT NULL,
	total_pf_liquido DECIMAL(10,2) NOT NULL,
	total_pf_plataforma DECIMAL(10,2) NOT NULL,
	data DATE NOT NULL,
	status VARCHAR(20) NOT NULL,
	observacao VARCHAR(200),
	valor DECIMAL(10,2) NOT NULL,
	UNIQUE (nome),	
	FOREIGN KEY (codigo_sistema) REFERENCES sistema(codigo),
	FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo),
	FOREIGN KEY (codigo_lote) REFERENCES lote(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO demanda (nome, codigo_sistema, codigo_pessoa, codigo_lote, plataforma, tipo, total_pf_bruto, total_pf_liquido, total_pf_plataforma, data, status, observacao, valor)
 values ('SICAM-437', 1, 1, 1, 'JAVA', 'EVOLUTIVA', 12, 5.6, 1.2,  '2017-06-10', 'PENDENTE', 'foi questionado o Analista de Métricas', 89.99);
