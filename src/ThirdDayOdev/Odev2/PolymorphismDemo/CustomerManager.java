package ThirdDayOdev.Odev2.PolymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;

    //çalıştığın logger kim?
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Musteri Eklendi");
        this.logger.log("Log Mesaji");

//    DatabaseLogger logger=new DatabaseLogger();
//    logger.log("Log Mesaji");
    }
}
