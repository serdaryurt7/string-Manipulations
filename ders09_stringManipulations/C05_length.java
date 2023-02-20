package ders09_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 34

        // Son karakteri yazdırın.

        System.out.println(str.charAt(str.length()-1));  // son karakteri elde etmek için kullanılır.

        // Sondan 3. karakteri yazdırın.

        System.out.println(str.charAt(str.length()-3));

    }
}
