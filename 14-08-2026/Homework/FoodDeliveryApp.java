import java.util.ArrayList;
interface FoodOrderService {
    double calculateFoodCost();
    double calculateDeliveryCharge();
    double calculateFinalBill();
    void displayOrderDetails();
}
abstract class FoodOrder implements FoodOrderService {
    private String orderId;
    private String customerName;
    private String foodName;
    private double price;
    private int quantity;
    public FoodOrder(String orderId, String customerName, String foodName, double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and Quantity must be greater than 0");
        }
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getFoodName() { return foodName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    @Override
    public double calculateFoodCost() {
        return price * quantity;
    }
}
class RegularOrder extends FoodOrder {
    public RegularOrder(String orderId, String customerName, String foodName, double price, int quantity) {
        super(orderId, customerName, foodName, price, quantity);
    }
    @Override
    public double calculateDeliveryCharge() {
        return 40.0;
    }
    @Override
    public double calculateFinalBill() {
        return calculateFoodCost() + calculateDeliveryCharge();
    }
    @Override
    public void displayOrderDetails() {
        System.out.println("Order Type: Regular Order");
        printCommonDetails();
    }
    private void printCommonDetails() {
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Food: " + getFoodName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Food Cost: Rs. " + calculateFoodCost());
        System.out.println("Delivery Charge: Rs. " + calculateDeliveryCharge());
        System.out.println("Final Bill: Rs. " + calculateFinalBill());
        System.out.println("------------------------------------");
    }
}
class ExpressOrder extends FoodOrder {
    public ExpressOrder(String orderId, String customerName, String foodName, double price, int quantity) {
        super(orderId, customerName, foodName, price, quantity);
    }
    @Override
    public double calculateDeliveryCharge() {
        return 80.0;
    }
    @Override
    public double calculateFinalBill() {
        return calculateFoodCost() + calculateDeliveryCharge();
    }
    @Override
    public void displayOrderDetails() {
        System.out.println("Order Type: Express Order");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Food: " + getFoodName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Food Cost: Rs. " + calculateFoodCost());
        System.out.println("Delivery Charge: Rs. " + calculateDeliveryCharge());
        System.out.println("Final Bill: Rs. " + calculateFinalBill());
        System.out.println("------------------------------------");
    }
}
class PremiumOrder extends FoodOrder {
    public PremiumOrder(String orderId, String customerName, String foodName, double price, int quantity) {
        super(orderId, customerName, foodName, price, quantity);
    }
    @Override
    public double calculateDeliveryCharge() {
        return 0.0;
    }
    @Override
    public double calculateFinalBill() {
        return calculateFoodCost() + calculateDeliveryCharge();
    }
    @Override
    public void displayOrderDetails() {
        System.out.println("Order Type: Premium Order");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Food: " + getFoodName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Food Cost: Rs. " + calculateFoodCost());
        System.out.println("Delivery Charge: Rs. " + calculateDeliveryCharge());
        System.out.println("Final Bill: Rs. " + calculateFinalBill());
        System.out.println("------------------------------------");
    }
}
public class FoodDeliveryApp {
    private ArrayList<FoodOrder> orders = new ArrayList<>();
    public void addOrder(FoodOrder order) {
        orders.add(order);
        System.out.println("Order added successfully!");
    }
    public void displayAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        for (FoodOrder order : orders) { 
            order.displayOrderDetails(); 
        }
    }
    public void searchOrder(String orderId) {
        for (FoodOrder order : orders) {
            if (order.getOrderId().equalsIgnoreCase(orderId)) {
                System.out.println("Order Found:");
                order.displayOrderDetails();
                return;
            }
        }
        System.out.println("Order ID " + orderId + " not found.");
    }
    public void removeOrder(String orderId) {
        boolean removed = orders.removeIf(order -> order.getOrderId().equalsIgnoreCase(orderId));
        if (removed) {
            System.out.println("Order removed successfully.");
        } else {
            System.out.println("Order ID " + orderId + " not found.");
        }
    }
    public static void main(String[] args) {
        FoodDeliveryApp app = new FoodDeliveryApp();
        app.addOrder(new RegularOrder("R101", "Arun", "Biryani", 200, 2));
        app.addOrder(new ExpressOrder("E102", "Priya", "Pizza", 350, 1));
        app.addOrder(new PremiumOrder("P103", "Kumar", "Seafood Platter", 800, 1));
        System.out.println("\n--- ALL ORDERS ---");
        app.displayAllOrders();
        System.out.println("\n--- SEARCH ORDER E102 ---");
        app.searchOrder("E102");
        System.out.println("\n--- REMOVE ORDER R101 ---");
        app.removeOrder("R101");
        System.out.println("\n--- ORDERS AFTER REMOVAL ---");
        app.displayAllOrders();
    }
}