package day27_overriding;

public class Runner {
    public static void main(String[] args) {
        c obj1=new c();
        obj1.create();
        u obj2 =new d();
        obj2.update();
        r obj3=new r();
        obj3.read();
        new d().delete();
    }
}
class c{
    public void create(){
        System.out.println("c");
    }
}class u{
     void update(){
        System.out.println("u");
    }
}
class r extends c{
    public void create(){
        System.out.println("C");
    } protected void read(){
        System.out.println("R");
    }
}class d extends u{
    void update(){
        System.out.println("U");
    }void delete(){
        System.out.println("d");
    }
}
