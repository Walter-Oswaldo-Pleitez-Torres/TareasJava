package paquete.proyectos.auto;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private Motor motor1;

    public Auto(String patente, String marca, double precio, String color, Motor motor1) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor1 = motor1;
    }
    
    public void acelerar(){
        this.motor1.acelerar();
    }

    @Override
    public String toString() {
        return "Auto{\n" + "patente=" + patente + ", marca=" + marca + 
                ", precio=" + precio + ", color=" + color + ", motor1=" + motor1 + "\n}";
    }

    
    
    
}
