package Gun23;

import java.util.HashSet;

public class _01_Konu {
    public static void main(String[] args) {

        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendimi=hs1.add(5);
        hs1.add(2);

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendimi = " + eklendimi);
                
    }
}
