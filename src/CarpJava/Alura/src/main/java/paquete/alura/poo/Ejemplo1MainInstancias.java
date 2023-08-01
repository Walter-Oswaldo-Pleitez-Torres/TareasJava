package paquete.alura.poo;

public class Ejemplo1MainInstancias {//Objeto Cuenta
    public static void main(String[] args) {
        Ejemplo1Instancias cuenta1 = new Ejemplo1Instancias();
        Ejemplo1Instancias cuenta2 = new Ejemplo1Instancias();
        
        System.out.println("******************");
        System.out.println("El saldo de la cuenta 1 es: "+cuenta1.saldo);
        System.out.println("El saldo de la cuenta 2 es: "+cuenta2.saldo);
        
        System.out.println("******************");
        cuenta1.depositar(500);
        cuenta2.depositar(700);
        
        System.out.println("Saldo luego de deposito");
        System.out.println("El saldo de la cuenta 1 es: "+cuenta1.saldo);
        System.out.println("El saldo de la cuenta 2 es: "+cuenta2.saldo);
        
        System.out.println("******************");
        System.out.println("Saldo luego de retiro en cuenta 1");
        cuenta1.retirar(200);
        
        System.out.println("******************");
        System.out.println("Saldo despues de transferencia en cuenta 2:");
        cuenta2.transferir(100,cuenta1);
        System.out.println("Saldo cuenta 1 luego de transferencia: "+cuenta1.saldo);
        
//        Ejemplo1Instancias cuenta1 = new Ejemplo1Instancias();
//        Ejemplo1Instancias cuenta2 = new Ejemplo1Instancias();
//        
//        cuenta1.saldo = 1000;
//        cuenta2.saldo = 2000;
//        
//        System.out.println("Cuenta 1. saldo = "+ cuenta1.saldo);
//        System.out.println("Cuenta 2. saldo = "+ cuenta2.saldo);
        
    }
}
