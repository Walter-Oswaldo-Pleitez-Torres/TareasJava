package paquete.pagosposnet;

public class Posnet {
        public static final double RECARGO_POR_CUOTA = 0.03;
        public static final int CANT_MIN_CUOTAS = 1;
        public static final int CANT_MAX_CUOTAS = 6;
        
        Ticket efectuarPago(TarjetaCredito tarjeta, double montoAbonar, int cantCuotas){
            Ticket elTicket = null;
            
            if(datosValidos(tarjeta, montoAbonar, cantCuotas)){
                double montoFinal = montoAbonar + montoAbonar * recargoSegunCuotas(cantCuotas);
                if(tarjeta.tieneSaldooDisponible(montoFinal)){
                    tarjeta.descontar(montoFinal);
                    String nomApe = tarjeta.nombreCompletoTitular();
                    double montoPorCuota = montoFinal / cantCuotas;
                    elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
                }
            }
         return elTicket;   
        }
        
        private boolean datosValidos(TarjetaCredito tarjeta, double monto, int cant){
            boolean esTarjetaValida = tarjeta != null;
            boolean esMontoValido = monto > 0;
            boolean cantCuotasValidas = cant >= CANT_MIN_CUOTAS && cant <= CANT_MAX_CUOTAS;
            
            return esTarjetaValida && esMontoValido && cantCuotasValidas;
        }
        
        private double recargoSegunCuotas(int cantCuotas){
            return (cantCuotas - 1) * RECARGO_POR_CUOTA;
        } 
}
