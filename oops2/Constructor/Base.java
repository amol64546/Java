package oops2.Constructor;

public class Base {
    Base(){
        this(0);
        System.out.println("Calling default constructor of Base class");

    }
    Base(int x){
        System.out.println("Calling parameterized constructor of Base class with x equal to "+x);
    }
    
    public static void main(String[] args) {
        Derived d = new Derived(2);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Calling default constructor of Derived class");
    }
    Derived(int x){
        // super(0);  by default
        super(1);
        System.out.println("Calling parameterized constructor of Derived class with x equal to "+x);
    }
}
