package ejercicio3;

public class MayorTres {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 25;
        int numero3 = 15;

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("El número mayor es: " + numero3);
        }
    }
}