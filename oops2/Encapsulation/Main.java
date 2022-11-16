package oops2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();

        // r.a = 10;
        // System.out.println(r.a);
        // error: The field RWOnly.a is not visible

        r.set(10);
        r.get();
    }
}
