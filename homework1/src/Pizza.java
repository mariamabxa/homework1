public class Pizza {
    private String toppings;
    private int diameter;
    private double price;

    public Pizza(String toppings, int diameter, double price) {
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza toppings=" + toppings + ", diameter=" + diameter + " inches, price=$" + price ;
    }
}
