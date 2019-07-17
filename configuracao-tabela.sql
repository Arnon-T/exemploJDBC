create database if not exists javanoturnojdbc;

use javanoturnojdbc;

-- Criando tabela.

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sobrenome` varchar(64) DEFAULT NULL,
  `nome` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `departamento` varchar(64) DEFAULT NULL,
  `salario` DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1; -- Garante a gestão do banco de dados segundo o modelo ACID SQL: http://sqlparatodos.com.br/modelo-acid-sql/

-- Populando tabela

INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (1,'Fagundes','Felipe','felipe.fagundes@teste.com', 'DHO', 5500.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (2,'silva','Maria','maria.silva@teste.com', 'Engenharia', 7500.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (3,'Pinheiro','Susana','susana.pinheiro@teste.com', 'Jurídico', 13000.00);

INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (4,'Souza','Davi','davi.souza@teste.com', 'DHO', 12000.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (5,'Pereira','Elisa','elisa.pereira@teste.com', 'Engenharia', 5000.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (6,'Garcia','Paulo','paulo.garcia@teste.com', 'Jurídico', 10000.00);

INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (7,'Souza','Carlos','carlos.souza@teste.com', 'DHO', 5000.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (8,'Fernandes','Bill','bill.fernandes@teste.com', 'Engenharia', 5000.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (9,'Thomas','Susana','susana.thomas@teste.com', 'Jurídico', 8000.00);

INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (10,'Davi','Jonathan','jonathan.davi@teste.com', 'DHO', 4500.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (11,'Flor','Maria','maria.flor@teste.com', 'Engenharia', 6500.00);
INSERT INTO `funcionarios` (`id`,`sobrenome`,`nome`,`email`, `departamento`, `salario`) VALUES (12,'Cunha','Davi','davi.cunha@teste.com', 'Jurídico', 9000.00);