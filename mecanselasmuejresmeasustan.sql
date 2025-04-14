delimiter //
create function buscarUsuario(idUsu int, nombre text) returns int deterministic
begin
		declare cantOrds int default 0;
		select count(idPedido) into cantOrds from pedidos where Usuario_codigo = idUsu;
		return cantOrds;
end//
delimiter ;
select buscarUsuario(1, "Ernestito");

create view Vista as select

/*ej chatgtp*/
 
