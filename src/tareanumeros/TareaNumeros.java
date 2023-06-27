package tareanumeros;

import java.util.Scanner;

public class TareaNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, Contador1=0, Contador2=0;
        int prueba1, prueba2;

        System.out.println("Bienvenid@ al programa de Primos Gemelos");
        System.out.println("Ingrese dos numeros para saber si son primos y gemelos");

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();

        for (int i = 1; i <= num1; i++) {
            if ((num1 % i) == 0) {
                System.out.println("El numero "+num1+" es divisible con: "+i);
                Contador1 = Contador1 + 1;
            }

        }
        System.out.println("**************************");
        for (int i = 1; i <= num2; i++) {
            if ((num2 % i) == 0) {
                System.out.println("El numero "+num2+" es divisible con: "+i);
                Contador2 = Contador2 + 1;
            }
        }
        System.out.println("**************************");
        
        if(Contador1 <=2 && Contador2 <= 2){
            System.out.println("El numero "+num1+" y "+num2+" Si son primos");
        }
        else if(Contador1 > 2 && Contador2 > 2){
            System.out.println("El numero "+num1+" y "+num2+" No son primos");
        }
        else if(Contador1 > 2 && Contador2 <= 2){
            System.out.println("El numero "+num1+" No es primo");
            System.out.println("El numero "+num2+" Si es primo");
        }
        else if(Contador1 <= 2 && Contador2 > 2){
            System.out.println("El numero "+num1+" Si es primo");
            System.out.println("El numero "+num2+" No es primo");
        }
        

        prueba1 = num1 - num2;
        prueba2 = num2 - num1;

        if (prueba1 == 2 || prueba2 == 2) {
            System.out.println("El numero " + num1 + " y el " + num2 + " son gemelos.");
        } else {
            System.out.println("Los numeros " + num1 + " y " + num2 + " no son gemelos");
        }

    }

}
