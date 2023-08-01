package paquete.alura.poo.cuentasBanco;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Persona Laura = new Persona();
        
        System.out.println("Informacion de cuenta: \n"+ cuenta1.toString());
        System.out.println("**************");
        System.out.println("Informacion de persona: \n"+ Laura.toString());
        System.out.println("**************");
        
        
        
    }
}
