package SecondDayOdev.MiniProje5SayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                System.out.println("Sayi Mevcuttur");
            }else
                System.out.println("Sayi Mevcut Değildir.");


    }
}
