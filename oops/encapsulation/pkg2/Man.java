package oops.encapsulation.pkg2;
import oops.encapsulation.pkg1.Cat;

public class Man extends Cat {   // child class of Cat class which is outside package
    boolean tail = false;      // access protected directly      
    public static void main(String[] args) {
        Man c = new Man();   // access protected by making obj
        c.run();
    }
}
