package ThirdDayOdev.Odev1;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void Calculate() {
        //Öğretmen kredisine göre hesaplamalar
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }

    @Override
    public void Save() {
        super.Save();
    }
}
