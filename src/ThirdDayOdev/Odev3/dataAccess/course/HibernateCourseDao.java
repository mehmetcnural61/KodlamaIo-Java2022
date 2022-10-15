package ThirdDayOdev.Odev3.dataAccess.course;

import ThirdDayOdev.Odev3.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanina eklendi : "+course.getName());
    }
}
