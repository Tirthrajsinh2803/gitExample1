package lab1.pojos;

public abstract class Editable {
    protected int id;
    public abstract void edit();
    public abstract void initialize();
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
