package decorator;

public class MilkCoffee implements Coffee{
    private  final Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCoast() {
        return coffee.getCoast() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }
}
