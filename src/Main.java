public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Groceries cake = new Groceries(101, "cake", 400.0, 5, 0.05, "22/10/2024", "40%", "20%", "20%", "0.001");
        Furniture chair = new Furniture(201, "chair", 1500.0, 50, 0.02, "blackwood", 5, 2, 5);
        Electronics bulb = new Electronics(301, "bulb", 200.0, 15, 0.02, 200, 1);

        // Create arrays for products
        Product[] products = {cake, chair, bulb};

        // Create an InventoryManagement instance with the arrays
        InventoryManagement inventoryManagement = new InventoryManagement(products, null, null, null);

        // Uncomment these lines to add products to the inventory
        // Furniture f = new Furniture(13, "chair", 1200, 20, 256, "BlackWood", 12, 6, 7);
        // Electronics e = new Electronics(14, "bulb", 400, 13, 13, 24000, 2);
        // Groceries g = new Groceries(14, "pasta", 400, 23, 45, "13/6/2024", "13%", "13%", "2%", "14%");
        // inventoryManagement.addProduct(f);
        // inventoryManagement.addProduct(e);
        // inventoryManagement.addProduct(g);

        inventoryManagement.removeProduct(101);
        inventoryManagement.displayProducts();
    }
}
