package src.Lesson.Task13.StringMethod;

import java.util.Locale;

public class StringUtill {
    public void salam(String ad, String soyad){
        String concat = ad.concat(soyad);
        System.out.println(concat);
    }

    public static void salam(String ad){
        String uppercase = ad.toUpperCase();
        System.out.println(uppercase);
    }

}
