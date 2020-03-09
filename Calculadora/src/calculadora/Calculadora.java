package calculadora;
import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        
        Menu iniciar = new Menu(); 
        iniciar.inicio();               //DA LA BIENVENIDA
        
        System.out.println(" ");        //ESPACIADO
        
        Menu seleccionar = new Menu();
        seleccionar.seleccion();        //DA LAS OPCIONES A ELEGIR
        
        Scanner elegir = new Scanner(System.in);
        int eleccion = Integer.parseInt(elegir.nextLine()); //LEE LA ELECCIÓN
        
        Suma sumar = new Suma();
        Resta restar = new Resta();
        
        switch(eleccion){
            case 1: 
            System.out.println("¿Cuántos números deseas sumar?");
            Scanner pedir_cantidad = new Scanner(System.in);
            int cantidad_final = pedir_cantidad.nextInt();
            sumar.suma(cantidad_final);break; // ENTREGA RESULTADO
            case 2:
            System.out.println("¿Cuántos números deseas restar?");
            Scanner pedir_cantidad2 = new Scanner(System.in);
            int cantidad_final2 = pedir_cantidad2.nextInt();
            restar.restar_num(cantidad_final2);break; //ENTREGA RESULTADO
        }
        
    }
    
}
