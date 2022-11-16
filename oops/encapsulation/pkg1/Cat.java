package oops.encapsulation.pkg1;

public class Cat {
     protected void run(){
        System.out.println("running");
     }
     protected boolean tail = true;
     
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
        
     }
}
