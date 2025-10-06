package lab1.pojos;

public class Book extends Publication {
    private String author;

    public Book() {}
    public Book(int id, String title, String author, double price, int copies) {
        super(id, title, price, copies);
        this.author = author;
    }

    @Override public void edit() { System.out.println("... Edit Book functionality will be implemented here ..."); }
    @Override public void initialize() { System.out.println("... Initialize Book functionality will be implemented here ..."); }

    @Override public void sellItem() {
        if (decrementIfAvailable()) System.out.println("Sold Book: " + getTitle() + " by " + author);
        else System.out.println("Book out of stock: " + getTitle());
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
