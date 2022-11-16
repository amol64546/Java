package oops2.Polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }

   
}

class A{
    void method(){
        System.out.println("Invoking method from class A ");
    }

}

class B extends A{
    void method(){
        System.out.println("Method is overridden in Extended class B");
    }
   

}


