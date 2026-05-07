import java.util.Scanner;

public class main {
    
    // Método de saludo
    public static void saludarUsuario() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }
    
    // TU MÉTODO: Pedir dos números enteros no negativos
    public static int[] pedirNumeros() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        
        System.out.println("\n--- Ingreso de números ---");
        
        System.out.print("Ingrese el primer número entero no negativo (a): ");
        a = scanner.nextInt();
        
        while (a < 0) {
            System.out.print("Error: El número no puede ser negativo. Ingrese nuevamente (a): ");
            a = scanner.nextInt();
        }
        
        System.out.print("Ingrese el segundo número entero no negativo (b): ");
        b = scanner.nextInt();
        
        while (b < 0) {
            System.out.print("Error: El número no puede ser negativo. Ingrese nuevamente (b): ");
            b = scanner.nextInt();
        }
        
        return new int[]{a, b};
    }
    
    // Método de suma con validación
    public static int suma(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números deben ser no negativos");
        }
        return a + b;
    }
    
    // Método principal
    public static void main(String[] args) {
        saludarUsuario();
        int[] numeros = pedirNumeros();
        int a = numeros[0];
        int b = numeros[1];
        
        System.out.println("\n--- Números ingresados ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int resultado = suma(a, b);
        System.out.println("\n--- Resultado ---");
        System.out.println("La suma es: " + resultado);
    }
}