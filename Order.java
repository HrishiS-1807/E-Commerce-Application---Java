// Represents an order placed in the e-commerce store.
public class Order {
    static int orderCount = 0; // Static variable to track the order count

    // Customer details
    private String customerName;
    private String customerEmail;
    private String customerAddress;

    // Constructor to initialize the customer details in the order
    public Order(String customerName, String customerEmail, String customerAddress) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    // Calculates the total price of all products in the shopping cart.
    public static double calculateTotal(ShoppingCart cart) {
        double total = 0;
        // Calculate the total price of the products in the cart
        if (cart.getProductByName("Laptop") != null) {
            Product laptop = cart.getProductByName("Laptop");
            total += laptop.getPrice() * laptop.getQuantity();
        }
        if (cart.getProductByName("Headphones") != null) {
            Product headphones = cart.getProductByName("Headphones");
            total += headphones.getPrice() * headphones.getQuantity();
        }
        if (cart.getProductByName("Mouse") != null) {
            Product mouse = cart.getProductByName("Mouse");
            total += mouse.getPrice() * mouse.getQuantity();
        }
        return total;
    }

    // Processes the payment directly within the Order class.
    private static void processPayment(double amount, String paymentMethod) {
        // Simulating payment processing based on the payment method
        System.out.println("Processing " + paymentMethod + " payment of $" + amount);
        // Simulate success or failure
        System.out.println(paymentMethod + " payment successful!");
    }

    // Places an order, processes payment, and clears the shopping cart.
    public static void placeOrder(ShoppingCart cart, String customerName, String customerEmail, String customerAddress, String paymentMethod) {
        double total = calculateTotal(cart);
        if (total > 0) {
            orderCount++;
            // Create a new order object with the customer details
            Order order = new Order(customerName, customerEmail, customerAddress);
            System.out.println("Order #" + orderCount + " placed for " + order.customerName + " (" + order.customerEmail + ")");
            System.out.println("Shipping to: " + order.customerAddress);
            System.out.println("Total: $" + total);
            // Process the payment
            processPayment(total, paymentMethod);
            cart.clearCart();
        } else {
            System.out.println("Cart is empty. Cannot place an order.");
        }
    }
}
