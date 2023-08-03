package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _03_Sets {
    public static void main(String[] args) {


        HashSet <String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        System.out.println("renkler = " + renkler);
        for (String elemam:renkler)
            System.out.println("elemam = " + elemam);

        Integer[] dizi={34,5,6,7,8,89,899,77};
        for(Integer eleman:dizi)
            System.out.println("eleman = " + eleman);


        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));
        for(Integer e:liste)
            System.out.println("e = " + e);



    }
}
