package command;

public class TurnOn implements Command {

    final Blob blob;

    public TurnOn(Blob blob) {
        this.blob = blob;
    }

    @Override
    public void execute() {
        blob.turnOn();
    }

    @Override
    public void undo() {
        blob.turnOff();
    }

    @Override
    public void redo() {
        execute();
    }
}
