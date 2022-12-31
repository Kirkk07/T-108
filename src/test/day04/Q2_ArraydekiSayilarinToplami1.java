package test.day04;

public class Q2_ArraydekiSayilarinToplami1 {
    //    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
        float [] numbers={1.1f,2.0f,3.2f,5.0f,7.5f};

        float toplam=0;
        System.out.println("---For Loop Cozumu---------");
        for (int i = 0; i <numbers.length ; i++) {
            toplam+=numbers[i];
        }
        System.out.println("Toplam: "+toplam);
    }

}
