public class forbath extends Product{
    private int size;
    
    protected forbath(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
}