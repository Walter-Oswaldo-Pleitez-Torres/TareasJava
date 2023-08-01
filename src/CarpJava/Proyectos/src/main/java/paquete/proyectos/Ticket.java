package paquete.proyectos;

public class Ticket {
    static int contador;
    int numero;
    String fecha;
    String duiPersona;
    
    public Ticket(String fecha, String duiPersona){
        contador++;
        this.numero = contador;
        this.fecha = fecha;
        this.duiPersona = duiPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + 
                "numero=" + numero + 
                ", fecha=" + fecha + 
                ", duiPersona=" + duiPersona + 
                '}';
    }
    
}
