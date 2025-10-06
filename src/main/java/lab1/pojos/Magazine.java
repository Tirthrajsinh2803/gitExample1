package lab1.pojos;

import java.time.LocalDate;

public class Magazine extends Publication {
    private int orderQty;
    private LocalDate currentIssue;

    public Magazine() {}
    public Magazine(int id, String title, double price, int copies, int orderQty, LocalDate currentIssue) {
        super(id, title, price, copies);
        this.orderQty = orderQty; this.currentIssue = currentIssue;
    }

    @Override public void edit() { System.out.println("... Edit Magazine functionality will be implemented here ..."); }
    @Override public void initialize() { System.out.println("... Initialize Magazine functionality will be implemented here ..."); }

    @Override public void sellItem() {
        if (decrementIfAvailable()) System.out.println("Sold Magazine: " + getTitle() + " (Issue: " + currentIssue + ")");
        else System.out.println("Magazine out of stock: " + getTitle());
    }

    public int getOrderQty() { return orderQty; }
    public void setOrderQty(int orderQty) { this.orderQty = orderQty; }
    public LocalDate getCurrentIssue() { return currentIssue; }
    public void setCurrentIssue(LocalDate currentIssue) { this.currentIssue = currentIssue; }
}
