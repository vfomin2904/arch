package decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public int getCoast() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
