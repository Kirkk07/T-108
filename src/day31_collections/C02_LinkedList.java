package day31_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List data turunde bir LinkedList olusturalim.
        List<String> harfler =new ArrayList<>();
        harfler.add("H");
        harfler.add("K");
        System.out.println(harfler);
        harfler.add("H");
        System.out.println(harfler);
        harfler.add(1,"M");
        System.out.println(harfler);
        harfler.set(2,"L");
        System.out.println(harfler);
        List<String> karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");
        System.out.println(karakterler);

        System.out.println("A:  "  +harfler.retainAll(karakterler));//Direk yazdirirsak true yapti. TUre

        System.out.println(harfler);// Ortak elementlerin disindaki herseyi sildi. Retain /;

        harfler.addAll(karakterler);//[M, *, #, M, 9]
        System.out.println(harfler);

        System.out.println(harfler.removeAll(karakterler));
        System.out.println(harfler);


        System.out.println( karakterler.subList(1,4));
        System.out.println(karakterler);
        System.out.println(karakterler.hashCode());//Her bilgisayarda ayni objenin kodudur.
        System.out.println(harfler.hashCode());




    }
}
