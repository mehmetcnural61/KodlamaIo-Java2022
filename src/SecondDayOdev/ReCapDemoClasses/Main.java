package SecondDayOdev.ReCapDemoClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int  n1,n2,select;
        Scanner input=new Scanner(System.in);

        DortIslem dortIslem=new DortIslem();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz ?: ");
        select=input.nextInt();


        System.out.print("1.sayiyi giriniz: ");
        n1=input.nextInt();
        System.out.print("2.sayiyi giriniz: ");
        n2=input.nextInt();


        if(select ==1){
            System.out.println("Toplam Sonuc: "+ (n1+n2));
        } else if (select ==2) {
            System.out.println("Cikarma Sonuc: "+ (n1-n2));
        } else if (select==3) {
            System.out.println("Carpma Sonuc: "+ (n1*n2));
        }else if (select==4) {
            if(n2!=0){
                System.out.println("Bolme Sonuc: "+ (n1/n2));
            }else
                System.out.println("Bir Sayi 0'a bolunemez !");
        }else {
            System.out.println("Hatali Giris Yapildi !! Tekrar Deneyiniz");
        }



    }
}
