package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket("przykład", "Kraków", "Gift", 100.00, 0.05);
        Ticket ticket1 = new Ticket("przykład", "Kraków", "Standard", 100.00, 0.05);
        Ticket ticket2 = new Ticket("przykład", "Kraków", "Online", 100.00, 0.05);
        Price price = new Price();
        price.priceTicket(ticket);
        Ticket ticket3 = price.scannerTicket();
        price.toView(ticket3);
    }
}