package tareanumeros;

import java.util.Scanner;

public class NumerosOblongos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, Contador = 0;

        System.out.println("Ingrese el numero que desea saber si es oblongo: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 10; j++) {
                //System.out.println("Tabla del: "+i+" factor "+j);
                if ((i * j) == numero && ((i - j == 1) || (j - i == 1))) {
                    System.out.println("Los factores: " + i + " X " + j + " hacen al numero " + numero + " un Oblongo");
                    Contador++;
                }
            }
        }
        if (Contador == 0) {
                    System.out.println("El numero ingresado no es un Oblongo");
            }

    }
}
