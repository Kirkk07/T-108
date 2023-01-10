package day30_Interfaces_iterator;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface{
    /*
    Bir class baska bir classa extends keywords ile parent edinebilir.
    Ancak birden fazla classi parent edinemez.
    Interfaceler icin boyle bir sinirlama yoktur.
    Bir class istedigi kadar interfacei implemen edebilir.
     */
    @Override
    public void method1() {

    }



    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method19() {

    }

    @Override
    public void method44() {


    }

    @Override
    public int method6() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I01_Interface.sayi);
        //Cannot sign a value fto final
//Interfacede olusturulan static veya default olarak isaretlene methodlarin farki
     /*   Static olana interface isimi.Staticmethod ismi sekilind  ulasabilirken
                default olana obje child classtan olusturulacak obje uzerinden erisilebilir.*/
I01_Interface.method17();
M01_ChildOfInterface obj=new M01_ChildOfInterface();
      obj.method44();

    }
}
