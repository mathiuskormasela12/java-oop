package belajar.java.reflection;

public class Main {
    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setFirstName("Mathius");
        userDto.setLastName("Love Yerin");
        Validation.checkBody(userDto);
    }
}
