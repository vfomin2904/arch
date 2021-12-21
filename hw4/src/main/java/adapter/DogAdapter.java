package adapter;

public class DogAdapter implements Lion{
    private final Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void roar() {
        dog.bark();
    }
}
