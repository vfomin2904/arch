package visitor;

public class Monkey implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitMonkey(this);
    }

    public void shout() {
        System.out.println("Ooh oo aa aa!");
    }
}
