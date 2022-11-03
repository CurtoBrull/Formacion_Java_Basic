insert into EMPLEADO (id, nombre, apellidos)
	select 1, 'Rocío', 'De la O' from dual where not exists (select 1 from empleado where id = 1);

insert into EMPLEADO (id, nombre, apellidos)
	select 2, 'Alberto', 'Del Monte' from dual where not exists (select 1 from empleado where id = 2);


--insert into EMPLEADO (id, nombre, apellidos) values (1, 'Juan', 'Pérez');
--insert into EMPLEADO (id, nombre, apellidos) values (2, 'María', 'García');
--insert into EMPLEADO (id, nombre, apellidos) values (3, 'Pedro', 'González');