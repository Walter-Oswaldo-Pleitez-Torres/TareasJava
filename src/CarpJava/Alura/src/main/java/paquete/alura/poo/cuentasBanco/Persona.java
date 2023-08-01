package paquete.alura.poo.cuentasBanco;

public class Persona {

    String nombre = "Laura";
    String sexo = "Mujer";
    String dui = "8604346";
    String telefono = "943750";
    int edad = 19;
    Cuenta cuenta = new Cuenta();

    public String cambiarNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public String cambiarTelefono(String telefono){
        this.telefono = telefono;
        return this.telefono;
    }
    public void darNombre() {
        System.out.println("Su nombre es: "+ nombre);
    }
    public void darEdad(){
        System.out.println("Edad: "+edad);
    }

    @Override
    public String toString() {
        return "Persona\n{" + "nombre = " + nombre + ",\n sexo = " + sexo + ",\n dui = " + dui 
                + ",\n telefono = " + telefono + ",\n edad = " + edad + ",\n cuenta = " + cuenta + '}';
    }
    

}
