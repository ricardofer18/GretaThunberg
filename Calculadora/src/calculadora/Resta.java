package calculadora;
import java.util.Scanner;

public class Resta {
    
    public void restar_num(int cantidad) {
        System.out.println("Ingrese un número");
        Scanner rest = new Scanner(System.in);
        int resta = rest.nextInt();
        for(int i = 2; i <= cantidad; i++) {
            System.out.println("Ingrese un número");
            Scanner numeros = new Scanner(System.in);
            int numero = numeros.nextInt();
            resta = resta - numero;
        }
        System.out.println("El resultado es: "+resta);
    }
    
}
