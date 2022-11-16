package oops.inheritance;

public class Laptop {
     void coding(){
        System.out.println("coding");
    }
    public static void main(String[] args) {
        PC p = new PC();
        p.editing();

        // PC.editing(); or editing();   for static method
        
        //  Laptop.coding(); or coding();   for static method 
    }
}
