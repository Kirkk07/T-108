package test.day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_ArraylerinOrtakElemaniniBulma1 {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {
        String [] array1=new String[5];
        System.out.println("array1 referansi"+array1);//Driek yazdirirsak referansini dondurur
        System.out.println("Array 1 yazdirmak isitiyorsak ise"+ Arrays.toString(array1));
        array1[0]="John";
        System.out.println(Arrays.toString(array1));
        array1[1]="brad";
        array1[2]="sofiA";
        array1[3]="emily";
        array1[4]="graace";
        System.out.println("Array1: "+Arrays.toString(array1));
        String[]array2={"sofia","brad","grace","emily","hazel"};
        System.out.println("Array2: "+Arrays.toString(array2));
        ortakEleman(array1,array2);


    }

    public static void ortakEleman(String[] array1, String[] array2) {
        ArrayList<String>arrList=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i].equalsIgnoreCase(array2[j])){
                    arrList.add(array1[i]);
                }

            }
        }
        System.out.println("Ortak elemanlarin oldugu arr: "+arrList);
    }
}
