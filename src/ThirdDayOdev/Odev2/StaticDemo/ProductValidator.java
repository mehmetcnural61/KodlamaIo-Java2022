package ThirdDayOdev.Odev2.StaticDemo;

public class ProductValidator {

    static {
        System.out.println("Static yapici blok calisti");
    }

    //constructor
    public ProductValidator() {
        System.out.println("Yapıci blok çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey() {

    }

    //inner class genellikle gruplandırmalarda, bölümlendirmek için
    public static class BaskaBirClass{
        public static void delete(){

        }
    }
}
