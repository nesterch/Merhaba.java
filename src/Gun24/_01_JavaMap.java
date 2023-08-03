package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        HashMap< Integer , String >hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Yusuf Yilmaz");
        hm.put(2001,"Bugrahan Yildiz");
        hm.put(2001,"Elife Sözen");
        hm.put(1002,"Seda Parca");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(1001) = " + hm.get(1001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(5001);
        System.out.println("hm = " + hm);

    }
}
