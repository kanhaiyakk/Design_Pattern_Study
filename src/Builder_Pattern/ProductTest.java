package Builder_Pattern;

public class ProductTest {
    public static void main(String[] args) {
        //UseCase1- only mandatory fields
       Product product1= new Product.ProductBuilder("Iphone", 50000).build();
       System.out.println(product1);

        //UseCase2-  mandatory fields and optionals fields
        Product product2=new Product.ProductBuilder("Samsung Monitor", 60000)
                .setCategory("Electronics")
                .setDescription("This is 20 inch monitor")
                .setFreeShipping(false)
                .setDiscount(10)
                .setStock(50)
                .build();
        System.out.println(product2);
        //we can update product elements later
        product2.setDiscount(5);
        System.out.println(product2);
        System.out.println(product2.getCategory());

        //UseCase-3
        Product product3=new Product.ProductBuilder("Nike T shirt", 1500)
                .setCategory("Sports colths")
                .setDiscount(0)
                .setStock(100)
                .setFreeShipping(true)
                .build();
        System.out.println(product3);
        product3.setDescription("Black color sports T shirt");
        System.out.println(product3);
    }
}
