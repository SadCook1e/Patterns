public class SimpleUser implements User {
    Chat chat;
    public SimpleUser(Chat chat){
        this.chat = chat;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin gets this message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
}
