package ThirdDayOdev.Odev3.dataAccess.instructor;

import ThirdDayOdev.Odev3.entities.Instructor;

public class HibernateInstructorDao implements IinstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanina eklendi : "+instructor.getName()+" "+instructor.getLastName());
    }
}
