package FirstDay;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("===");
        //değişken isimlendirmeleri java'da camelcase yazılır !
        String ortaMetin="Ilginizi Cekebilir";
        String altMetin="Vade Süresi";

        System.out.println(ortaMetin);
        System.out.println("===");
        int vade =12;

        double dolarDun = 18.25;
        double dolarBugun = 18.30;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun){
            okYonu ="down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu="up.svg";
            System.out.println(okYonu);
        } else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }
        System.out.println("===");

    /*
        String kredi1="Hızlı Kredi";
        String kredi2="Kredi X";
        String kredi3="Kredi Y";

          String[] krediler= {"Hizli Kredi","Maasini Halkbanktan","Mutlu Emekli"};

            System.out.println(krediler[0]);
            System.out.println(krediler[1]);
            System.out.println(krediler[2]);
     */
        // Array

        String[] krediler= {"Hizli Kredi","Maasini Halkbanktan","Mutlu Emekli"};



       for(int i= 0; i < krediler.length; i++){
           System.out.println(krediler[i]);
       }
    }
}
