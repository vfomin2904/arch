package mediator;

import java.util.Date;

public class ChatRoom implements ChatRoomMediator{
    @Override
    public void showMessage(User user, String msg) {
        System.out.println(new Date() + "["+user.getName()+"] "+msg);
    }
}
