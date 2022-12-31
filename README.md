Hola buen dia
Soy Jose Miguel Nuñez Bernal, Gracias por la atencion.


## Instalacion

Para la instalacion y correcto funcionamiento seguir los siguientes pasos:

1. Cambiar el nombre de la carpeta descargada a "Reto Sofka Naves" (sin las comillas, basicamente quitarle los guiones agregados por github)
2. Mover la carpeta y ubicarla en el disco C
3. Dentro de la carpeta se encuentra un archivo sql, el cual debe usarse para importar la base de datos con la cual opera el programa.
4. Abrir la carpeta con Netbeans o el IDE de su preferencia
5. Cambiar la contraseña de mySQL, la cual esta ubicada en modelos.Database en una variable llamada password.
6. En ocasiones es posible que netbeans detecte errores en las vistas, esto es por una libreria de JavaSwing que maneja el absolute Layout, para arreglar eso puedes seguir los pasos de este video de 1 minuto: https://www.youtube.com/watch?v=B0prYbtdKNI&t=50s. en el cual agregan esta libreria al proyecto. 
7. Por ultimo ejecutar el archivo principal.java ubicado en el paquete vistas.

## Herramientas

Para este proyecto se utilizo:
1. Lenguaje de programacion Java
2. JDK 16
3. Java Swing
4. MySQL Workbench
5. Netbeans 14

## Interfaz grafica

Se realizo una interfaz grafica en Java Swing.

![Pagina principal](https://res.cloudinary.com/drwxceogq/image/upload/v1672449491/samples/pagina_principal_xsptc2.jpg)

## Base de datos

La base de datos es bastante sencilla, consta de 3 tablas una para cada tipo de nave.

### Tabla Lanzadera

![Tabla lanzadera](https://res.cloudinary.com/drwxceogq/image/upload/v1672448018/samples/Tabla_lanzadera_sjmgfz.jpg)

Cuenta con los atributos:

1. Nombre: Nombre de la nave
2. Peso: Peso de la nave
3. Empuje: Empuje de la nave en toneladas
4. Capacidad: Capacidad de carga de la nave en toneladas
5. Altura: Altura de la nave en metros
6. Alcance: Alcance de la nave en kilometros
7. Potencia: Potencia de la nave en caballos de fuerza
8. Combustible: Tipo de combustible de la nave
9. Pais: Pais que diseño y contruyo la nave

### Tabla Tripuladas

![Tabla Tripuladas](https://res.cloudinary.com/drwxceogq/image/upload/v1672448662/samples/Tabla_tripuladas_xn7ame.jpg)

Cuenta con los atributos:

1. Nombre: Nombre de la nave
2. Finalidad de uso: Proposito de la nave
3. Peso: Peso de la nave
4. Distancia de orbita: Distancia a la cual orbita la nave en kilometros
5. Capacidad: Numero de personas que pueden abordar la nave
6. Pais: Pais que diseño y contruyo la nave

### Tabla no Tripuladas

![Tabla no Tripuladas](https://res.cloudinary.com/drwxceogq/image/upload/v1672449060/samples/no_Tripuladas_wkvsiw.jpg)

Cuenta con los atributos:

1. Nombre: Nombre de la nave
2. Cantidad de motores: Cantidad de motores de la nave
3. Empuje: Empuje de la nave en toneladas
4. Mision: Mision de la nave
5. Combustible: Tipo de combustible de la nave
6. Pais: Pais que diseño y contruyo la nave

## Video

Se adjunta video explicativo.

https://www.youtube.com/watch?v=uWlLI5fNIe4

