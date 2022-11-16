package oops.encapsulation.pkg2;
import oops.encapsulation.pkg1.Dog;
public class Human {
    public static void main(String[] args) {
        // object created from outside package because it was a public class
       Dog d = new Dog();
       d.walk();

       d.setLeg(2);
       d.getLeg(); 
       
       

       
      





    }
}
