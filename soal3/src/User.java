import java.util.ArrayList;

public class User {
    private String Id;
    private ArrayList<String> Groups;
    private long Count;
    private ArrayList<String> SentMessage;
    public User(String id, long count){
        this.Id = id;
        this.Count = count;
        ArrayList<String> groups = new ArrayList<String>();
        ArrayList<String> sentMessage = new ArrayList<String>();
    }

    public String SetId(String id){
        return id;
    }
}

class Group {
    private ArrayList<User> Users;
    private ArrayList<String> Messages;
    public Group(){
        ArrayList<User> Users = new ArrayList<User>();
        ArrayList<String> Messages = new ArrayList<String>();
    }
    public void addUser(User u){
        Users.add(u);
    }
    public void removeUser(User u){
        Users.remove(u);
    }
    public void sendMessage(String s){
        Messages.add(s);
    }
    public void deleteMessage(String s){
        Messages.remove(s);
    }
    public ArrayList<String> getMessages(){
        ArrayList<String> GetMessage = new ArrayList<String>();
        for(int i = 0;i < Messages.size(); ++i)
            GetMessage.add(Messages.get(i));
        return GetMessage;
    }
}
class Message {
    private String Text;
    private String Date;
    private User Sender;
    public Message(String text, String date,User sender){
        this.Text = text;
        this.Date = date;
        this.Sender = sender;
    }
    public String ToString(String t,String d,User u){
        return t + d + u;
    }
}
class Picture extends Message {
    public Picture(String text, String date,User sender){
        super(text, date, sender);
    }
}