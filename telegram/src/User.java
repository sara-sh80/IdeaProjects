import java.util.ArrayList;

public class User {

    private String Id;
    private ArrayList<Group> groups;
    private ArrayList<Message> sentMessages;
    private int Count;

    public User(String id,int count){
        this.Id = id;
        this.groups = new ArrayList<Group>();
        this.sentMessages = new ArrayList<Message>();
        this.Count = count;
    }

    public String getId(){
        return this.Id;
    }

    public void sendMessage(String text, String date, User sender, Group g){
        Message newMassage = new Message(text, date, sender);
        g.sendMessage(newMassage);
    }
}
