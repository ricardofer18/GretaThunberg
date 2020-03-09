package calculadora;
public class Menu {
    String bienvenida = "Bienvenido a Calculadora";
    String texto_elegir = "Elige el tipo de cálculo que deseas (Usando números)";
    
    public void inicio() {
        System.out.println(bienvenida);
        System.out.println(texto_elegir);
        System.out.println(" ");
    }
    
    public void seleccion() {
        String[] opciones = {"1. Suma", "2. Resta"};
        for(String i: opciones){
            System.out.println(i);
        }
    }

}
