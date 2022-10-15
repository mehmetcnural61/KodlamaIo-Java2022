package ThirdDayOdev.Odev3.business;

import ThirdDayOdev.Odev3.dataAccess.category.ICategoryDao;
import ThirdDayOdev.Odev3.entities.Category;
import ThirdDayOdev.Odev3.logging.Logger;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        Category[] categories = {new Category(1, "Backend"), new Category(2, "Frontend"), new Category(3, "Mobile")};
        for (Category c : categories) {
            if (category.getName() == c.getName()) {
                throw new Exception("Kategori ismi tekrar edemez.");
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
