package FirstDayOdev.StringsDemo2;

public class Main {
    public static void main(String[] args) {
    String mesaj= "Bügün hava çok güzel !";

        // neyi * ne ile değiştirmek istiyoruz
        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj);

        System.out.println("=====");

        /** Hafızada tutmak için değişkene atarak kullandık */
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        //kaçıncı indexten itibaren
        System.out.println(mesaj.substring(2));
        //x'ci indexten başlayıp y indexine'e kadar
        System.out.println(mesaj.substring(2,5));

        System.out.println("===");

        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println("===");

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println("===");

        // baş ve sondaki boşlukları kesiyoruz
        System.out.println(mesaj.trim());

    }
}
