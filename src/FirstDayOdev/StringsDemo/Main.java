package FirstDayOdev.StringsDemo;

public class Main {
    public static void main(String[] args) {
        //boşlukta bir karakterdir !

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman Sayisi: "+mesaj.length());

        // 5.elemanı yazdırdık
        System.out.println("5.eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println("===");

        // B ile başlıyormu True or False
        System.out.println(mesaj.startsWith("B"));
        // .Nokta ile mi bitiyor ? True or False
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];

        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println("====");

        // a kaçıncı karakter metinde araya biliriz for eg "av"
        System.out.println(mesaj.indexOf('a'));
        // aramaya sağ yani sondan başlıyor
        System.out.println(mesaj.lastIndexOf("e"));
    }
}
