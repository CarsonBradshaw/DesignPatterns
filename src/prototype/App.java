package prototype;

import prototype.prototypes.Prototype1;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype1 obj1 = new Prototype1();
        Object obj2 = obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);


    }
}
