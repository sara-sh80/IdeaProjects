public class Admin extends User{
    private Store store;

    public Admin(String username, int password, Store s){
        super(username, password);
        this.store = s;
    }

    private Porter addPorter(String username, int password, Store s, Vehicle v){
        Porter newPorter = new Porter(username, password, s, v);
        return newPorter;
    }

    private Producer addProducer(String username, int password){
        Producer newProducer = new Producer(username, password);
        return newProducer;
    }
}
