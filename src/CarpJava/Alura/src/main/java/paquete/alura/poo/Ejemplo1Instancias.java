package paquete.alura.poo;

public class Ejemplo1Instancias {//Objeto Cuenta
    double saldo =0;
    int agencia;
    int numero;
    String titular;
    
    public void depositar(double monto){
        saldo += monto;
    }
    public boolean retirar(double monto){
        if(saldo >= monto){
            System.out.println("Retiro exitoso.");
            System.out.println("Se retiraron: "+monto);
            saldo -=monto;
            System.out.println("Su saldo actual es: "+saldo);
            return true;
        }
        else{
            System.out.println("No se pudo realizar la transaccion");
            return false;
        }   
    }
    public boolean transferir(double cantidad, Ejemplo1Instancias cuentaDestino){
        if(saldo >= cantidad){
            System.out.println("La transferencia fue exitosa");
            cuentaDestino.depositar(cantidad);
            this.saldo = saldo - cantidad;
            
            System.out.println("Se transfirieron: $"+cantidad);
            System.out.println("Su saldo actual es: "+ this.saldo);
            return true;
        }else{
            System.out.println("No es posible realizar la transaccion");
            return false;
        }
    }
    
}
