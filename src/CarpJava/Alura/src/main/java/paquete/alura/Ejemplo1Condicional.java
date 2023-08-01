package paquete.alura;
/*DE VIDEO DE ALURA:
"Además, conocemos la idea central del paradigma orientado a objetos, que es crear 
unidades de código que combinen los datos asociados con cierta información con las 
funcionalidades aplicadas a esos datos (por ejemplo, numeroIdentidad + validación). 
Son los atributos y métodos."*/
import java.util.Scanner;

public class Ejemplo1Condicional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****Programa para condicionar acceso a un lugar*****");
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        System.out.print("Cantidad de personas: ");
        int cantidadPersonas = input.nextInt();
        
        boolean pareja = cantidadPersonas > 1;
        boolean entrar = edad >= 18;
        
        System.out.println("*****RESPUESTA*****");
        if(pareja || entrar){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Lo sentimos debe ser mayor de edad y tener acompañante");
        }
    }
}
