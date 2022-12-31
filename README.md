Hola buen dia
Soy Jose Miguel Nuñez Bernal, Gracias por la atencion.


## Instalacion

Para la instalacion y correcto funcionamiento seguir los siguientes pasos:

1. Cambiar el nombre de la carpeta descargada a "Reto Sofka Naves" (sin las comillas, basicamente quitarle los guiones agregados por github)
2. Mover la carpeta y ubicarla en el disco C
3. Dentro de la carpeta se encuentra un archivo sql, el cual debe usarse para importar la base de datos con la cual opera el programa.
4. Cambiar la contraseña de mySQL, la cual esta ubicada en modelos.Database en una variable llamada password
5. Por ultimo ejecutar el archivo principal.java ubicado en el paquete vistas.

## Base de datos

La base de datos es bastante sencilla, consta de 3 tablas una para cada tipo de nave.

Tabla Lanzadera
![Tabla lanzadera](https://res.cloudinary.com/drwxceogq/image/upload/v1672448018/samples/Tabla_lanzadera_sjmgfz.jpg)

Cuenta con los atributos:

Nombre: Nombre de la nave
Peso: Peso de la nave
Empuje: Empuje de la nave en toneladas
Capacidad: Capacidad de carga de la nave en toneladas
Altura: Altura de la nave en metros
Alcance: Alcance de la nave en kilometros
Potencia: Potencia de la nave en caballos de fuerza
Pais: Pais que diseño y contruyo la nave

