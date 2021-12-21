package decorator;

public class Application {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getCoast());
        System.out.println(simpleCoffee.getDescription());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getCoast());
        System.out.println(milkCoffee.getDescription());

        Coffee whipCoffee = new WhipCoffee(milkCoffee);
        System.out.println(whipCoffee.getCoast());
        System.out.println(whipCoffee.getDescription());
    }
}
