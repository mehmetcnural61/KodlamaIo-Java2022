package ThirdDayOdev.Odev3.dataAccess.category;


import ThirdDayOdev.Odev3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanina eklendi : " + category.getName());
    }
}
