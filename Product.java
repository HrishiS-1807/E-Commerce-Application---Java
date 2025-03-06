// Represents a product in the e-commerce store.
public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize the product.
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Gets the name of the product.
    public String getName() {
        return name;
    }

    // Sets the name of the product.
    public void setName(String name) {
        this.name = name;
    }

    // Gets the price of the product.
    public double getPrice() {
        return price;
    }

    // Sets the price of the product.
    public void setPrice(double price) {
        this.price = price;
    }

    // Gets the quantity of the product.
    public int getQuantity() {
        return quantity;
    }

    // Sets the quantity of the product.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
