/* Crie uma view que mostra todos os produtos com estoque abaixo do mínimo. */

create or replace view ex4 as
	select prd_nome, prd_qtd_estoque, prd_estoque_mim
		from produtos
			where prd_qtd_estoque < prd_estoque_mim;
