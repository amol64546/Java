import java.util.*;
import java.io.*;
import java.lang.*;

public class HCF2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
     System.out.println(gcd(a,b)); 
         int lcm = (a * b) / gcd;
       System.out.print(lcm);    

   }
   
   // RECURSION
   public static int gcd(int a, int b){            
     if(b==0)  return a;          
     return gcd1(b, a%b);
   }

   
}
