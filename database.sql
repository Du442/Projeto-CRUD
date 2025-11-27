CREATE DATABASE IF NOT EXISTS estoque_db;

USE estoque_db;

CREATE TABLE IF NOT EXISTS produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(100) NOT NULL,
    descricao_produto TEXT,
    quantidade_estoque INT NOT NULL DEFAULT 0,
    preco DECIMAL(10, 2) NOT NULL,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
	data_alteracao DATETIME NULL

);
