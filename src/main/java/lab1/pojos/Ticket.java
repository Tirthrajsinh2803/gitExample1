package lab1.pojos;

import java.io.Serializable;
import java.util.Objects;

public class Ticket implements SaleableItem, Serializable {
    private int id;
    private String description;
    private double price;

    public Ticket() {}
    public Ticket(int id, String description, double price) {
        this.id = id; this.description = description; this.price = price;
    }

    @Override public double getPrice() { return price; }
    @Override public void sellItem() { System.out.println("Sold Ticket: " + description); }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPriceField() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override public String toString() { return "Ticket{id=%d, description='%s', price=%.2f}".formatted(id, description, price); }
    @Override public boolean equals(Object o) {
        if (this == o) return true; if (!(o instanceof Ticket t)) return false;
        return id == t.id && Double.compare(t.price, price) == 0 && Objects.equals(description, t.description);
    }
    @Override public int hashCode() { return Objects.hash(id, description, price); }
}
