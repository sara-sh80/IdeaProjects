import java.util.ArrayList;

public class Group {
   private ArrayList<User> users;
    private ArrayList<Message> messages;
    public Group(){
        this.users = new ArrayList<User>();
        this.messages = new ArrayList<Message>();
    }

    public void addUser(User u){
        users.add(u);
    }

    public void removeUser(User u){
        users.remove(u);
    }

    public void sendMessage(Message m){
        messages.add(m);
    }

    public void deleteMessage(Message m){
        messages.remove(m);
    }

    public ArrayList<Message> getMessages(){
        ArrayList<Message> MassageList = new ArrayList<Message>();
        for(int i = 0;i < messages.size(); ++i){
            MassageList.add(messages.get(i));
        }
        return MassageList;
    }

    public ArrayList<String> getUserIDs(){
        ArrayList<String> IDs = new ArrayList<String>();
        for(int i = 0;i < users.size(); ++i)
            IDs.add(users.get(i).getId());
        return IDs;
    }
}