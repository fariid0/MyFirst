package src.Mentor.MentorTask14;

public class Password {

    static void validatePassword(String password) throws InvalidPasswordException{
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

        if (!password.matches(pattern)){
            throw new InvalidPasswordException("Invalid password!");
        }

    }
}
