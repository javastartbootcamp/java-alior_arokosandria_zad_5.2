package pl.javastart.task;

import java.util.Scanner;

public class Price {
    private static int addPrice = 5;
    private static double addBonus = 0.05;

    double priceTicket(Ticket ticket) {
        double priceTicket = ticket.getPrice() - ticket.getPrice() * ticket.getBonus();
        if (ticket.getType().equals("Online")) {
            return priceTicket;
        } else if (ticket.getType().equals("Standard")) {
            return priceTicket + addPrice;
        } else if (ticket.getType().equals("Gift")) {
            return priceTicket + addPrice + priceTicket * addBonus;
        } else {
            return priceTicket;
        }
    }

    public void toView(Ticket ticket) {
        System.out.println("numer biletu: " + ticket.getId() + '\n' +
                "Nazwa wydarzenia: " + ticket.getName() + '\n' +
                "Podaj miejsce: " + ticket.getPlace() + '\n' +
                "podaj typ biletu: " + (ticket.getType().equals("Online") ? "bilet internetowy" :
                (ticket.getType().equals("Standard") ? "bilet standardowy" : "bilet prezentowy")) + '\n' +
                "cena standardowa biletu: " + ticket.getPrice() + '\n' +
                "zniżka biletu: " + ticket.getBonus() + '\n' +
                "cena koncowa: " + priceTicket(ticket));
    }

    public Ticket scannerTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę :");
        String eventName = scanner.nextLine();
        System.out.print("Podaj miejsce :");
        String location = scanner.nextLine();
        System.out.print("Podaj typ biletu (Online/Standard/Gift): ");
        String ticketType = scanner.nextLine();
        System.out.print("Podaj cenę : ");
        double basePrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Podaj zniżkę :");
        double discount = scanner.nextDouble();
        scanner.nextLine();
        return new Ticket(eventName, location, ticketType, basePrice, discount);
    }
}