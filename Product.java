public class Product {
    private String name;
    private String productId;
    private double price;
    private int stockQuantity;

    // Constructor with price check
    public Product(String name, String productId, double price, int stockQuantity) {
        if (price >= 0) {
            this.name = name;
            this.productId = productId;
            this.price = price;
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Error: Price cannot be negative. Product not created.");
            this.name = null;
            this.productId = null;
            this.price = 0.0;
            this.stockQuantity = 0;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be non-negative.");
        }
    }

    // Stock update methods
    public void restock(int quantity) {
        if (quantity > 0) {
            this.stockQuantity += quantity;
        } else {
            System.out.println("Error: Restock quantity must be positive.");
        }
    }

    public boolean purchase(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Purchase quantity must be positive.");
            return false;
        }

        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            return true;
        } else {
            System.out.println("Error: Not enough stock.");
            return false;
        }
    }
}
