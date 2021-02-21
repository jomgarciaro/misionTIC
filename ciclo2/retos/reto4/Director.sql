create table Director (
	dir_id int primary key auto_increment not null,
    dir_nombre varchar(50) not null,
    dir_apellido varchar(50) not null,
    dir_nacionalidad varchar(50) not null
);
    
insert into Director (dir_nombre, dir_apellido, dir_nacionalidad)
	values 	("Hayo", "Miyasaki", "japones"),
			("Joss", "Whedon", "estadounidense"),
            ("Christopher", "Nolan", "estadounidense"),
            ("Bong", "Joon-ho", "coreano"),
            ("Vincent", "Ward", "neozelandes");