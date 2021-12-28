package mediator;

public class User {
    private String name;
    private ChatRoomMediator chatRoomMediator;

    public User(String name, ChatRoomMediator chatRoomMediator) {
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public void sendMessage(String msg) {
        chatRoomMediator.showMessage(this, msg);
    }

    public String getName() {
        return name;
    }
}
