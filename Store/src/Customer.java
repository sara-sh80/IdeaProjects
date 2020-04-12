import java.util.ArrayList;

public class Customer extends User {
    private Store store;
    private ArrayList<Order> shoppingOrders;

    public Customer(String username, int password, Store s) {
        super(username, password);
        this.store = s;
        this.shoppingOrders = new ArrayList<Order>();
    }

    public ArrayList<Producer> getProducers() {
        return store.getProducers();
    }

    public ArrayList<Product> getProductsByProducer(Producer p) {
        return store.getProductsByProducer(p);
    }

    public void shopProduct(Product p) {
        Order newOrder = new Order(p, this);
        store.addToWaitingOrder(newOrder);
        this.shoppingOrders.add(newOrder);
    }

    public ArrayList<Product> getShoppedProducts() {
        ArrayList<Product> shoppedProducts = new ArrayList<Product>();
        for(int i = 0;i < this.shoppingOrders.size(); ++i)
            shoppedProducts.add(this.shoppingOrders.get(i).getProduct());
        return shoppedProducts;
    }

    public ArrayList<Product> getDeliveringProducts(){
        ArrayList<Product> deliveringProducts = new ArrayList<Product>();
        for(int i = 0;i < this.shoppingOrders.size(); ++i) {
            if (this.shoppingOrders.get(i).getStatus().equals(orderStatus.delivering))
                deliveringProducts.add(this.shoppingOrders.get(i).getProduct());
        }
        return deliveringProducts;
    }
}
