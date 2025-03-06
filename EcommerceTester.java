public class EcommerceTester {
    public static void main(String[] args) {
        // Create and add products to the cart
        ShoppingCart cart = new ShoppingCart();
        Product laptop = new Product("Laptop", 1000, 1);
        Product headphones = new Product("Headphones", 50, 2);
        cart.addProduct(laptop);
        cart.addProduct(headphones);

        // Create customer details
        String customerName = "John Doe";
        String customerEmail = "john@example.com";
        String customerAddress = "123 Main St, Anytown, USA";

        // View the cart before placing an order
        System.out.println("Cart before placing order:");
        cart.viewCart();

        // Place the order with the customer details and payment method
        Order.placeOrder(cart, customerName, customerEmail, customerAddress, "Credit Card");

        // Create a new cart and add another product
        ShoppingCart cart2 = new ShoppingCart();
        Product mouse = new Product("Mouse", 30, 1);
        cart2.addProduct(mouse);

        // View the cart after adding a new product
        System.out.println("Cart after adding a new product:");
        cart2.viewCart();
    }
}
