package ThirdDayOdev.Odev3.dataAccess.course;

import ThirdDayOdev.Odev3.entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanina eklendi : " + course.getName());
    }
}
