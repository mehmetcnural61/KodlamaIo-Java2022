package ThirdDayOdev.Odev3;

import ThirdDayOdev.Odev3.business.CategoryManager;
import ThirdDayOdev.Odev3.business.CourseManager;
import ThirdDayOdev.Odev3.business.InstructorManager;
import ThirdDayOdev.Odev3.dataAccess.category.JdbcCategoryDao;
import ThirdDayOdev.Odev3.dataAccess.course.HibernateCourseDao;
import ThirdDayOdev.Odev3.dataAccess.instructor.JdbcInstructorDao;
import ThirdDayOdev.Odev3.entities.Category;
import ThirdDayOdev.Odev3.entities.Course;
import ThirdDayOdev.Odev3.entities.Instructor;
import ThirdDayOdev.Odev3.logging.DatabaseLogger;
import ThirdDayOdev.Odev3.logging.FileLogger;
import ThirdDayOdev.Odev3.logging.Logger;
import ThirdDayOdev.Odev3.logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        Category category1 = new Category(4, "Cloud");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        System.out.println("---");

        Course course1 = new Course(3, "Kotlin", "Mobil Programing", 0);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        System.out.println("---");

        Course course2 = new Course(4, "Swift", "Mobil Programing", 0);
        CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course2);

        System.out.println("---");

        Instructor instructor = new Instructor(1, "Engin", "Demirog");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);


    }
}
