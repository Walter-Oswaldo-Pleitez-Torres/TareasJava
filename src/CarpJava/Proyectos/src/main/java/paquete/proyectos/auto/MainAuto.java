package paquete.proyectos.auto;

public class MainAuto {
    public static void main(String[] args) {
        Motor m = new Motor("12345", 1.6, "Nafta");
        Auto auto1 = new Auto("abc123", "xyz456", 10000, "Gris", m);
        //Auto auto2 = new Auto("xyz123", "abc456", 10000, "Blanco", m);
        //Este codigo debe optimizarse porque dos autos no pueden tener un mismo motor 
        //Sin embargo ya tiene aplicado el "Tell, Don´t ask"
        
        System.out.println(auto1);
        auto1.acelerar();
        System.out.println(auto1);
        auto1.acelerar();
        System.out.println(auto1);
    }
}
