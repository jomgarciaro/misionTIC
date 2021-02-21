-- 5.1 Mostrar la información del título de todas las películas y series ordenadas alfabéticamente.
select 'Consulta 1';
select con_titulo 
from Contenidos
order by con_titulo;

-- 5.2 Mostrar la información de las películas (título, resumen, año) que se han estrenado posteriormente al año 2000, ordenadas por título
select 'Consulta 2';
select pel_titulo, pel_resumen, pel_ano
from Peliculas
where pel_ano > 2000
order by pel_titulo;

-- 5.3 Mostrar los títulos de películas dirigidas por el director Vincent Ward 
select 'Consulta 3';
select pel_titulo
from Peliculas
where dir_nombre = "Vincent Ward";

-- 5.4  Mostrar la información de las series y películas ( solo los títulos) que ha visto un usuario con alias "lucky", ordenadas por título
select 'Consulta 4';
select tra_contenido
from Transmisiones
where usu_alias = "lucky"
order by tra_contenido;

-- 5.5 Mostrar la información de los usuarios (alias y nombre y apellidos) que han visto la película "Interestelar" ordenados alfabéticamente
select 'Consulta 5';
select Usuarios.usu_alias, usu_nombre, usu_apellido
from Transmisiones
join Usuarios
on Usuarios.usu_alias = Transmisiones.usu_alias
where tra_contenido = "Interestelar";

-- 5.6 Mostrar cuantas películas se han estrenado después del año 2000
select 'Consulta 6';
select count(pel_titulo)
from peliculas
where pel_ano > 2000;