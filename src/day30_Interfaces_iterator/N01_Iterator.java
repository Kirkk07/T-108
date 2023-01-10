package day30_Interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);
    //Index kullanmada 3 arttir?
        for (Integer each:sayilar
             ) {
            System.out.print(each+3+" ");


        }
        System.out.println(" ");
        System.out.println(sayilar);
        Iterator itr= sayilar.iterator();
        //
       // index kullnmadan tum elementleri yaziniiz
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        //Tek tek degilde bir loopil e uapalim.
        System.out.println(itr.hasNext());//false
        //iteratorlda geri donus  yok
        /*
        Nereye guttuyse kalir geri donmez
        Tum listeyi loopile yeniden yazdirmak icin yeni bir itr olustrmali veya itr ye yeni deger atamaliyoz.

         */
        itr= sayilar.iterator();
        System.out.println(itr.hasNext());//False
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");}
            itr = sayilar.iterator();

            while (itr.hasNext()){
                Integer sayi=(Integer) itr.next();
                if(sayi>5){
                    itr.remove();
                }
            }
       System.out.println(" ");
            System.out.println(sayilar);
        }
    }

