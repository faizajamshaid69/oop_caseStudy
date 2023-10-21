public class Furniture extends Product {
    private String material;
    private int length;
    private int height;
    private int width;
    public Furniture(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,String material,int length,int height,int width){
        super( product_id,product_name,product_price,stock_quantity,salesTax);
        this.material=material;
        this.length=length;
        this.height=height;
        this.width=width;
    }

}
class Seating extends Furniture{

    private int load_capacity;
    public Seating(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,String material,int length,int height,int width,int load_capacity){
        super(product_id,product_name,product_price,stock_quantity,salesTax,material,length,height,width);
        this.load_capacity=load_capacity;}}

class Tables extends Furniture{
    private String shape;
    public Tables(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,String material,int length,int height,int width,String shape){
        super( product_id,product_name,product_price,stock_quantity,salesTax,material,length,height,width);
        this.shape=shape;
}}
