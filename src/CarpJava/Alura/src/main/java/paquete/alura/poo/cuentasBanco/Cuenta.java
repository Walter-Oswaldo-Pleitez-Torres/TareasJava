package paquete.alura.poo.cuentasBanco;

public class Cuenta {
    //ATRIBUTOS
    String nombre = "Ahorros";
    String numeroCuenta = "8574893";
    String tipo = "Debito";
    double monto = 25000;
    
    //METODOS GENERALES O DE CONFIGURACION
    public String cambiarNombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }
    public String cambiarTipo(String tipo){
        this.tipo = tipo;
        return this.tipo;
    }
    public String cambiarNumero(String tipo){
        this.tipo = tipo;
        return this.tipo;
    } 
    public void darNombre(){
        System.out.println("Nombre: "+this.nombre);
    } 
    public void darMonto(){
        System.out.println("Monto: "+monto);
    }
    public void numeroCuenta(String numCuenta){
        System.out.println("El numero de cuenta es: "+numCuenta);
    }
    
    //METODOS DE OPERACIONES DE CUENTA
    double depositar(double monto){
        boolean deposito = monto > 0;
        if(deposito){
            this.monto += monto;
            System.out.println("Se han depositado: $"+monto);
            System.out.println("Su saldo actual es: "+this.monto);
        }else{
            System.out.println("Su transaccion no puede realizarse.");
            System.out.println("Verifique que se hayan seguido las instrucciones correctamente.");
        }
        return this.monto;
    }
    double retirar(double erogacion){
        boolean retiro = this.monto > erogacion;
        if(retiro){
            System.out.println("Se retiraron: "+monto+" de su cuenta.");
            System.out.println("Su saldo actual es: "+ (this.monto - erogacion));
        }else{
            System.out.println("Su saldo no es suficiente para realizar el retiro.");
        }
        return this.monto;
    }
    double transferir(double monto, Cuenta cuenta){
        boolean transferencia = this.monto > monto;
        if(transferencia){
            this.monto -= monto;
            System.out.println("Se transfirieron $"+monto+" a la cuenta: "+cuenta);
            System.out.println("Su saldo actual es: $"+this.monto);
            cuenta.monto += monto;
        }else{
            System.out.println("Su transaccion no puede realizarse.");
            System.out.println("Verifique que se hayan seguido las instrucciones correctamente.");
        }
        return this.monto;
    }

    @Override
    public String toString() {
        return "Cuenta{\n" + "nombre = " + nombre + ",\n numeroCuenta = " + numeroCuenta + 
                ",\n tipo = " + tipo + ",\n monto = " + monto + '}';
    }
    
    
    
}
