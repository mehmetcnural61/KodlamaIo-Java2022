package ThirdDayOdev.Odev1;

public class Main {
    public static void main(String[] args) {
/*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer(); //instance creation
        customer.Id = 1;
        customer.City="İzmir";


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company=new Company();
        company.TaxNumber="6161";
        company.CompanyName="Bosch";
        company.Id=100;

        CustomerManager customerManager2=new CustomerManager(new Person());

        Person person=new Person();
        person.FirstName="Mehmet";
        person.NationalIdentity="12345";

        Customer c1=new Customer();
        Customer c2=new Person();
        Customer c3=new Company();
*/
        /**Bir sınıf sadece bir sınıfı inherent edebilir.
         * Bir sınıf birden fazla sınıfı implemente edebilir */

        // Ioc Container
        CustomerManager customerManager=new CustomerManager(new Customer(),new CarCreditManager());
        customerManager.GiveCredit();


    }
}
