package oops2.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Product p = new Product();
        
        System.out.println(p.product(4, 6));
        System.out.println(p.product(4, 6, 5));
        System.out.println(p.product(4.6, 6.6, 5.5));
    }
}

class Product{
    public int product(int x, int y){   
        return x*y;    

    }

    public int product(int x, int y, int z){   
        return x*y*z;    

    }

    public double product(double x, double y, double z){   
        return x*y*z;    

    }

}
