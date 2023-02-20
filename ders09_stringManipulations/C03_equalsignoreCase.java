package ders09_stringManipulations;

public class C03_equalsignoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equalsIgnoreCase("Ali ")); // false çünkü sonunda boşluk var.

        // equalsIgnoreCase --> aynı metnin büyük küçük harf kullanılarak oluşturulan farklı yazımlarını birbirine eşit olarak kabul eder

        // yani equalsIgnoreCase() metodu için ali, ALI, ALi, aLi, alI, AlI, birbirine eşittir.

        // Ama kelimede farklılık varsa bunları tolere etmez. a li ile ali birbirinden farklıdır.   !(ali ile ALI.)

    }
}
