package belajar.java.equals;

import java.util.Objects;

public class BelajarEqualsMethod {
    private String name = "Mathius";
    private Integer age = 22;

    public String getName() {
        return this.name;
    }

    /*public boolean equals2(Object o) {
        if(this == o) return true;

        if(!(o instanceof BelajarEqualsMethod)) return false;

        BelajarEqualsMethod belajarEqualsMethod = (BelajarEqualsMethod) o;

        if(age != belajarEqualsMethod.age) return false;
        return (name != null) ? name.equals(belajarEqualsMethod.name) : belajarEqualsMethod.name == null;
    }*/

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BelajarEqualsMethod that = (BelajarEqualsMethod) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
