import java.util.ArrayList;

public class Store {
    private ArrayList<Producer> producers;
    private ArrayList<Porter> porters;
    private ArrayList<Customer> customers;
    private ArrayList<Order> waitingOrders;

    public Store(){
        this.producers = new ArrayList<Producer>();
        this.porters = new ArrayList<Porter>();
        this.customers = new ArrayList<Customer>();
        this.waitingOrders = new ArrayList<Order>();
    }

    public ArrayList<Producer> getProducers() {
        return this.producers;
    }

    public ArrayList<Product> getProductsByProducer(Producer p) {
        return p.getProducts();
    }

    public void addToWaitingOrder(Order o){
        waitingOrders.add(o);
    }

    public ArrayList<Order> getOrdersInWaitingList(){
        return this.waitingOrders;
    }

    public void RemoveOrderFromWaitingOrders(Order o){
        waitingOrders.remove(o);
    }

}
