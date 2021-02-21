create table Series (
	ser_id int primary key auto_increment not null,
    ser_titulo varchar(50) not null,
    ser_temporadas int not null,
    ser_episodios int not null
);

insert into Series (ser_titulo, ser_episodios, ser_temporadas)
	values
		("The walking dead", 153, 11),
        ("Viaje a las estrellas: la serie original", 80, 3),
        ("Glow", 30, 3),
        ("La casa de papel tiene", 31, 4),
        ("Friends", 236, 10),
        ("Arrow", 170, 8),
        ("The big bang theory", 279, 12),
        ("Vikingos", 79, 6);