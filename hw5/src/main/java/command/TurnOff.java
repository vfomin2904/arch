package command;

public class TurnOff implements Command {

    final Blob blob;

    public TurnOff(Blob blob) {
        this.blob = blob;
    }

    @Override
    public void execute() {
        blob.turnOff();
    }

    @Override
    public void undo() {
        blob.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
}
