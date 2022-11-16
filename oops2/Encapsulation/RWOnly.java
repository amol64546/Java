package oops2.Encapsulation;

public class RWOnly {
    private int a = 3;
    public void get(){
        System.out.println(a);

    }
    public void set(int a){
        this.a = a;
    }
}
