import anotherPackage.AnotherClass;
import anotherPackage.AnotherInterface;
import anotherPackage.GenericClass;
import anotherPackage.ThreadClass;


import java.nio.file.Path;
import java.util.ArrayList;
import java.lang.Package;


public class Main extends ThreadClass {

    @Override
    public void run() {
        System.out.println("Thread is run");
    }

    public static void main(String[] args) throws Exception {

        int a = 1;

        Main main = new Main();
        main.start();




//
//        GenericClass<Double, Integer> genericClass = new GenericClass(1.5, "hey", 1);
//        genericClass.print();
//
//        ArrayList<AnotherClass> ab = new ArrayList<>();
//        ab.add(new AnotherClass());
//
//
//        shout("coool", 1, 2.0);
//        shout(12, "nice", 5.0);
//
//        Path path = Path.of("C:\\Programming\\Java_fstetler\\Testing\\src\\main\\java\\textFolder\\text.txt");
//
//        System.out.println(shout("nice", 0, 30.0));
    }

    public static <k, v, s> v shout (k thingToShout, v otherThingToShout, s lastThing) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout);
        System.out.println(lastThing);

        return otherThingToShout;
    }

}
