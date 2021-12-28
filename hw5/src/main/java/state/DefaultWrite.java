package state;

public class DefaultWrite implements WritingState{
    @Override
    public void write(String msg) {
        System.out.println(msg);
    }
}
