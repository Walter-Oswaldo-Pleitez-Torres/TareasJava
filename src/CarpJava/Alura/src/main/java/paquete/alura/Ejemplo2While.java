package paquete.alura.bases;

public class Ejemplo2While {
    public static void main(String[] args) {
        int contador=0;
        int total=0;
        
        while(contador<=10){
            total+=contador;
            System.out.println("El contador es: "+contador+" y el total es: "+total);
            contador++;
        }
    }
}
