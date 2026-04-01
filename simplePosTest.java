import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class simplePosTest {
    private static ArrayList<String> cart = new ArrayList<>();
    private static HashMap<String, Double> products = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initializeProducts();
        
        System.out.println("=== WELCOME TO POS SYSTEM ===");
        
        while (true) {
            showMainMenu();
            
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    showProducts();
                    addToCart();
                    break;
                case 2:
                    showCart();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.out.println("Thank you for using POS System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
    
    private static void initializeProducts() {
        products.put("Apple", 0.99);
        products.put("Banana", 0.59);
        products.put("Orange", 0.79);
        products.put("Milk", 2.99);
        products.put("Bread", 1.99);
        products.put("Eggs", 3.49);
        products.put("Cheese", 4.99);
        products.put("Chicken", 8.99);
    }
    
    private static void showMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Add items to cart");
        System.out.println("2. View cart");
        System.out.println("3. Checkout");
        System.out.println("4. Exit");
    }
    
    private static void showProducts() {
        System.out.println("\n=== AVAILABLE PRODUCTS ===");
        int i = 1;
        for (Map.Entry<String, Double> product : products.entrySet()) {
            System.out.printf("%d. %s - $%.2f\n", i++, product.getKey(), product.getValue());
        }
    }
    
    private static void addToCart() {
        System.out.print("Enter product number to add (1-" + products.size() + "): ");
        int productNum = getIntInput("");
        
        if (productNum < 1 || productNum > products.size()) {
            System.out.println("Invalid product number.");
            return;
        }
        
        String productName = (String) products.keySet().toArray()[productNum - 1];
        cart.add(productName);
        System.out.println(productName + " added to cart!");
    }
    
    private static void showCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }
        
        System.out.println("\n=== YOUR CART ===");
        double total = 0;
        HashMap<String, Integer> itemCount = new HashMap<>();
        
        for (String item : cart) {
            itemCount.put(item, itemCount.getOrDefault(item, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : itemCount.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = products.get(product);
            double subtotal = price * quantity;
            
            System.out.printf("%s x%d - $%.2f\n", product, quantity, subtotal);
            total += subtotal;
        }
        
        System.out.printf("\nTOTAL: $%.2f\n", total);
    }
    
    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty. Add items first.");
            return;
        }
        
        showCart();
        
        System.out.println("\n=== PAYMENT METHODS ===");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. Digital Wallet");
        
        int paymentChoice = getIntInput("Select payment method: ");
        
        String paymentMethod = "";
        switch (paymentChoice) {
            case 1: paymentMethod = "Cash"; break;
            case 2: paymentMethod = "Credit Card"; break;
            case 3: paymentMethod = "Debit Card"; break;
            case 4: paymentMethod = "Digital Wallet"; break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }
        
        System.out.println("\n=== CHECKOUT SUMMARY ===");
        showCart();
        System.out.println("Payment Method: " + paymentMethod);
        
        System.out.print("Confirm purchase? (y/n): ");
        String confirm = scanner.nextLine().toLowerCase();
        
        if (confirm.equals("y")) {
            System.out.println("\n=== PAYMENT PROCESSING ===");
            System.out.println("Processing payment via " + paymentMethod + "...");
            System.out.println("Payment successful!");
            System.out.println("Thank you for your purchase!");
            
            cart.clear();
        } else {
            System.out.println("Purchase cancelled.");
        }
    }
    
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}
