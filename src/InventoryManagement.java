import java.util.Arrays;

public class InventoryManagement {
    private Product[] products;

    public InventoryManagement(Product[] products) {
        this.products = products;
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProduct_id() == id) {
                // Shift elements to the left to remove the product
                System.arraycopy(products, i + 1, products, i, products.length - i - 1);
                products = Arrays.copyOf(products, products.length - 1); // Resize the array
                break;
            }
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }}

