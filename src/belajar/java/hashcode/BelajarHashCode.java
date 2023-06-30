package belajar.java.hashcode;

import java.util.Objects;

public class BelajarHashCode {
    private String name = "Mathius";
    private int age = 22;

    public void setName(String value) {
        this.name = value;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BelajarHashCode that = (BelajarHashCode) o;

        if (age != that.age) return false;
        return Objects.equals(name, that.name);
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
