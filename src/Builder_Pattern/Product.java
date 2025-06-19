package Builder_Pattern;

public class Product {
    //required field
    private String name;
    private double price;
    //optional fields
    private String description;
    private String category;
    private double discount;
    private boolean freeShipping;
    private int stock;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.stock = builder.stock;
        this.freeShipping = builder.freeShipping;
        this.discount = builder.discount;
        this.category = builder.category;
        this.description = builder.description;
        this.price = builder.price;
    }
    //getters/setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                ", freeShipping=" + freeShipping +
                ", stock=" + stock +
                '}';
    }
    public static class ProductBuilder{
        //required field
        private String name;
        private double price;
        //optional fields
        private String description;
        private String category;
        private double discount;
        private boolean freeShipping;
        private int stock;
//public constructor of the builde
        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        //setters for optional field

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }
        //create build method to create object of ProductBuilder class
        public Product build(){
            return new Product(this);
        }
    }
}
