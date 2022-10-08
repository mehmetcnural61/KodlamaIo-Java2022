package ThirdDayOdev.Odev2.Overriding;


/**
 * public final double hesapla(double tutar){
 *          return tutar * 1.18;
 * }
 */

public class BaseKrediManager {
    //overridable without final !!
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}
