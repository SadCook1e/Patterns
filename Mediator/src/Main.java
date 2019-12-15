public class Main {

    public  static void  main(String[] args){
        TextChat chat = new TextChat();
        User admin = new Admin(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);

        admin.sendMessage("I'm admin");
        u1.sendMessage("I'm simple user");

    }
}