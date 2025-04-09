
/*10*/
CREATE TABLE `CancellOrders` (
  `orderNumber` int NOT NULL,
  `orderDate` date NOT NULL,
  `shippedDate` date DEFAULT NULL,
  `customerNumber` int NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`orderNumber`),
  KEY `customerNumber` (`customerNumber`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

delimiter //
create procedure getCiudadesOffices(out listaCiudades text) 
begin
	declare hayFilas boolean default 1;
	declare cancORD varchar(45) default "";
	declare nombreCursor cursor for select status from orders;
	declare continue handler for not found set hayFilas = 0;
	open nombreCursor;
	bucle:loop
		fetch nombreCursor into cancORD;
		if hayFilas = 0 then
			leave bucle;
		end if;
		set listaCiudades =  concat(listaCiudades, ",", ciudadAct);
	end loop bucle;
	close nombreCursor;
end//
delimiter ;
call getCiudadesOffices(@listaCiudades);
select @listaCiudades;