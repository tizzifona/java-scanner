import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:

        //1. Nombre
        System.out.println("Por favor, introduce tu nombre:");
        String nombre = scanner.nextLine();

        //2. Apellido
        System.out.println();
        System.out.println("Por favor, introduce tu apellido:");
        String apellido = scanner.nextLine();

        //3. Nombre de usuario
        System.out.println();
        System.out.println("Por favor, introduce tu nombre de usuario:");
        String usuario = scanner.nextLine();

        //4. Contraseña
        System.out.println();
        System.out.println("Por favor, introduce tu contraseña:");
        String contraseña = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Imprimir el siguiente resultado:
        System.out.println();
        System.out.println("Hola " + nombre + " " + apellido + ", tu nombre de usuario es " + usuario + " y tu contraseña es " + contraseña + ", gracias por registrarte.");
        scanner.close();
        //Añade una nueva línea antes de mostrar la respuesta
    }
}