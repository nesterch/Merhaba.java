package Projeler;

import java.util.Scanner;

public class _kahve_mak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Süt eklememizi ister misiniz? (evet veya hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");

                break;
            } else if (cevap.equalsIgnoreCase("hayır")) {
                System.out.println("Süt eklenmiyor.");
                break;
            }  
        }
        System.out.println("Program sonlandırılıyor...");
    }
}


