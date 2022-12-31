package test.day03;

import java.util.Scanner;

public class MukemmelSayi {
    /*
    Bir sayinin mukemmel sayi olup olmadigini kontrol eden bir method yaziniz
    bolenleri toplami kendisine esit olan sayi.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        mukemmelSayi(sayi);

    }

    public static void mukemmelSayi(int num) {
        int toplam=0;
        for (int i = 1; i <num ; i++) {
            if(num%i==0){
                toplam+=i;
            }

        }if(toplam==num){
            System.out.println(num+" Bu sayi Mukemmel bir sayidir.");
        }else{
            System.out.println(num+" Mukemmel sayi degildir");
        }
    }
}
