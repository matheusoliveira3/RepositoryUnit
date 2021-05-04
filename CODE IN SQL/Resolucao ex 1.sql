/* Crie uma view que mostra todos no produtos e suas respectivas marcas.*/

create or replace view ex1 as
	select prd_id, prd_nome, mrc_nome
		from produtos left join marcas
			on produtos.prd_marca_id = marcas.mrc_id;
         


select * from ex1
