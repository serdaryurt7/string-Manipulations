package ders09_stringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi verir (J)

        System.out.println(str.charAt(5)); // 5. indexteki char'ı verir.  (C)

        System.out.println(str.charAt(10)); // sonuncu karakteri yazdır.  (r)

        // bir metindeki karakter sayısı ile son index arasında bir fark vardır. Bu metin için karakter sayısı 11'dir ve son index 10'dur.

        System.out.println(str.charAt(11)); //.StringIndexOutOfBoundsException



    }
}
