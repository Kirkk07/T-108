package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String> harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("k");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);
        //Queue kuyruk oldugu icin first in first out.
        //1.Indexe F Ekle diyemezsin. cunku bu kuyruk. En sona ekleyebilirisn. kiyrukta kaynak olmaz.
        //remove is bastan olur.
        System.out.println("A: "+harfler.remove());
        System.out.println(harfler);
        System.out.println(harfler.remove("K"));// True doner. yani kaldirdim yada kaldiramadim.
        //AYni iki elmenti remove istersek en bastakini yani ilk buldugunu sile.

        System.out.println(harfler.element());// QUENin basindaki elementi donderirmis ama silmezmis.
        // bos bir arrayda ise exception firlatir;

        System.out.println(harfler);
        System.out.println(harfler.peek());
        //Queqenin basindaki elmenti donderir ama silez
        //Bos bir arrada ise null donderir.
        Queue<String> karakterler=new LinkedList<>();
        System.out.println(karakterler.peek());
        //Poll.() Retrieves and reamoves head of this queueor returns if this queue is empty

        harfler.offer("C");
        System.out.println("HArfler"+harfler);
        //Offer kapasiteyi kontrol eder kapasite varsa eger ekler
        //Ancak add her durumda ekler.
    }
}
