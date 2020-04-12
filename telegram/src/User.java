import java.util.ArrayList;

public class User {

    private static int idCount = 0;
    private int Id;
    private ArrayList<Group> groups;
    private ArrayList<Message> sentMessages;
    private int Count;
    private String Name;

    public User(int id,int count, String name){
        this.Id = id;
        this.groups = new ArrayList<Group>();
        this.sentMessages = new ArrayList<Message>();
        this.Count = count;
        this.Name = name;

    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.Name;
    }

    public int setId() {
        this.Id = idCount;
        idCount++;
        return Id;
    }

    public void sendMessage(String text, String date, User sender, Group g){
        Message newMassage = new Message(text, date, sender);
        g.sendMessage(newMassage);
    }

    public void addToGroups(Group g){
        g.addUser(this);
        groups.add(g);
    }
}
