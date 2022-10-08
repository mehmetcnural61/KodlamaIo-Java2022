package ThirdDayOdev.Odev2.AbstractClasses;

/**
 *  zorunlu operasyonlar içi ayrı ayrı herkesin ayrı doldurması gereken op.
 * Base Referans tutucu , kuralları ortaya koyan görevini görüyor..!
 * */

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Oyun Bitti");
    }
}
