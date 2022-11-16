package oops.method_overloading;

public class Sum {
   
    
    int sum(int a, int b){
        return a + b;
    }
    double sum(int a, int b, int c){
        return a + b ;
    }
    double sum(double a, double b){
        return a + b;
    }
    double sum(int a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(5,6));  
        System.out.println(s.sum(5,6,6));
        System.out.println(s.sum(5.8,6.7));  
        System.out.println(s.sum(5,6.7)); 

        
       
    }
}
