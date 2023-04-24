public class Forbath extends Product{
    private int size;
    
    protected Forbath(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
}