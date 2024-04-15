import java.util.Scanner;

public class Preg04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese sus ganancias:");
        double ganancias = scanner.nextDouble();
        
        double donativo = calcularDonativo(ganancias);
        
        System.out.println("El donativo que Pablito debe entregar es: S/." + donativo);
        
        scanner.close();
    }
    
    public static double calcularDonativo(double ganancias) {
        if (ganancias <= 1000) {
            return ganancias * 0.05;
        } else if (ganancias <= 1500) {
            return 1000 * 0.05 + (ganancias - 1000) * 0.07;
        } else if (ganancias <= 2000) {
            return 1000 * 0.05 + 500 * 0.07 + (ganancias - 1500) * 0.08;
        } else if (ganancias <= 5000) {
            return 1000 * 0.05 + 500 * 0.07 + 500 * 0.08 + (ganancias - 2000) * 0.10;
        } else {
            return 1000 * 0.05 + 500 * 0.07 + 500 * 0.08 + 3000 * 0.10 + (ganancias - 5000) * 0.15;
        }
    }
}
