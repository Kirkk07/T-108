package day29_final_abstractClasses;

public class Echild extends DParent{

    /*
    Klasik inheritance ile parent child iliskisi olusturdugumuzda Parent Classdaki tum ozellikleri otomatik kazaziriz.
    ancal Methodlaro override etme MECBURIYETI YOKTR.
    Ister override edip kendimize ozellestiririz
    Istersek de parent classdaki haliyle kullaniriz.


    Oyle bir parent olusturalim ki istedigimiz methodlari childlarimiz mecburen override etsinler.

     */
    @Override
    public void method1() {
        System.out.println("Parent Classdaki mecburi override edilecek Method 1.");

    }

    @Override
    public void method2() {
        System.out.println("Parent Classdaki mecburi override edilecek Method 2.");
    }

    @Override
    public void method3() {
        super.method3();
    }

    public static void main(String[] args) {
     //   DParent obj1 = new DParent() //Abstract classalrin constructerlari vardir ancak obje olusturulamz.
        Echild echild1=new Echild();
        echild1.method1();;
        echild1.method2();
        echild1.method3();
        DParent ch2=new Echild();
        ch2.method1();
        ch2.method2();
        ch2.method3();
    }}

