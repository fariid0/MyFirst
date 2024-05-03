package src.Mentor.MentorTask20;

public class Role {
    String name;
    int expectedAge;
    int minSkill;

    public Role(String name, int expectedAge, int minSkill) {
        this.name = name;
        this.expectedAge = expectedAge;
        this.minSkill = minSkill;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", expectedAge=" + expectedAge +
                ", minSkill=" + minSkill +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpectedAge() {
        return expectedAge;
    }

    public void setExpectedAge(int expectedAge) {
        this.expectedAge = expectedAge;
    }

    public int getMinSkill() {
        return minSkill;
    }

    public void setMinSkill(int minSkill) {
        this.minSkill = minSkill;
    }
}
