package ders09_stringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        // Substring metodunun ilk değeri "begin" son değeri "end" Tek değer girilirse "begin" başlangıçtan sona kadar gider.

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8)); // gun
        // 5.indexten başlar (8-5) karakter yazdırır. 5.index dahil(inclusive) , 8.index hariç(exclusive)

        // gectikce'yi yazdırın.

        System.out.println(str.substring(9,17)); // gectikce
        System.out.println(str.substring(3,7)); // a gu

        String isim = "huseYIN";   // verilen ismi ilk harfi büyük, geriye kalanlar küçük harf olarak kaydedin.

        isim = isim.substring(0,1).toUpperCase() +  // ilk harfi alıp büyük harf yaptık.
                isim.substring(1).toLowerCase(); // 1. indexten sonrasını alıp küçük harf yaptık.

        // Buradaki artı birleştirmek Concrate etmek için kullanıldı.

        System.out.println(isim);


        //Sadece 3. indexteki harfi yazdır. e

        System.out.println(isim.substring(3, 4)); // e


        System.out.println("Zor sorunun cevabı: " + isim.substring(3,3)); // "" hiclik yazdırır.

        // System.out.println(isim.substring(5, 2)); // StringIndexOutOfBoundsException


    }
}
