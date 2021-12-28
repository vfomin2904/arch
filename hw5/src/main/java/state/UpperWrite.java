package state;

public class UpperWrite implements WritingState{
    @Override
    public void write(String msg) {
        System.out.println(msg.toUpperCase());
    }
}
