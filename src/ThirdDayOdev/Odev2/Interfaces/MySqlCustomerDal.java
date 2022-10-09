package ThirdDayOdev.Odev2.Interfaces;

// Dal => Data Access Layer

public class MySqlCustomerDal implements ICustomerDal ,IRepository{

    @Override
    public void add() {
        System.out.println("My Sql Eklendi.");
    }
}
