package ThirdDayOdev.Odev2.PolymorphismDemo;

public class Main {

    public static void main(String[] args) {

        //plug & play
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),
                new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};

        for (BaseLogger logger:loggers){
            logger.log("Log Mesaji");
        }
        System.out.println("----");

        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
