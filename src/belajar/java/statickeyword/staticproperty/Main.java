package belajar.java.statickeyword.staticproperty;

// import static
// untuk import setiap static method,property dan inner class
// import satu-persatu
//import static belajar.java.statickeyword.staticproperty.Sua.CPUS;
//import static belajar.java.statickeyword.staticproperty.Sua.name;
//import static belajar.java.statickeyword.staticproperty.Sua.boyfriend;
//import static belajar.java.statickeyword.staticproperty.Sua.sayHello;
//import static belajar.java.statickeyword.staticproperty.Sua.Love;

// impoty all
import static belajar.java.statickeyword.staticproperty.Sua.*;
public class Main {
    public static void main(String[] args) {
        /*System.out.println(Sua.name + "-chan no koibito wa " + Sua.boyfriend + " desu.");
        System.out.println(Sua.sayHello());

        var ily = new Sua.Love();
        ily.showYourLove();
        System.out.println(Sua.CPUS);*/

        System.out.println(name + "-chan no koibito wa " + boyfriend + " desu.");
        System.out.println(sayHello());

        var ily = new Love();
        ily.showYourLove();
        System.out.println(CPUS);
    }
}
