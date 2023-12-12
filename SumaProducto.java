
//Programa que suma y multiplica numeros
import java.util.Scanner;

public class SumaProducto {
    static String black = "\033[30m";
    static String red = "\033[31m";
    static String green = "\033[32m";
    static String yellow = "\033[33m";
    static String blue = "\033[34m";
    static String purple = "\033[35m";
    static String cyan = "\033[36m";
    static String white = "\033[37m";
    static String reset = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.println(green + "Resultado la suma es " + suma);
        System.out.println(yellow + "Resultado la multiplicacion es " + producto);
        scanner.close();
        System.out.println(reset);
    }
}
