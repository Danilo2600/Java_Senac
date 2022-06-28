CREATE DATABASE db_projeto;

USE db_projeto;

CREATE TABLE tb_respostas(
id INT PRIMARY KEY AUTO_INCREMENT,
resposta VARCHAR(80)
);

INSERT INTO tb_respostas (resposta) VALUES ('América');
INSERT INTO tb_respostas (resposta) VALUES ('Kim Jong-un') ;
INSERT INTO tb_respostas (resposta) VALUES ('Central park') ;
INSERT INTO tb_respostas (resposta) VALUES ('Telescopio James Webb') ;
INSERT INTO tb_respostas (resposta) VALUES ('Burj khalifa');
INSERT INTO tb_respostas (resposta) VALUES ('Handpan');
