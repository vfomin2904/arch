package proxy;

public class Application {
    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor());
        securedDoor.open();
        securedDoor.close();
    }
}
