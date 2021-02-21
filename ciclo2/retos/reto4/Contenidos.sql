create table Contenidos (
	con_id int auto_increment primary key,
    con_titulo varchar(50) not null,
    con_tipo varchar(20) not null
);

insert into Contenidos (con_titulo, con_tipo)
	values
		("Los Vengadores", "pelicula"),
        ("Interestelar", "pelicula"),
        ("El viaje de Chihiro", "pelicula"),
        ("Parasitos", "pelicula"),
        ("Mas alla de los sueños", "pelicula"),
        ("The walking dead", "serie"),
        ("Viaje a las estrellas: la serie original", "serie"),
        ("Glow", "serie"),
        ("La casa de papel", "serie"), 
        ("Friends",  "serie"),
        ("Arrow",  "serie"),
        ("The big bang theory", "serie"),
        ("Vikingos", "serie");






