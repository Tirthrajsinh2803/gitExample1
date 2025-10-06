package lab1.pojos;

import java.io.Serializable;
import java.util.Objects;

public abstract class Publication extends Editable implements SaleableItem, Serializable {
    private String title;
    private double price;
    private int copies;

    protected Publication() {}

    protected Publication(int id, String title, double price, int copies) {
        this.id = id; this.title = title; this.price = price; this.copies = copies;
    }

    @Override public double getPrice() { return price; }
    // subclasses implement sellItem()

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public double getPriceField() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getCopies() { return copies; }
    public void setCopies(int copies) { this.copies = copies; }

    protected boolean decrementIfAvailable() {
        if (copies > 0) { copies--; return true; }
        return false;
    }

    @Override public String toString() {
        return "%s{id=%d, title='%s', price=%.2f, copies=%d}"
                .formatted(getClass().getSimpleName(), id, title, price, copies);
    }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                copies == that.copies &&
                Objects.equals(title, that.title);
    }
    @Override public int hashCode() { return Objects.hash(getClass(), id, title, price, copies); }
}
