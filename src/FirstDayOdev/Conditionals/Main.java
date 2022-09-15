package FirstDayOdev.Conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        sayi=input.nextInt();

        if (sayi<20){
            System.out.println("Girilen Sayi 20'den kucuk");
        } else if (sayi>20) {
            System.out.println("Girilen Sayi 20'den buyuk");
        }else
            System.out.println("Sayi 20'ye esit");

        /**
         * else if (sayi ==20) şeklindede eşitliği kontrol edebilirdik */
    }
}
