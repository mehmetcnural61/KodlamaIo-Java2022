package ThirdDay.oopWithNLayeredApp.dataAccess;

import ThirdDay.oopWithNLayeredApp.entities.Product;

//ProductDao kurallarına uyan bir sınıfsın
public class JdbcProductDao implements ProductDao {

    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır.SQL
        System.out.println("JDBC ile veritabanina eklendi !");
    }
}
