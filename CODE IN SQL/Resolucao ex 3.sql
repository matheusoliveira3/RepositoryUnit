/* Crie uma view que mostra todos no produtos e seus respectivos fornecedores e marcas.
*/
create or replace view ex3 as
select prd_id, prd_nome, mrc_nome, frn_nome
		from produtos 
			left join produto_fornecedor   on produtos.prd_id 		  = produto_fornecedor.pf_prod_id
			left join fornecedores 		   on fornecedores.frn_id     = produto_fornecedor.pf_forn_id
            left join marcas			   on produtos.prd_marca_id   = marcas.mrc_id;