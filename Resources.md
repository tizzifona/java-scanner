# Recursos Java 

## Scanner

Muchas veces necesitamos información del usuario. Para poder recoger esos datos, Java nos proporciona la clase Scanner, con la cuál podremos introducir la información a través de la terminal.

Seguiremos los siguientes pasos:

1. Vamos a instanciar la clase Scanner para obtener un objeto.

Scanner scanner = new Scanner(System.in);

La variable scanner, es de tipo clase Scanner y dentro está el objeto creado a través de la palabra reservada new, que recibe como parámetro el dato ingresado por terminal.  

2. Debemos importar le paquete donde se encuentra Scanner (normalmente se importa automáticamente al llamar a la clase Scanner) lo hace desde el paquete util

import java.util.Scanner;

3. Recogeremos el dato dentro de una variable, según el tipo que necesitemos.

String name = scanner.nextLine();

Llamamos a la variable scanner y con el método nativo nextLine() recogemos el dato y lo convierte a String.

Para cada tipo de dato existe un método diferente, por ejemplo para convertir un dato a entero usamos nextInt()

4. Podremos usar esa variable como queramos dentro de nuestro programa.

* User Input
https://www.w3schools.com/java/java_user_input.asp

5. Cerramos el scanner

scan.close();

## The Next Line Trap

Cuando se mezclan métodos para leer diferentes tipos de datos, como nextInt() y nextLine() ocurre un problema. 

Después de un nextInt() nextDouble() nextLong(), next() y similares, el programa deja una nueva línea que es interpretada como un caracter vacío ('\n'). Si lee un nextLine() después de esto métodos, el valor de ese String estará vacío.

* The Next Line Trap explication
https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/