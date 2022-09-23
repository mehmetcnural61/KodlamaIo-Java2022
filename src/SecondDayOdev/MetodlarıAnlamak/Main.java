package SecondDayOdev.MetodlarıAnlamak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }
    //camel Casing
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{0,1,2,5,7,9,10,12,13,15,19,21};
        int aranacak ;
        boolean isThere=false;

        Scanner input = new Scanner(System.in);
        System.out.print("Aramak istediğiniz sayiyi giriniz: ");
        aranacak=input.nextInt();

        for (int sayi:sayilar){
            if (sayi==aranacak){
                isThere=true;
                break;
            }
        }
        if (isThere){
            mesajVer("Sayi Mevcuttur ==>" +aranacak);
        }else
            mesajVer("Sayi Mevcut Değildir ! ==>"+aranacak);

    }


    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}
