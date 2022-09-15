package FirstDayOdev.SwitchDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char grade='A';



        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Gectiniz ");
                break;
            case 'B':
                System.out.println("Güzel : Gectiniz ");
            case 'C':
                System.out.println("Ortalama : Gectiniz");
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Bir Not Girdiniz");
        }
    }
}
