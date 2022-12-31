package test.day03;

import java.util.ArrayList;

public class Yuze13BolumleriYazdir {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if(i%13==0){
                System.out.println(i);
                list.add(i);
                toplam+=i;

            }

        }
        System.out.println(list);
        System.out.println("Toplam: "+toplam);
    }


}
