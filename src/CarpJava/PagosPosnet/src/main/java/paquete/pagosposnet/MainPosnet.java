package paquete.pagosposnet;

public class MainPosnet {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p1 = new Persona("05461037-8", "Walter", "Pleitez", "6431-9119", "walter53torrez@outlook.com");
        TarjetaCredito card1 = new TarjetaCredito("B.A.", "00300937", 15000, p1, EntidadFinanciera.BIRZA);
        
        System.out.println("Tarjeta antes del pago: "+ card1);
        
        System.out.println("Ticket tras pagar");
        Ticket ticketGenerado = posnet.efectuarPago(card1, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("tarjeta despues del pago: "+card1);
        
    }
}
