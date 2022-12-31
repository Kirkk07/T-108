package test.day03;

import java.util.Scanner;

public class Q03 {
    //Girilen Stringdeki a harfi degerini bulunuz. C harfine geldiginde donguden cikilsin.
    //Bugun hava cok guzel.
    public static void main(String[] args) {
        System.out.println("Bir cumle giriniz: ");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine().toUpperCase();
        int count=0;
        for (int i =0; i < cumle.length(); i++) {
            if (cumle.charAt(i)=='A'){
                count++;
            }
            if (cumle.charAt(i)=='C'){
                break;
            }

        }
        System.out.println(cumle+"-->"+count);
    }
}
