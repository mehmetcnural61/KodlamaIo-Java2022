package FirstDayOdev.ReCapDemo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1,sayi2;

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayi'yi Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("2.Sayi'yi Giriniz: ");
        sayi2=input.nextInt();

        if (sayi1<sayi2){
            System.out.println("Girilen 2.Sayi , 1.Sayi'dan buyuktur");
        } else if (sayi1>sayi2) {
            System.out.println("Girilen 1.Sayi , 2.Sayi'dan buyuktur");
        }else
            System.out.println("Sayilar esittir !");


    }
}
