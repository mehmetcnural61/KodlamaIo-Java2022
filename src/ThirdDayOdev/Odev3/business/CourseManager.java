package ThirdDayOdev.Odev3.business;

import ThirdDayOdev.Odev3.dataAccess.course.ICourseDao;
import ThirdDayOdev.Odev3.entities.Course;
import ThirdDayOdev.Odev3.logging.Logger;

public class CourseManager {
    private ICourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(ICourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {new Course(1, "Java", "Backend programing", 10), new Course(2, "Javascript", "Frontend programing", 25)};
        for (Course c : courses) {
            if (course.getName() == c.getName()) {
                throw new Exception("Kurs ismi tekrar edemez.");
            } else if (course.getPrice() < 0) {
                throw new Exception("Bir kursun fiyati 0 dan kucuk olamaz.");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
