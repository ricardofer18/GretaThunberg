package calculadora;
import java.util.Scanner;

public class Suma {
    
    Calculadora cantidad = new Calculadora();
    int suma;
    public void suma(int cantidades) {
        for(int i = 1; i <=cantidades; i++){
            System.out.println("Ingrese un número");
            Scanner numeros = new Scanner(System.in);
            int numero = numeros.nextInt();
            suma = suma + numero;
        }
        System.out.println("El resultado es: "+suma);
    }
        
}
