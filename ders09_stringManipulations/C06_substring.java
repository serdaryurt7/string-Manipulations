package ders09_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.substring(5)); // ogren, isi kap

        System.out.println(str.substring(0)); // Java ogren, isi kap

        System.out.println(str.length()); // 19

        // Son karakteri String olarak kaydedin.

        String sonHarf = ""+str.charAt(str.length() - 1);

        sonHarf = str.substring(str.length()-1); // str.length()-1 son karakteri veriyor. Substring ise o indexten son'a kadar yazdırır.

        System.out.println(sonHarf); // p

        // Son indexteki karakteri uppercase olarak yazdırın.

        System.out.println(str.substring(str.length()-1).toUpperCase()); // P

        // Son 3 harfi büyük harf olarak yazdırın.

        System.out.println(str.substring(str.length()-3).toUpperCase());

    }
}
