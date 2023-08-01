
package paquete.proyectos;

public class MainTicket {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("25 de Enero 2023", "05461037-8");
        Ticket t2 = new Ticket("26 de Enero 2023", "05461037-9");
        Ticket t3 = new Ticket("27 de Enero 2023", "05461037-7");
        Ticket t4 = new Ticket("28 de Enero 2023", "05461037-6");
        Ticket t5 = new Ticket("29 de Enero 2023", "05461037-5");
        Ticket t6 = new Ticket("30 de Enero 2023", "05461037-4");
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t5.toString());
        System.out.println(t6.toString());
        
    }
}
