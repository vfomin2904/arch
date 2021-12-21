package decorator;

public class WhipCoffee implements Coffee{
    private  final Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    
    @Override
    public int getCoast() {
        return coffee.getCoast() + 4;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", whip";
    }
}
