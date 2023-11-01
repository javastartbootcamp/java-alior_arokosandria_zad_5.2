package pl.javastart.task;

import java.util.Scanner;

public class Price extends Ticket {
    public Price(String name, String place, String type, double price, double bonus) {
        super(name, place, type, price, bonus);
    }

    double priceTicket() {
        double priceTicket = getPrice() - getPrice() * getBonus();
        if (getType().equals("Online")) {
            return priceTicket;
        } else if (getType().equals("Standard")) {
            return priceTicket + 5;
        } else if (getType().equals("Gift")) {
            return priceTicket + 5 + priceTicket * getBonus();
        } else {
            return priceTicket;
        }
    }

    public String toString() {
        return "numer biletu: " + getNumberTicket() + '\n' +
                "Nazwa wydarzenia: " + getName() + '\n' +
                "Podaj miejsce: " + getPlace() + '\n' +
                "podaj typ biletu: " + (getType().equals("Online") ? "bilet internetowy" : (getType().equals("Standard") ? "bilet standardowy" : "bilet prezentowy")) + '\n' +
                "cena standardowa biletu: " + getPrice() + '\n' +
                "zniżka biletu: " + getBonus() + '\n' +
                "cena koncowa: " + this.priceTicket();
    }

    public static Ticket scannerTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę :");
        String eventName = scanner.nextLine();
        System.out.print("Podaj miejsce :");
        String location = scanner.nextLine();
        System.out.print("Podaj typ biletu (Online/Standard/Gift): ");
        String ticketType = scanner.nextLine();
        System.out.print("Podaj cenę : ");
        double basePrice = scanner.nextDouble();
        System.out.print("Podaj zniżkę :");
        double discount = scanner.nextDouble();
        return new Price(eventName, location, ticketType, basePrice, discount);
    }
}