package FirstDayOdev.miniProjeAsalSayi;

public class Main {
    public static void main(String[] args) {

        // 25'in bölümünden kalan

        int number = 1;
        int remainder = number % 2;
     //   System.out.println(remainder);
        boolean isPrime =true;

        if (number==1){
            System.out.println("Sayi Asal Değildir !");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz bir sayi girdiniz !");
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        /** if (isPrime==true) aşağıdaki kullanım ile aynı ! */

        if (isPrime){
            System.out.println("Sayi Asaldir !");
        }else
            System.out.println("Sayi Asal Değildir !");
    }
}
