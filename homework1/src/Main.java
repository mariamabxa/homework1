public class Main {
    public static void main(String[] args) {
        //pizza
        Pizza pizza = new Pizza("Proschuto", 10, 11.99);

        System.out.println("Toppings: " + pizza.getToppings());
        System.out.println("Diameter: " + pizza.getDiameter());
        System.out.println("Price: " + pizza.getPrice());

        pizza.setToppings("Mushroom, cheese, onions");
        pizza.setDiameter(30);
        pizza.setPrice(29.44);

        System.out.println("Updated pizza details:");
        System.out.println(pizza);

        //taxpayer
        Taxpayer taxpayer = new Taxpayer();

        taxpayer.setSocialSecurityNumber("126789");
        taxpayer.setYearlyGrossIncome(30000);
        System.out.println("Tax owed: " + taxpayer.getTaxOwed());

        taxpayer.setYearlyGrossIncome(50000);
        System.out.println("Tax owed: " + taxpayer.getTaxOwed());

        //counter
        String inputString = "feefe 123 refr 456";
        Counter.countWordsAndNumbers(inputString);
    }
}
