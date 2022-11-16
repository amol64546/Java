package oops2.Constructor;

public class Namaste {
    Namaste(){
        this("Single parameterized constructor");
        System.out.println("The default constructor says Namaste");
    }

    Namaste(String x){
        this("Single parameterized constructor","double parameterized constructor");
        System.out.println("Namaste from "+x);
    }

    Namaste(String x, String y){
        System.out.println("Namaste from "+y+" to "+x);
    }

    public static void main(String[] args) {
        Namaste n = new Namaste();
        
    }
}
