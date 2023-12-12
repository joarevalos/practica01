
//Programa que suma y multiplica numeros
import java.util.Scanner;

public class SumaProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.println("Resultado la suma es " + suma);
        System.out.println("Resultado la multiplicacion es " + producto);
        scanner.close();
    }
}
