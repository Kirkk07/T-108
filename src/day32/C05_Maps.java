package day32;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=new HashMap<>();
        //  Key       Value
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Kirk-John-11-T-MF");
        ogrenciMap.put(103,"Ahmet-Can-10-H-MF");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Kirk-John-11-T-MF, 103=Ahmet-Can-10-H-MF, 104=Ayse-Can-10-H-MF}
        System.out.println(ogrenciMap.size());//4
        //103 numarali bir ogenci var mi?
        System.out.println(ogrenciMap.containsKey(103));//True

        //Ali diye bir ogrenci var mi?
        System.out.println(ogrenciMap.containsValue("Ali"));// false dondu
        // Cunku setteki gibi sadece bir ali diye bir bilgi yok
        // value degerlerinin hepsini aratirsak bulabiliri.z

        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF"));//True


    }
}
