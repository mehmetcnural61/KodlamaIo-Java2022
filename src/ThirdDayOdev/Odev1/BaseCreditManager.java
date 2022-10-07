package ThirdDayOdev.Odev1;

abstract class BaseCreditManager implements ICreditManager {

    //tamamlanmamış

    public abstract void Calculate();

    //tamamlanmış içi doldurulmuş, her yerde ortak

    public void Save() {
        System.out.println("Kaydedildi");
    }
}
