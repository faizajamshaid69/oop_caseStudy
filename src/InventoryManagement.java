import java.util.ArrayList;
import java.util.Arrays;

public class InventoryManagement {
private Product[] products;
private Groceries[] groceries;
private Electronics[] electronics;
private Furniture[] furnitures;
private int productCount;
private int groceriesCount;
private int electronicsCount;
private int furnituresCount;

public InventoryManagement(Product[] products,Groceries[] groceries,Electronics[] electronics,Furniture[] furnitures) {
    this.products = new Product[products.length];
    this.groceries = new Groceries[groceries.length];
    this.electronics = new Electronics[electronics.length];
    this.furnitures = new Furniture[furnitures.length];
}
    public <T> T[] addObjectToArray(T[] originalArray, T newObject) {
        int newArraySize = originalArray.length + 1;
        T[] newArray = Arrays.copyOf(originalArray, newArraySize);
        newArray[newArraySize - 1] = newObject;
        return newArray;
    }

    public void removeProduct(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getProduct_id() == id) {
                // Shift elements to the left to remove the product
                System.arraycopy(products, i + 1, products, i, productCount - i - 1);
                products[productCount - 1] = null; // Clear the last element
                productCount--;
                break;
            }
        }
    }

    public void displayProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i]);
        }

}}
