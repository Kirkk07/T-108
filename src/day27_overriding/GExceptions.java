package day27_overriding;

public class GExceptions {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        System.out.println("Iki sayinin bolumu: "+(a/b));
        if(b==0){
            System.out.println("Bolum 0 olamaz.");
        }
    }
}
