public class Order {
    private Product Product;
    private Customer Customer;
    private orderStatus status;

    public Order(Product product, Customer customer){
        this.Product = product;
        this.Customer = customer;
        this.status = orderStatus.Waiting;
    }

    public void ChangeOrderStatusToDelivering(){
        status = orderStatus.delivering;
    }

    public void ChangeOrderStatusToDelivered(){
        status = orderStatus.delivered;
    }

    public orderStatus getStatus() {
        return this.status;
    }

    public Product getProduct() {
        return this.Product;
    }
}

enum orderStatus {
    Waiting,
    delivering,
    delivered
}