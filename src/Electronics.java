public class Electronics extends Product{
    private  int power_consumption;
    private int warranty;
    public Electronics(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,int power_consumption,int warranty){
        super(product_id,product_name,product_price,stock_quantity,salesTax);
        this.power_consumption=power_consumption;
        this.warranty=warranty;
    }
}
class Smartphones extends Electronics{
    private String operatingSystem;
    private int storageCapacity;
    private int cameraResolution;
    public Smartphones(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,int power_consumption,int warranty,String operatingSystem,int storageCapacity,int cameraResolution){
        super(product_id,product_name,product_price,stock_quantity,salesTax,power_consumption,warranty);
        this.operatingSystem=operatingSystem;
        this.storageCapacity=storageCapacity;
        this.cameraResolution=cameraResolution;
    }

}
class Laptop extends Electronics{
    private String processor_type;
    private int ram_size;
    private int screen_height;
    private int screen_width;
    private int screen_length;
    public Laptop(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,int power_consumption,int warranty,String processor_type,int ram_size,int screen_height,int screen_width,int screen_length){
        super(product_id,product_name,product_price,stock_quantity,salesTax,power_consumption,warranty);
        this.processor_type=processor_type;
        this.screen_height=screen_height;
        this.screen_width=screen_width;
        this.screen_length=screen_length;
    }
}
