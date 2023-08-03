package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        ArrayList < Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        int[]dizi={2,3,45,56};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,56,78,89));
        ArrayList<String>strList=new ArrayList<>(Arrays.asList("ayse","kaya"));

        System.out.println("liste = " + liste);


    }
}
