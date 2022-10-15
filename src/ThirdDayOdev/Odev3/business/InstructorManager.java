package ThirdDayOdev.Odev3.business;

import ThirdDayOdev.Odev3.dataAccess.instructor.IinstructorDao;
import ThirdDayOdev.Odev3.entities.Instructor;
import ThirdDayOdev.Odev3.logging.Logger;


public class InstructorManager {
    private IinstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(IinstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getName() + " " + instructor.getLastName());
        }
    }
}