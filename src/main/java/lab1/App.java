package lab1;

import java.util.Scanner;

public class App {
    private final Scanner in = new Scanner(System.in);

    public void run() {
        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = promptInt("Enter choice: ", 1, 99);
            switch (choice) {
                case 1 -> addItemsMenu();
                case 2 -> println("... Edit Items functionality will be implemented here ...");
                case 3 -> println("... Delete Items functionality will be implemented here ...");
                case 4 -> println("... Sell item(s) functionality will be implemented here ...");
                case 5 -> println("... List items functionality will be implemented here ...");
                case 99 -> { println("Goodbye!"); running = false; }
                default -> println("Invalid choice, try again.");
            }
        }
    }

    private void addItemsMenu() {
        boolean inAdd = true;
        while (inAdd) {
            println("\nAdd an item\n");
            println("1. Add Book");
            println("2. Add Magazine");
            println("3. Add DiscMag");
            println("4. Add Ticket");
            println("99. Exit\n");

            int choice = promptInt("Enter choice: ", 1, 99);
            switch (choice) {
                case 1 -> println("... Add Book functionality will be implemented here ...");
                case 2 -> println("... Add Magazine functionality will be implemented here ...");
                case 3 -> println("... Add DiscMag functionality will be implemented here ...");
                case 4 -> println("... Add Ticket functionality will be implemented here ...");
                case 99 -> { println("\nReturning to main menu...\n"); inAdd = false; }
                default -> println("Invalid choice, try again.");
            }
        }
    }

    private void printMainMenu() {
        println("\n***********************");
        println(" 1. Add Items");
        println(" 2. Edit Items");
        println(" 3. Delete Items");
        println(" 4. Sell item(s)");
        println(" 5. List items");
        println("99. Quit");
        println("***********************");
    }

    private int promptInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            try {
                int v = Integer.parseInt(line);
                if (v == 99) return 99;
                if (v < min || v > max) throw new NumberFormatException();
                return v;
            } catch (NumberFormatException e) {
                println("Please enter a number between " + min + " and " + max + " (or 99).");
            }
        }
    }
    private void println(String s) { System.out.println(s); }
}
