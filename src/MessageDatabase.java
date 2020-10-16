import java.util.ArrayList;

public class MessageDatabase {
    static ArrayList<Message> listOfMassages = new ArrayList<Message>();
    public static void sendMessage(User sender, User receiver, String text){
        Message message = new Message(sender, receiver, text);
        listOfMassages.add(message);
    }

    public static ArrayList<Message> getListOfMassages() {
        return listOfMassages;
    }

    public static void showDialog(User u1, User u2){
        for (Message message :
                listOfMassages) {
            if ((message.getSender() == u1) && (message.getReceiver() == u2)
                    || (message.getSender() == u2) && (message.getReceiver() == u1)){
                System.out.println(message.getSender() + ":" + message.getText());
            }
        }
    }
}
