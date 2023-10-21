public class Groceries extends Product {
    private String expiration_date;
    private String carb;
    private String protein;
    private String fats;
    private String sodium;
    public Groceries(int product_id,String product_name,double product_price,int stock_quantity,double salesTax,String expiration_date,String carb,String protein,String fats,String sodium ){
        super(product_id,product_name,product_price,stock_quantity,salesTax);
        this.expiration_date=expiration_date;
        this.carb=carb;
        this.protein=protein;
        this.fats=fats;
        this.sodium = sodium;
    }

}

