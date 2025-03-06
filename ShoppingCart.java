// Represents a shopping cart.
public class ShoppingCart {
    private Product product1, product2, product3;

    // Constructor to initialize the shopping cart.
    public ShoppingCart() {
        product1 = product2 = product3 = null;
    }

    // Adds a product to the shopping cart.
    public void addProduct(Product product) {
        if (product1 == null) {
            product1 = product;
        } else if (product2 == null) {
            product2 = product;
        } else if (product3 == null) {
            product3 = product;
        } else {
            System.out.println("Cart is full.");
        }
    }

    // Views the contents of the shopping cart.
    public void viewCart() {
        System.out.println("Shopping Cart:");
        if (product1 == null && product2 == null && product3 == null) {
            System.out.println("Your cart is empty.");
        } else {
            if (product1 != null) {
                System.out.println(product1.getName() + " - Price: $" + product1.getPrice() + ", Quantity: " + product1.getQuantity());
            }
            if (product2 != null) {
                System.out.println(product2.getName() + " - Price: $" + product2.getPrice() + ", Quantity: " + product2.getQuantity());
            }
            if (product3 != null) {
                System.out.println(product3.getName() + " - Price: $" + product3.getPrice() + ", Quantity: " + product3.getQuantity());
            }
        }
    }

    // Gets a product by its name from the shopping cart.
    public Product getProductByName(String name) {
        if (product1 != null && product1.getName().equals(name)) return product1;
        if (product2 != null && product2.getName().equals(name)) return product2;
        if (product3 != null && product3.getName().equals(name)) return product3;
        return null;
    }

    // Clears the shopping cart.
    public void clearCart() {
        product1 = product2 = product3 = null;
    }
}
