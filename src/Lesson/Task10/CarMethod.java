package src.Lesson.Task10;

public class CarMethod {
    String make;
    String model;
    int publicationYear;
    int wheelsCount;

    public CarMethod(String make, String model, int publicationYear, int wheelsCount) {
        this.make = make;
        this.model = model;
        this.publicationYear = publicationYear;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public String toString() {
        return "CarMethod: " +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", publicationYear=" + publicationYear +
                ", wheelsCount=" + wheelsCount;
    }
}



