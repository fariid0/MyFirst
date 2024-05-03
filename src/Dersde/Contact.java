package src.Dersde;

import java.util.Objects;

public class Contact {
    String name;
    int phoneNuber;

    public Contact(String name, int phoneNuber) {
        this.name = name;
        this.phoneNuber = phoneNuber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNuber() {
        return phoneNuber;
    }

    public void setPhoneNuber(int phoneNuber) {
        this.phoneNuber = phoneNuber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNuber == contact.phoneNuber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNuber);
    }

    @Override
    public String toString() {
        return "Contact: " +
                "Name: " + name +
                ", PhoneNuber: " + phoneNuber;
    }
}
