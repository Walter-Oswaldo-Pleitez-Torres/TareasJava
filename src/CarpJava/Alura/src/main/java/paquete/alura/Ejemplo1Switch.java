package paquete.alura.bases;
import java.util.Scanner;
public class Ejemplo1Switch {
    public static void main(String[] args) {
        System.out.println("********** Programa de Dias de la Semana **********");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 - 5 para ver su dia de la suerte: ");
        int opcion = input.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Su dia de la suerte es Miercoles");
                break;
            case 2:
                System.out.println("Su dia de la suerte es Viernes");
                break;
            case 3:
                System.out.println("Su dia de la suerte es Jueves");
                break;
            case 4:
                System.out.println("Su dia de la suerte es Lunes");
                break;
            case 5:
                System.out.println("Su dia de la suerte es Martes");
                break;
            default:
                System.out.println("El dato ingresado no es valido");
        }
    }
}
