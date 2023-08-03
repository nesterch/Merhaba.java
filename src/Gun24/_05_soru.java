package Gun24;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        Map<String, String> sozluk = new HashMap<>();
        Scanner oku = new Scanner(System.in);
        do {
            System.out.println("----- Canlı Sözlük -----");
            System.out.println("1- Ekleme");
            System.out.println("2- Düzeltme");
            System.out.println("3- Listeleme");
            System.out.println("4- Arama");
            System.out.println("5- Silme");
            System.out.println("6- Çıkış");
            System.out.print("Seçiminizi yapın: ");


        } while (true);


    }
}
