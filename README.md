# CRUD-MSSQL-Java
#### por Rodrigo Smith Rodrigues e Eduardo de Almeida Migueis
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Descrição
Um aplicativo simples que permite cadastrar designers de uma empresa, 
por meio de uma interface simples e ergonômica. Seu ponto forte é a 
pesquisa e exibição automática do endereço completo, por meio do CEP inserido.

## Objetivo
##### -Relembrar conceitos de desenvolvimento de aplicativos conectados a banco de dados (mssql) por meio de uma API em camadas (DBO e DAO);
##### -Praticar a conexão do aplicativo a uma API externa (no caso, a busca de um endereço completo por um CEP, afim de mostrá-lo ao usuário);
##### -Melhorar os conhecimentos no tratamento de interfaces e componentes do Java.

## Como Usar?
Para uma conexão entre o aplicativo e o banco de dados, altere a classe BDSQLServer.java, dentro de src > bd, colocando as informações
corretas do servidor e do seu banco de dados. Além disso, será necessária a criação da seguinte tabela:

```
CREATE TABLE Designers (
codigo int primary key,
nome varchar(50),
especializacao varchar(50),
email varchar(50),
telefone varchar(15),
cep char(9),
numero int,
complemento varchar(30)
)
```
## More
Copyright © Eduardo Migueis and Rodrigo Smith 2020.

Distributed under the MIT license. See LICENSE for more information
