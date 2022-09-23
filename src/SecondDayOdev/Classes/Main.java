package SecondDayOdev.Classes;

public class Main {
    public static void main(String[] args) {

        //değişken oluşturur gibi isim verdik for eg. int sayi; , String mesaj;
        // Classes reference type

        //CM referans no = CM2 referans 2 stack to ==> CM2 heap
        //herhangi referansı tutan kimse kalmazsa GC (Garbage Collector) heap'ta kalanı temizliyor
        //new pahalıdır !
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //dizilerde referans tiptir
        int[] sayilar1= new int[]{1,2,3};
        int[] sayilar2= new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);


    }
}
