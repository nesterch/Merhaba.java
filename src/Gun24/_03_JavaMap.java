package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        Map <Integer , String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);

        Map <Integer , String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kus");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);



    }
}
