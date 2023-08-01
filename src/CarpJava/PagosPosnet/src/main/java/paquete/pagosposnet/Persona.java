package paquete.pagosposnet;

public class Persona {
    private String DUI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String DUI, String nombre, String apellido, String telefono, String email) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String nombreCompletoTitular(){
        return nombre + " " + apellido;
    }
    
    
}
