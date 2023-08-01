package paquete.alura.bases;

public class Ejemplo1For {
    public static void main(String[] args) {
        int fila, columna;
        
        for(fila=0; fila<=10; fila++){
            for(columna=0; columna<fila; columna++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
