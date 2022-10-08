package ThirdDayOdev.Odev2.AbstractClasses;

public class Main {

    //Abstract sınıflar new'lenemez fakat kullanmak istenirse ezmeniz gerekmete kullanmak için

    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();


        GameCalculator gameCalculator=new KidsGameCalculator();
    }
}
