import java.util.*;
import java.io.*;
import java.lang.*;

public class HCF2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
     System.out.print(gcd1(a,b));     

   }
   
   // RECURSION
   public static int gcd1(int a, int b){            
     if(b==0)  return a;          
     return gcd1(b, a%b);
   }

   public static int gcd2(int a, int b){            
     if(a%b==0)
        return b;  
     else                
        return gcd2(b, a%b);
   }
}
