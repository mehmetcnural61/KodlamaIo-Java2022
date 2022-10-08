package ThirdDayOdev.Odev2.PolymorphismDemo;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to Email: "+message);
    }
}
