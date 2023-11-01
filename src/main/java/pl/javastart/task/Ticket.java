package pl.javastart.task;

public class Ticket {
    private int id;
    private String name;
    private String place;
    private String type;
    private double price;
    private double bonus;
    private static int numberTicket = 1;

    public int getId() {
        return id;
    }

    public Ticket(String name, String place, String type, double price, double bonus) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.price = price;
        this.bonus = bonus;
        this.id = numberTicket++;
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

}

