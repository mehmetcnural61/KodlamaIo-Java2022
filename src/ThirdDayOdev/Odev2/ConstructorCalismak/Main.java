package ThirdDayOdev.Odev2.ConstructorCalismak;

public class Main {
    public static void main(String[] args) {

        Product product=new Product(2,"Asus","Tuf Gaming",25.750);

//        Product product=new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("MSİ Gaming Laptop");
//        product.setPrice(13.750);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
    }
}
