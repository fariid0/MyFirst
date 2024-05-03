package src.Lesson.Task12.Vehicles;

import java.util.Objects;

public class Bike extends Vehicle {
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return numWheels == bike.numWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numWheels);
    }

    @Override
    public String toString() {
        return "Bike " +
                ", Make: " + make +
                ", Model: " + model +
                "numWheels: " + numWheels;
    }
}
