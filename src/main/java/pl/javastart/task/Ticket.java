package pl.javastart.task;

public class Ticket {
    private String name;
    private String place;
    private String type;
    private double price;
    private double bonus;
    private static int numberTicket = 1;

    public Ticket(String name, String place, String type, double price, double bonus) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.price = price;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getBonus() {
        return bonus;
    }

    public static int getNumberTicket() {
        return numberTicket++;
    }
}

