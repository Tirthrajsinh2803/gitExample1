package lab1;

import lab1.pojos.SaleableItem;

public class CashTill {
    private double runningTotal;

    public void sellItem(SaleableItem item) {
        if (item == null) {
            System.out.println("Cannot process a null item.");
            return;
        }
        System.out.println("Processing sale...");
        item.sellItem(); // polymorphic call
        double price = item.getPrice();
        runningTotal += price;
        System.out.printf("Added $%.2f to the total.%n", price);
        showTotal();
        System.out.println("End of sale.\n");
    }

    public void showTotal() {
        System.out.printf("Running total: $%.2f%n", runningTotal);
    }
}

