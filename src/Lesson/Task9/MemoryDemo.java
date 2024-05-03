package src.Lesson.Task9;

public class MemoryDemo {
    String cumle;
    int reqem;

    public MemoryDemo(String cumle, int reqem) {
        this.cumle = cumle;
        this.reqem = reqem;
    }

    @Override
    public String toString() {
        return "MemoryDemo: " +
                "cumle: " + cumle + '\'' +
                ", reqem: " + reqem;
    }

    public String getCumle() {
        return cumle;
    }

    public int getReqem() {
        return reqem;
    }
}
