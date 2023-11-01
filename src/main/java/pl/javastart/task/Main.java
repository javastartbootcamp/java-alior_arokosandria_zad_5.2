package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket ticket=new Price("przykład","Kraków","Gift",100.00,0.05);
        Ticket ticket1=new Price("przykład","Kraków","Standard",100.00,0.05);
        Ticket ticket2=new Price("przykład","Kraków","Online",100.00,0.05);
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket);
        Ticket ticket3=Price.scannerTicket();
        System.out.println(ticket3);
    }
}