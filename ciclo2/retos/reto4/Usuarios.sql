create table Usuarios (
	usu_alias varchar(50) primary key not null,
    usu_nombre varchar(50) not null,
    usu_apellido varchar(50) not null,
    usu_email varchar(50) not null,
    usu_contrasena varchar(50) not null,
    usu_celular varchar(20) not null
);

insert into Usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_contrasena, usu_celular)
	values
		("lucky", "Pedro", "Perez", "pedroperez@yahoo.es", "pedroperez", "12345678901"),
        ("malopez", "Maria", "Lopez", "marialopez@yahoo.es", "marialopez", "12345678902"),
        ("diva", "Ana", "Diaz", "anadiaz@yahoo.es", "anadiaz", "12345678903"),
        ("dreamer", "Luis", "Rojas", "luisrojas@yahoo.es", "luisrojas", "12345678904"),
        ("ninja", "Andres", "Cruz", "andrescruz@yahoo.es", "andrescruz", "12345678905"),
        ("neon", "Nelson", "Ruiz", "nelsonruiz@yahoo.es", "nelsonruiz", "12345678906"),
        ("rose", "Claudia", "Mendez", "claudiamendez@yahoo.es", "claudiamendez", "12345678907"),
        ("green", "Jorge", "Rodriguez", "jorgerodriguez@yahoo.es", "jorgerodriguez", "12345678908");
    