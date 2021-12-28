package state;

public class TextEditor {
    WritingState state;

    public TextEditor(WritingState state) {
        this.state = state;
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void write(String msg) {
        state.write(msg);
    }
}
