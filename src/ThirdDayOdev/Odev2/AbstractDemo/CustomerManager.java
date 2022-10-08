package ThirdDayOdev.Odev2.AbstractDemo;

public class CustomerManager {

    //stratejimiz hangi veri tabanı kullanmak istiyorsak mainde  çağırıyoruz
    BaseDatabaseManager databaseManager;

    public void getCustomers(){

        databaseManager.getData();

    }
}
