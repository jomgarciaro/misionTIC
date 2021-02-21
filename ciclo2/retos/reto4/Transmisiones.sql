create table Transmisiones (
	tra_id int primary key auto_increment not null,
    usu_alias varchar(50) not null,
    tra_contenido varchar(50) not null,
    tra_fecha datetime not null,
    foreign key (usu_alias) references Usuarios(usu_alias)
);

insert into Transmisiones (usu_alias, tra_contenido, tra_fecha)
	values
		("lucky", "Los Vengadores", '2017-10-25 20:00:00'),
        ("lucky", "Parasitos", '2019-03-15 18:30:00'),
        ("lucky", "La casa de papel", '2019-05-20 20:30:00'),
        ("malopez", "Los Vengadores", '2018-05-20 20:30:00'),
        ("malopez", "La casa de papel", '2020-01-20 20:30:00'),
        ("diva", "Interestelar", '2019-05-20 20:30:00'),
        ("diva", "El viaje de Chihiro", '2018-06-22 21:30:00'),
        ("diva", "The walking dead", '2020-03-17 15:30:20'),
        ("dreamer", "The walking dead", '2020-03-17 15:30:20'),
        ("dreamer", "Viaje a las estrellas: la serie original", '2020-04-10 18:30:20'),
		("ninja", "Glow", '2020-02-17 20:30:20'),
        ("ninja", "La casa de papel", '2020-02-20 16:30:20'),
        ("ninja", "Arrow", '2020-03-27 18:30:20'),
        ("rose", "Friends", '2020-03-20 21:30:20'),
        ("green", "Interestelar", '2020-01-10 17:30:20'),
        ("green", "Parasitos", '2020-02-15 20:30:20'),
        ("green", "Mas alla de los sueños", '2020-03-17 18:30:20');











