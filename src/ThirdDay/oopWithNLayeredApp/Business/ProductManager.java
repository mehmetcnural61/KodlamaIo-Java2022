package ThirdDay.oopWithNLayeredApp.Business;


import ThirdDay.oopWithNLayeredApp.core.logging.Logger;
import ThirdDay.oopWithNLayeredApp.dataAccess.ProductDao;
import ThirdDay.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

//bu methodu çağırdığında böyle bir hata fırlatabilir

    public void add(Product product) throws Exception {
        //iş kuralları (Business Roles)
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz !");
        }
        productDao.add(product);

        // [db,mail]
        for (Logger logger:loggers){
            logger.log(product.getName());
        }




    }
}
