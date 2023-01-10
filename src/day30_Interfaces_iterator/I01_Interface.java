package day30_Interfaces_iterator;

public interface I01_Interface {
    //Interfacelerde butun methodlar public ve abstractir.
    int sayi=10;
    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    public static final String okulIsmi="YildirKoleji";
    void method5();
    void method19();

    default void method44() {
        System.out.println("Interfacedeki DEFAULT olarak isaretlenen method calisit");


    }

    static void method17() {
        System.out.println("Interfacedeki STATIC olarak isaretlenen method calisit");
    }
    /*
    Bir interfacee sonradan bir method ekleemk istedigimizde
    o interfaci daha once implement eden tum classlar yeni
    eklenen methodu implement etmek zorundadir.

    Javaya yapilan talepler sonucunda
    JAVA* ile birilikte bu konuda bir istisna getirilmisit.
    Eger sonradan eklenen methodun tum eski classlar tarafindan implement edilme mecburoyeti
    olmasin istiyorsaniz

    Yeni olusturdugumuz methodaDEFAULT VEYA STATIC  keyword ekleyip Body de olusutursaniz
    o zama bu methodun chil classlari tarafinda implmemnt edilme mecburiyeti olmaz.

    Static veya Default method isimleri arasinda fark ise;
    Static olanlar InterfaceIsmi.methodIsmi ilecagrilirken
    Default olanlar obje ile cagrilirdir.
     */




}
