create database ac2_bd;
drop database if exists ac2_bd;
use ac2_bd;

create table Produto (
id				int 	auto_increment primary key,
nome_produto    varchar (40),
preco_custo		decimal(0,2),
preco_venda		decimal(0,2),
lucro			decimal(0,2),
tamanho 		varchar(5),
marca 			varchar(40),
id_fornecedor 	int,

foreign key (id_fornecedor) references Fornecedor(id)
);

create table Fornecedor (
id 					int 	auto_increment primary key,
nome_fornecedor 	varchar(50)	,
email 				varchar(50),
telefone 			int
);



create table Cliente (
id 				int auto_increment primary key,
nome_cliente 	varchar (50),
cpf				varchar (11),
email 			varchar (50),
endereco		varchar (110),
estado			varchar (50),
cidade			varchar (2),
avaliacao		int 
);


create table Venda (
id int auto_increment primary key,
id_produto int,
id_cliente int,

foreign key (id_produto) references Produto(id),
foreign key (id_cliente) references Cliente(id)
);