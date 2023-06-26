public class Main {
    public static void main(String[] args) {
//        BasicOop yerin = new BasicOop("Yerin");
//        yerin.sayHello();
//
//        var umji = new BasicOop();
//        umji.sayHello();

        BasicOop sowon = new BasicOop("Sojung", "Kim", 28);
        // Mengubah properterty object
        sowon.firstName = "wkwkw";
        // Call method test
        sowon.test("Sowon");
    }
}