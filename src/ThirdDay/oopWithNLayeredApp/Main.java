package ThirdDay.oopWithNLayeredApp;

import ThirdDay.oopWithNLayeredApp.Business.ProductManager;
import ThirdDay.oopWithNLayeredApp.core.logging.DatabaseLogger;
import ThirdDay.oopWithNLayeredApp.core.logging.FileLogger;
import ThirdDay.oopWithNLayeredApp.core.logging.Logger;
import ThirdDay.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import ThirdDay.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import ThirdDay.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"Iphone XR",1000);

        Logger[] loggers={new DatabaseLogger(),new FileLogger()};

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
