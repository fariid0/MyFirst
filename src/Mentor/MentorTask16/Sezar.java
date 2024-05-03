package src.Mentor.MentorTask16;

public class Sezar {

    public static String encrypt(String text, int key){
        StringBuilder encryptText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char shift = (char) ('A' + (Character.toUpperCase(ch) - 'A' + key) % 26);
                if (Character.isLowerCase(ch))
                    shift = Character.toLowerCase(shift);
                encryptText.append(shift);
            } else {
                encryptText.append(ch);
            }
        }
        return encryptText.toString();
    }

    public static String decrypt (String encyptText, int key) {
        return encrypt(encyptText, 26 - key);
    }
}
