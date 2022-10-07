package ThirdDayOdev.Odev2.ConstructorCalismak;

public class Product {
    public Product(int id,String name,String description,double price){
        System.out.println("Yapici blok calisti");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;

    }
    public  Product(){

    }

    private int id;
    private String name;
    private String description;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
