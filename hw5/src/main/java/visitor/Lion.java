package visitor;

public class Lion implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitLion(this);
    }

    public void roar() {
        System.out.println("Roar!");
    }
}
