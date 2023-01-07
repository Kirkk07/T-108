package day28_exceptions;

public class NullPointerExceptions extends Throwable {
    public static void main(String[] args) {
        String a=null;

        try{
            a.concat("b");
            // burda null ile Stringi concat edemeyeceginden dolayi direk NUll pionter exception sfiraltir.
            //ve Nullpinterexceptions catch blogunu bulana kadar atlar aradaki butun kodlari
        /*}catch (NullPointerExceptions e){
            a="";*/
        }
        finally {
            System.out.println(a.concat("c"));
        }
    }
}
