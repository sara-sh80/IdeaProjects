import java.util.ArrayList;
public class Producer extends User{

    private ArrayList<Product> products;

    public Producer(String username, int password){
        super(username, password);
        this.products = new ArrayList<Product>();
    }

    private void addProducts(Product p){
        this.products.add(p);
    }

    private void removeProducts(Product p){
        this.products.remove(p);
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }
}
