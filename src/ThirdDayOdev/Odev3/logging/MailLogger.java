package ThirdDayOdev.Odev3.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail iletildi :" + data);
    }
}
