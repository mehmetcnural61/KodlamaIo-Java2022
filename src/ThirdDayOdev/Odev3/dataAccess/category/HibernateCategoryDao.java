package ThirdDayOdev.Odev3.dataAccess.category;

import ThirdDayOdev.Odev3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi : "+category.getName());
    }
}
