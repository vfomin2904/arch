package proxy;

import java.util.Scanner;

public class SecuredDoor implements Door{

    private final Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        if(checkPassword()){
            door.open();
        } else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public void close() {
        door.close();
        System.out.println("Bye!");
    }

    private boolean checkPassword(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }
}
