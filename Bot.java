import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        String name = scanner.nextLine();
        System.out.println("Hola " + name + "! Soy FemBot. ¿De qué ciudad eres?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        String location = scanner.nextLine();
        System.out.println("He escuchado que " + location + " es un encanto. Yo nací en Oracle city.");
        System.out.println("\n¿Cuántos años tienes?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entonces me dices que tienes " + age + " años. Yo tengo 400 años.");
        double divideAge = 400.0 / age;
        System.out.println("Eso quiere decir que soy " + divideAge + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        String language = scanner.nextLine();
        //Añade una nueva línea.
        System.out.println();
        System.out.println(language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner
        scanner.close();
    }
}
