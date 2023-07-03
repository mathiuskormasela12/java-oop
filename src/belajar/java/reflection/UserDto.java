package belajar.java.reflection;

public class UserDto {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
