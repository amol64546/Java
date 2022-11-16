package oops.method_overriding;

public class Car extends Vehicle{
    @Override // its an annotation
    void sound(){
        System.out.println("cars sound");
    }
}
