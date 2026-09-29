package ejercicios;

import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre);

        System.out.print("Introduce un número: ");
        double numero = teclado.nextDouble();
        System.out.println("El doble es: " + (numero * 2));

        System.out.print("Introduce otro número: ");
        double numero2 = teclado.nextDouble();
        System.out.println("El triple es: " + (numero2 * 3));

        teclado.nextLine();

        System.out.print("Introduce tu ciudad: ");
        String ciudad = teclado.nextLine();
        System.out.println("Vives en " + ciudad);

        teclado.close();
    }

}