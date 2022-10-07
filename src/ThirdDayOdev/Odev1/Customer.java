package ThirdDayOdev.Odev1;

public class Customer {

    public Customer() {
        System.out.println("Musteri Nesnesi Baslatildi");
    }

    public int Id;


    public String City;


    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


}
