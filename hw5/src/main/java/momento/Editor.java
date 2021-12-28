package momento;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void add(String str){
        content += str;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void reset(EditorMemento editorMemento){
        content = editorMemento.getContent();
    }
}
