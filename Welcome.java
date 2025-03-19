import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        //Se crea el scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos la información al usuario
        System.out.println("¿Cuál es tu nombre?");

        //Se recoge el dato del usuario y se lo almacena en una variable
        String name = scanner.nextLine();

        //Imprimimos el resultado
        System.out.println("Hola " + name + ", bienvenida al scanner de Java");

        scanner.close();

        //Corre tu programa y mira el resultado
    }
}
