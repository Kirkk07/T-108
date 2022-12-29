package day26_inheritance;

import java.util.ArrayList;
import java.util.List;

public class FDizelCorolla extends ECorolla {
    String motor="1.6 dizel motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="Renk Belirtilmedi";

    public static void main(String[] args) {
        /*
        bazen child class dan obje olusturmakla beraber
        bu child class'in parent classindaki hangi ozellikleri aldigini
        bilmek isteriz.

        Bu durumda data turunu constructor'i kullanilan class'in
        parent class'larindan secebiliriz.


         */
        DToyota c3= new FDizelCorolla();
        System.out.println("==========");

        System.out.println(c3.motor); // Motor belirtilmedi
        System.out.println(c3.yakit);//DC Yakit belirlitlmedi
       // System.out.println(c3.guvenlik);// CTE
       // System.out.println(c3.renk);// CTE

       // System.out.println(c3.uretimYeri);//C Cte
        System.out.println(c3.model);//C Model belirtilmedi
       // System.out.println(c3.teker);//Cte
       // System.out.println(c3.vites);//Cte
        System.out.println(c3.marka);//T Toyota
        System.out.println("==========");
        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor); //Motor Belirtilmemis
        System.out.println(c2.yakit);//Yakit belirtilmemis
        // System.out.println(c2.guvenlik);//DC
        // System.out.println(c2.renk);//DC

        System.out.println(c2.uretimYeri);//Turkiye
        System.out.println(c2.model);//Corolla
        System.out.println(c2.teker);//200.55
        System.out.println(c2.vites);//Vites belirtilmedi

        System.out.println(c2.marka);//Toyota
        System.out.println("==========");
        FDizelCorolla c1=new FDizelCorolla();
        System.out.println(c1.motor); //DC 1.6 dizel motor
        System.out.println(c1.yakit);//DC Dizel
        System.out.println(c1.guvenlik);//DC Abs
        System.out.println(c1.renk);//DC Renk Belirtilmedi

        System.out.println(c1.uretimYeri);//C Turkiye
        System.out.println(c1.model);//C Corolla
        System.out.println(c1.teker);//C 200.55
        System.out.println(c1.vites);//C Vites belirtilmedi

        System.out.println(c1.marka);//T Toyota
        /*
        bazen child class dan obje olusturmakla beraber
        bu child class'in parent classindaki hangi ozellikleri aldigini
        bilmek isteriz.

         */
        List<String>liste=new ArrayList<>();

    }
}
