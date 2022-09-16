package FirstDayOdev.mükemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
         * Diğer bir ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin
         * toplamının yarısına eşittir. */


        // 6--> 1,2,3
        //28--> 1,2,4,7,14

        int number=0;
        int total=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz Sayiyi Giriniz: ");
        number=input.nextInt();

        for (int i=1; i<number; i++){
            if (number % i ==0) {
                total=total+i;
            }
        }

        if (total == number){
            System.out.println("Mükemmel Sayidir");
        }else {
            System.out.println("Mükemmel Sayi Değildir !");
        }


    }
}
