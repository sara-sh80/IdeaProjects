public class Message {
    private String Text;
    private String Date;
    private User Sender;

    public Message(String text, String date, User sender){
        this.Text = text;
        this.Date = date;
        this.Sender = sender;
    }

    public String ToString(){
        String s = "";
        s += Text;
        s += Date;
        s += Sender.getName();
        return s;
    }
}
