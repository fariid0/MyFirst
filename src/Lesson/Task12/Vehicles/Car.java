package src.Lesson.Task12.Vehicles;

import java.util.Objects;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numDoors == car.numDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numDoors);
    }

    @Override
    public String toString() {
        return "Car " +
                ", Make: " + make +
                ", Model: " + model +
                "numDoors: " + numDoors;
    }
}
