package src.Mentor.MentorTask17;

public enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special_Character"),
    QARISIQ("Qarisiq");

    private final String value;

    InputCategory(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
