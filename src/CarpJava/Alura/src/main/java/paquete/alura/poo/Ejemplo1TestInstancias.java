package paquete.alura.poo;

public class Ejemplo1TestInstancias {
    public static void main(String[] args) {
    Ejemplo1Instancias cuenta1 = new Ejemplo1Instancias();
    
        System.out.println("CUENTAS INSTANCIADAS CON MISMO ESPACIO DE MEMORIA/REFERENCIA");
    cuenta1.saldo = 100;
    System.out.println("Saldo Cuenta 1 = " + cuenta1.saldo);
    Ejemplo1Instancias cuenta2 = cuenta1;
    
    System.out.println("*********************************************");
    
    cuenta2.saldo = 200;
    System.out.println("Saldo Cuenta 1 = " + cuenta1.saldo + " ***** Saldo Cuenta 2 = " + cuenta2.saldo);
    
    cuenta2.saldo += 600;
        System.out.println("Saldo Cuenta 1 = " + cuenta1.saldo + " ***** Saldo Cuenta 2 = " + cuenta2.saldo);
        
    System.out.println("*********************************************");    
    
        //Muestra que ambas cuentas estan referenciadas a un mismo espacio de memoria
        System.out.println("COMPROBANDO que sea la misma REFERENCIA:");
        System.out.println("Direccion cuenta 1: "+cuenta1);
        System.out.println("Direccion cuenta 2: "+cuenta2);
        
        System.out.println("*********************************************");
        
        System.out.println("CUENTAS INSTANCIADAS CON DIFERENTE ESPACIO DE MEMORIA/REFERENCIA");
        Ejemplo1Instancias cuentaUno = new Ejemplo1Instancias();
        Ejemplo1Instancias cuentaDos = new Ejemplo1Instancias();
        
        cuentaUno.saldo = 100;
        System.out.println("Saldo Cuenta 1 = " + cuentaUno.saldo);
        
        cuentaDos.saldo = 200;
        System.out.println("Saldo Cuenta 1 = " + cuentaUno.saldo + " ***** Saldo Cuenta 2 = " + cuentaDos.saldo);
    
        cuentaDos.saldo += 600;
        System.out.println("Saldo Cuenta 1 = " + cuentaUno.saldo + " ***** Saldo Cuenta 2 = " + cuentaDos.saldo);
        
        System.out.println("*********************************************");
        
        System.out.println("COMPROBANDO que sean diferentes REFERENCIAS:");
        System.out.println("Direccion cuentaUno: "+cuentaUno);
        System.out.println("Direccion cuentaDos: "+cuentaDos);
    }
}
