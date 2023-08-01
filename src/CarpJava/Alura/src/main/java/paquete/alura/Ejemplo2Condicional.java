package paquete.alura.bases;
import java.util.Scanner;
/*A Juan le gustaría crear un programa sobre Impuesto sobre la Renta (IR), 
para ello, verificó las reglas de impuestos. Encontró en el sitio web de impuestos que:

De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.*/
public class Ejemplo2Condicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("**********Programa para calcular I. S. R **********");
         System.out.println("Ingrese su salario actual: ");
         double salario = input.nextDouble();
         
         double isr;
         
         boolean categoria1 = salario >= 1900.0 && salario <= 2800.0;
         boolean categoria2 = salario >= 2800.1 && salario <= 3751.0;
         boolean categoria3 = salario >= 3751.1 && salario <= 4664.00;
         
         if(categoria1){
             isr =salario * 0.075;
             System.out.println("ISR: "+isr+", Deducible: $142");
         }
         else if(categoria2){
             isr = salario * 0.15;
             System.out.println("ISR: "+isr+", Deducible: $350");
         }
         else if(categoria3){
             isr = salario * 0.225;
             System.out.println("ISR: "+isr+", Deducible: 636");
         }
         else{
             System.out.println("Lo sentimos, su salario no se encuentra entre los rangos establecidos");
         }
    } 
}
