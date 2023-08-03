package Gun30._04_Soru;

public class Sabitler {
    static int birGundekiSaatSayisi= 24;
     static int birSaattekiDakikaSayisi= 60;
     static int birDakikadakiSaniyeSayisi= 60;

    public static int hesapla(int gun, int saat, int dak){
        int toplamSaniye=
                gun
                        * Sabitler.birGundekiSaatSayisi
                        * Sabitler.birSaattekiDakikaSayisi
                        * Sabitler.birDakikadakiSaniyeSayisi
                        +
                        saat
                                * Sabitler.birSaattekiDakikaSayisi
                                * Sabitler.birDakikadakiSaniyeSayisi
                        +
                        dak
                                * Sabitler.birDakikadakiSaniyeSayisi;

        return toplamSaniye;
    }

}

