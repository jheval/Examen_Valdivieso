import java.util.Scanner;

public class Preg02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        
        int suma = calcularSumaNumerosNaturales(n);
        
        System.out.println("La suma de los " + n + " primeros números naturales es: " + suma);
        
        scanner.close();
    }
    
    public static int calcularSumaNumerosNaturales(int n) {
        // Fórmula de la suma de los n primeros números naturales: suma = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}