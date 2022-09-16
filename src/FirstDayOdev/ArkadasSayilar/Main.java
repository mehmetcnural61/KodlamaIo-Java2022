package FirstDayOdev.ArkadasSayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse
         * bu sayılara arkadaş sayılar denir.
         * Örnek: 220 ve 284
         * 220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
         * 284 : 1 + 2 + 4 + 71 + 142 = 220 */

        int sayi1=0;
        int sayi2=0;
        int toplam1=0;
        int toplam2=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("İkinci Sayiyi Giriniz:");
        sayi2=input.nextInt();

        for (int i=1; i<sayi1; i++ ){
            if (sayi1 % i == 0){
                toplam1=toplam1+i;
            }
        }
        for (int i=1; i<sayi2; i++ ){
            if (sayi2 % i == 0){
                toplam2=toplam2+i;
            }
        }
      /**
        if (sayi1==toplam2){
            if (sayi2==toplam1){

            }
        }
*/ //Daha Clean bir version AND ile &&

        if (sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki Sayi Arkadaştır");
        }else
            System.out.println("Bu iki Sayi Arkadaş Değildir !");

    }
}
