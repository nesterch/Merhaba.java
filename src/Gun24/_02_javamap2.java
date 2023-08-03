package Gun24;

import java.util.HashMap;

public class _02_javamap2 {
    public static void main(String[] args) {
        HashMap< Integer , String > hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Yusuf Yilmaz");
        hm.put(2001,"Bugrahan Yildiz");
        hm.put(2001,"Elife Sözen");
        hm.put(1002,"Seda Parca");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k: hm.keySet())
            System.out.print(k+"t");
        System.out.println();

    }
}
