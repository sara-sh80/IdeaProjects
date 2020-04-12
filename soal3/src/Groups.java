import java.util.ArrayList;

class Groups {
    private ArrayList<User> Users;
    private ArrayList<String> Messages;
    public Groups(){
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
