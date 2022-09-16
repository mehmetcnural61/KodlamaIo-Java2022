package FirstDayOdev.LoopDoWhile;

public class Main {
    public static void main(String[] args) {
        // Do While şart sağlanmasa bile bir kere çalışıcaktır
        int j=1;

        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do While Dongusu Bitti !");



    }
}
