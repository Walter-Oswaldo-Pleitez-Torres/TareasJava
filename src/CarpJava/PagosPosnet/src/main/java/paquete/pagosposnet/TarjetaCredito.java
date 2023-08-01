package paquete.pagosposnet;

public class TarjetaCredito {
    private String entidadBancaria;
    private String numerotarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaCredito(String entidadBancaria, String numerotarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numerotarjeta = numerotarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    
    public boolean tieneSaldooDisponible(double monto){
        return saldo >= monto;
    }
    
    public void descontar(double monto){
        saldo -= monto;
    }
    public String nombreCompletoTitular(){
        return titular.nombreCompletoTitular();
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "entidadBancaria=" + entidadBancaria + ", numerotarjeta=" + numerotarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
}
