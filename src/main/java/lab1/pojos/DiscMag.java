package lab1.pojos;

import java.time.LocalDate;

public class DiscMag extends Magazine {
    private boolean hasDisc;

    public DiscMag() {}
    public DiscMag(int id, String title, double price, int copies, int orderQty, LocalDate currentIssue, boolean hasDisc) {
        super(id, title, price, copies, orderQty, currentIssue);
        this.hasDisc = hasDisc;
    }

    @Override public void edit() { System.out.println("... Edit DiscMag functionality will be implemented here ..."); }
    @Override public void initialize() { System.out.println("... Initialize DiscMag functionality will be implemented here ..."); }

    @Override public void sellItem() {
        if (decrementIfAvailable())
            System.out.println("Sold DiscMag: " + getTitle() + (hasDisc ? " [disc included]" : ""));
        else
            System.out.println("DiscMag out of stock: " + getTitle());
    }

    public boolean isHasDisc() { return hasDisc; }
    public void setHasDisc(boolean hasDisc) { this.hasDisc = hasDisc; }
}
