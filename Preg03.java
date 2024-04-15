import java.util.Scanner;

public class Preg03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de horas estacionado:");
        int horas = scanner.nextInt();
        
        double costo = calcularCosto(horas);
        
        System.out.println("El importe a pagar es: S/." + costo);
        
        scanner.close();
    }
    
    public static double calcularCosto(int horas) {
        double costoBase = 6.0;
        int horasGratis = 4;
        double costoAdicionalPorHora = 2.0;
        
        if (horas <= horasGratis) {
            return costoBase;
        } else {
            return costoBase + (horas - horasGratis) * costoAdicionalPorHora;
        }
    }
}
