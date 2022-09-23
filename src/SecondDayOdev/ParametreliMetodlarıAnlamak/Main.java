package SecondDayOdev.ParametreliMetodlarıAnlamak;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        //başlangıç dahil bitiş dahil değil
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);

        System.out.println("====");
        System.out.println(sehirVer());
        int sayi=topla(5,7);
        System.out.println(sayi);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    //bu fonk int türünde bir değer döndürür bitir ve değer döndür(5)!
    public static int topla(int sayi1,int sayi2) {
        return sayi1+sayi2;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
