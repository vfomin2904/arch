package state;

public class Application {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new DefaultWrite());
        textEditor.write("my msg");
        textEditor.setState(new UpperWrite());
        textEditor.write("my msg");
    }
}
