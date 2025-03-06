# E-Commerce Java Application

## Description
This is a simple Java-based e-commerce application that simulates an online shopping experience. Users can add products to a shopping cart, view their cart, and place an order with customer details and a payment method. The application processes orders, calculates the total cost, and clears the cart after a successful purchase.

## Features
- **Product Management:** Add products to a shopping cart.
- **Shopping Cart:** View and manage products in the cart (up to 3 items).
- **Order Processing:** Place an order with customer details.
- **Payment Simulation:** Process payment using different payment methods.
- **Cart Management:** Clear the cart after a successful purchase.

## How It Works
1. **Create a Shopping Cart** – Users can add up to three products to their cart.
2. **View Cart** – The user can view the current products in the cart before checkout.
3. **Place an Order** – The system captures customer details and processes payment.
4. **Payment Simulation** – The system processes the payment and confirms the order.
5. **Cart Reset** – After placing an order, the cart is cleared for new purchases.

## How to Run:
Clone the repository.
Open the project in your preferred Java IDE (Eclipse, IntelliJ, etc.).
Compile and run EcommerceTester.java.

## Classes & Responsibilities

    Product – Represents a product with name, price, and quantity.
    ShoppingCart – Manages the cart, allows adding/viewing products, and clears after checkout.
    Order – Handles order placement, calculates total, and processes payments.
    EcommerceTester – Main class to test the e-commerce functionality.

## Requirements

    Java 8 or higher.

## Sample Output:
    
    Cart before placing order:
    Shopping Cart:
    Laptop - Price: $1000.0, Quantity: 1
    Headphones - Price: $50.0, Quantity: 2
    
    Order #1 placed for John Doe (john@example.com)
    Shipping to: 123 Main St, Anytown, USA
    Total: $1100.0
    Processing Credit Card payment of $1100.0
    Credit Card payment successful!
    
    Cart after adding a new product:
    Shopping Cart:
    Mouse - Price: $30.0, Quantity: 1


    
