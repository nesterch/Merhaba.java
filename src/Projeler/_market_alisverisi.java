package Projeler;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class _market_alisverisi {

    Scanner oku=new Scanner(System.in);

    public static void main(String[] args) {

        int[] dizi=new int[4];
        String urunler;
        double Fiyat=0;
        int stok=0;
        int Tl=0;

        String cevap;

        String [] urunler1={"cay", "kahve","sut","seker","un","tereyag"};
        ArrayList<String> liste  = new ArrayList<>(Arrays.asList(urunler1));

        Integer[] fiyat1 = new Integer[]{35, 45, 25, 16, 20, 40};
        ArrayList<Integer> Integerliste = new ArrayList<>(Arrays.asList(fiyat1));

        Integer[] stok1 = {200, 350, 150, 250, 400, 500};
        ArrayList<Integer> liste3 = new ArrayList<>(Arrays.asList(stok1));

do {
    System.out.println("Alisveris listesi = ");
    for (int i = 0; i < urunler1.length; i++) {
                System.out.println((i + 1) + ". urun: " + urunler1[i] + " <<< Fiyat:  " + fiyat1[i] + " TL ");
    }
}while (urunsecici());

    }
    public static boolean urunsecici(){

        Scanner oku = new Scanner(System.in);
        System.out.println("Seciminizi yapin lutfen");
        int urunindexsi = oku.nextInt() - 1;

        System.out.println("Urun miktari girin lutfen: ");
        int miktar = oku.nextInt();
        System.out.println("devam etmek istermisiniz? (E/H)");
        String cevap = oku.next();

        return cevap.equalsIgnoreCase("E");


}
}