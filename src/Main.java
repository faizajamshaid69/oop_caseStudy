public class Main {

public static void main(String[] args) {
        Product[] products = new Product[4];

        Groceries cake = new Groceries(101, "cake", 400.0, 5, 0.05, "22/10/2024", "40%", "20%", "20%", "0.001");
        Furniture chair = new Furniture(201, "chair", 1500.0, 50, 0.02, "Black wood", 5, 2, 5);
        Electronics bulb = new Electronics(301, "bulb", 200.0, 15, 0.02, 200, 1);
Electronics pc=new Electronics(301,"pc",400.0,2,0.45,56,1);
        products[0] = cake;
        products[1] = chair;
        products[2] = bulb;
        products[3]=pc;

        InventoryManagement inventoryManagement = new InventoryManagement(products);
        inventoryManagement.removeProduct(101);
        inventoryManagement.displayProducts();

        }

}