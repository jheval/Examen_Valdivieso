import java.util.Scanner;

public class Preg01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la primera variable:");
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el valor de la segunda variable:");
        int b = scanner.nextInt();
        
        System.out.println("Valores antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        intercambiarVariables(a, b);
        
        System.out.println("Valores después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        scanner.close();
    }
    
    public static void intercambiarVariables(int a, int b) {
        // Se utiliza una variable temporal para almacenar el valor de a
        int temp = a;
        // Se asigna el valor de b a a
        a = b;
        // Se asigna el valor almacenado en temp (valor original de a) a b
        b = temp;
    }
}