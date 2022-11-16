package oops.encapsulation.pkg1;

public class Dog {
    private int leg = 4;

    public void getLeg(){  // getter
        System.out.println(leg+" legs");
    }

    public void setLeg(int leg){   // setter
        this.leg = leg;
    }
    public void walk(){
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.run();

    }
    
}
