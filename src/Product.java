 public class Product {
        private int product_id;
        private String product_name;
        private double Product_price;
        private int stock_quantity;
        private double salesTax;

        public Product(int product_id, String product_name, double product_price, int stock_quantity, double salesTax) {
                this.product_id = product_id;
                this.product_name = product_name;
                this.Product_price = product_price;
                this.stock_quantity = stock_quantity;
                this.salesTax = salesTax;
        }



        public String getProduct_name() {
                return product_name;
        }

        public double getProduct_price() {
                return Product_price;
        }

        public int getStock_quantity() {
                return stock_quantity;
        }

        public double getSalesTax() {
                return salesTax;
        }

        public int getProduct_id() {
                return product_id;
        }

        @Override
        public String toString() {
                return String.format("%d %s %.2f %d %.2f", getProduct_id(), getProduct_name(), getProduct_price(), getStock_quantity(),getSalesTax());
        }
}


