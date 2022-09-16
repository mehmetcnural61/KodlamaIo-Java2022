package FirstDayOdev.ReCapDemo1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    int sayi1=0;
    int sayi2;
    int enBuyuk=sayi1;

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        sayi2=input.nextInt();

        if (enBuyuk<sayi1){
            enBuyuk=sayi1;

        }
        if (enBuyuk<sayi2){
            enBuyuk=sayi2;

        }
        else if (sayi1==sayi2) {
            System.out.println("Girilen Sayilar Esit !");
        return;
        }
        System.out.println("Girilen En Buyuk: "+ enBuyuk);

    }
}
