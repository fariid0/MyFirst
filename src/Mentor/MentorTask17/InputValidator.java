package src.Mentor.MentorTask17;

public class InputValidator {
    static boolean validateNumberImput(String a) {
        return a.matches("[0-9]+");
    }

    static boolean validateStringImput(String a) {
        return a.matches("[a-zA-Z]+");
    }

    static boolean validateSpecialCharacterImput(String a) {
        return a.matches("[a-zA-Z\\p{Punct}]+");
    }

    static boolean validateQarisiq(String a) {
        return a.matches(".*");
    }


    public static InputCategory categorizeInput(String input) {
        if (validateNumberImput(input))
            return InputCategory.NUMBER;
        else if (validateStringImput(input))
            return InputCategory.TEXT;
        else if (validateSpecialCharacterImput(input))
            return InputCategory.SPECIAL_CHARACTER;
        else if (validateQarisiq(input))
            return InputCategory.QARISIQ;
        else return null;
    }
}